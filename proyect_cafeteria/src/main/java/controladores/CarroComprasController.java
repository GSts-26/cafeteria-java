/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import modelos.DAO.DaoProductoImpl;
import modelos.DAO.DaoClienteImpl;
import modelos.DAO.DaoIngredienteImpl;
import modelos.DAO.DaoCarro;
import modelos.DAO.DaoCategoria;
import modelos.DAO.DaoitemsCarro;
import modelos.Entidades.producto;
import modelos.Entidades.CarroCompras;
import modelos.Entidades.itemsCarro;
import vistas.compras;
import vistas.menu.producto_info;
import static controladores.metodo_login.usuariologeado;
import modelos.DAO.EscuchadorCarroCompras;

/**
 *
 * @author SENA
 */
public class CarroComprasController implements EscuchadorCarroCompras {

    private final compras vista; // Referencia a la interfaz gráfica
    private DaoProductoImpl ProductosDAO;
    private DaoIngredienteImpl IngredientesDAO;
    private DefaultTableModel modeloproductosCarro;
    private DaoClienteImpl ClienteDAO;
    private DaoitemsCarro Daoitems;
    private List<producto> ListaProductos = new ArrayList<>();
    private DaoCarro CarroDAO;
    private int carro;
    private DaoCategoria categoriaDao;
    private double total = 0;
    HashMap<Integer, Object> productosCarro = new HashMap<>();

    // Variables para almacenar información nutricional de los productos
    private int totalProteina = 0;
    private int totalazucar = 0;
    private int totalcalorias = 0;
    private int totalcarbohidratos = 0;
    private int idIngrente = 0;

    // Constructor que inicializa la vista y los DAOs
    public CarroComprasController(compras vista) {
        this.categoriaDao = new DaoCategoria();
        this.vista = vista;
        this.ProductosDAO = new DaoProductoImpl();
        this.IngredientesDAO = new DaoIngredienteImpl();
        this.ClienteDAO = new DaoClienteImpl();
        this.CarroDAO = new DaoCarro();
        this.Daoitems = new DaoitemsCarro();
        EventBus.subscribirseCarroCompras(this);

    }

    public void rellenarListaProducto() {
        this.ListaProductos = ProductosDAO.listar(); // Carga la lista de productos
    }

    // Llena la interfaz con los productos disponibles
    public void relenar_productos() {
        vista.contenido_producto.setLayout(new GridLayout(0, 4, 16, 16));
        rellenarListaProducto();
        vista.contenido_producto.removeAll();
        for (producto producto : ListaProductos) {

            vista.contenido_producto.add(new producto_info(producto, this.vista));

        }
        vista.contenido_producto.revalidate();
        vista.contenido_producto.repaint();
    }

    // Carga la lista de clientes en el combo de selección
    public void rellenarCliente() {
        ClienteDAO.listar().forEach(cliente -> {
            vista.comboClientes.addItem(cliente);
        });
    }

    public void rellenarCtaegorias() {
        vista.combocategoria.removeAllItems();
        categoriaDao.listar().forEach(cate -> {
            vista.combocategoria.addItem(cate);
        });
    }

    // Muestra los ingredientes de un producto y calcula su información nutricional
    public void MostrarIngredientes() {
        vista.Area_ingredientes.setText(""); // Limpia el área de ingredientes

        vista.p.getIdIngredientes().forEach(ids -> {
            IngredientesDAO.listar().forEach(nombreingrediente -> {
                if (ids == nombreingrediente.getId()) {
                    vista.Area_ingredientes.append("-" + nombreingrediente + "\n");
                    totalcalorias += nombreingrediente.getCalorias();
                    totalProteina += nombreingrediente.getProteinas();
                    totalcarbohidratos += nombreingrediente.getCarbohidratos();
                    totalazucar += nombreingrediente.getAzucar();
                }
            });
        });

        // Muestra la información nutricional en la interfaz
        vista.calorias.setText(totalcalorias + "(Kcal)");
        vista.carbo.setText(totalcarbohidratos + "(g)");
        vista.proteina.setText(totalProteina + "(g)");
        vista.Azucar.setText(totalazucar + "(g)");
    }

    //metodo que permite crear una nueva sesion de carrito
    public void nuevopedido() {
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                carro = CarroDAO.insertreturning(new CarroCompras(vista.ClienteSeleccionado.getCedula(), usuariologeado.getCedula(), true, 0.0));
                return null;
            }

            @Override
            protected void done() {
                vista.codigofactura.setText("CR" + carro);
            }
        }.execute(); // Se ejecuta en una sola línea

    }

    //metodo encargado de verificar si el empleado tiene un Carrito activo
    public void pedidoActivo() {
        DefaultTableModel modeloproductosCarro = (DefaultTableModel) vista.T_Productos.getModel();

        CarroCompras carroActivo;

        try {
            carroActivo = CarroDAO.activo(usuariologeado.getCedula());
            System.out.println(carroActivo);
        } catch (Exception e) {
            return;
        }

        // Validar carro
        if (carroActivo == null || carroActivo.getIdCarro() == 0) {
            actualizarVistaSinCarro();
            return;
        }
        this.carro = carroActivo.getIdCarro();

        actualizarVistaConCarro(carroActivo);

        // Procesar items del carro
        procesarItemsCarro(carroActivo, modeloproductosCarro);

    }

    private void actualizarVistaSinCarro() {
        SwingUtilities.invokeLater(() -> {
            vista.panel_crearOrden.setVisible(true);
            vista.Panel_pedidoActivo.setVisible(false);
        });
    }

    private void actualizarVistaConCarro(CarroCompras carro) {
        SwingUtilities.invokeLater(() -> {
            vista.panel_crearOrden.setVisible(false);
            vista.Panel_pedidoActivo.setVisible(true);
            vista.actualizarVistaCarro(carro);
        });
    }

    private void procesarItemsCarro(CarroCompras carro, DefaultTableModel modelo) {
        Map<?, ?> productosCarro;
        try {
            productosCarro = Daoitems.listar(carro.getIdCarro());
        } catch (Exception e) {
            return;
        }

        if (productosCarro == null || productosCarro.isEmpty()) {
            return;
        }

        SwingUtilities.invokeLater(() -> {

            productosCarro.values().stream()
                    .filter(obj -> obj instanceof itemsCarro)
                    .map(obj -> (itemsCarro) obj)
                    .forEach(item -> {
                        modelo.addRow(new Object[]{
                            item.getProductos_compra(),
                            item.getCantidad_producto(),
                            item.getTotal_item()
                        });

                        // Actualiza el total sumando (cantidad * precio)
                        total += item.getTotal_item();
                    });
            vista.totalnumero.setText("$" + total);
        });
    }

    //metodo que permite añadir un producto al Carro de compas
    public void agregarProducto() {
        modeloproductosCarro = (DefaultTableModel) vista.T_Productos.getModel();
        int cantidad = Integer.parseInt(vista.cantidad.getValue().toString());
        Double precioTotal = vista.p.getPrecio() * cantidad;

        if (productosCarro.containsKey(vista.p.getId())) {
            JOptionPane.showMessageDialog(null, "El producto ya está seleccionado, actualiza la cantidad");
            return;
        }

        productosCarro.put(vista.p.getId(), vista.p);
        vista.totalnumero.setText("$" + (total += precioTotal));
        modeloproductosCarro.addRow(new Object[]{vista.p.getNombre(), cantidad, precioTotal});

        // Inserción en la base de datos de manera asíncrona
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() {
                Daoitems.insertar(new itemsCarro(carro, vista.p.getId(), cantidad, precioTotal));
                return null;
            }
        }.execute();
    }

    //metodo que borra todo los productos de un carro de compras
    public void borrar_todo() {
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                Daoitems.eliminar((long) carro);
                return null;
            }

        }.execute();
        productosCarro.clear();
        modeloproductosCarro = (DefaultTableModel) vista.T_Productos.getModel();
        modeloproductosCarro.setRowCount(0);
    }

    public void OperacionBd() {
        Daoitems.TransaccionOperacional(carro);

        new Thread() {
            public void run() {

                EventBus.PublishCarroCompras();
                EventBus.PublishProducto();
            }
        }.start();

    }

    public double vueltos() {
        return Integer.parseInt(vista.monto.getText()) - total;
    }

    public void actualizar() {
        CarroDAO.actualizarValor((long) total, carro);
    }

    @Override
    public void EscuchadorCarroCompras() {

        try {
            relenar_productos();
            rellenarCtaegorias();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
