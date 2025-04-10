package controladores;

import com.formdev.flatlaf.FlatClientProperties;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.DAO.DaoCategoria;

import modelos.DAO.DaoIngredienteImpl;
import modelos.DAO.DaoProductoImpl;
import modelos.DAO.EscuchadorIngrediente;
import modelos.DAO.EscuchadorProducto;
import modelos.Entidades.Ingrediente;
import modelos.Entidades.categoria;
import modelos.Entidades.producto;
import vistas.panel_productos;

/**
 *
 * @author Admin
 */
public class productoController implements EscuchadorProducto, EscuchadorIngrediente {

    private panel_productos vista;
    private DaoProductoImpl productoDAO;
    private DaoIngredienteImpl IngredienteDAO;
    private DaoCategoria categoriaDAO;

    private DefaultTableModel modeloProductos;
    private DefaultTableModel modeloingredientes;
    private int ProductosContador;

    private List<producto> productos = new ArrayList<>();
    private List<categoria> categoria = new ArrayList<>();
    private ArrayList<String> listaIds = new ArrayList<>();

    //private List<Integer> ingredientes = new ArrayList<>();
    JButton botonVer = new JButton();
    JButton botonEditar = new JButton();
    JButton botonBorrar = new JButton();

    public productoController(panel_productos vista) {
        this.vista = vista;
        this.productoDAO = new DaoProductoImpl();
        this.IngredienteDAO = new DaoIngredienteImpl();
        this.categoriaDAO = new DaoCategoria();
        this.ProductosContador = 0;
        EventBus.SubscribirseProducto(this);
        EventBus.SubscribirseIngrediente(this);

    }

    public void ingresar(ArrayList<Integer> ingredientes, String url) {
        String textoSinFormato = vista.txtprecio.getText().replaceAll("[^\\d]", "");
        modeloingredientes = (DefaultTableModel) vista.T_ingredientes.getModel();
        // verificar que no exista un producto con el mismo nombre
        for (producto producto1 : productos) {
            if (producto1.getNombre().equalsIgnoreCase(vista.txtNombre.getText())) {
                JOptionPane.showMessageDialog(null, "Existe un producto con ese nombre", "Error", JOptionPane.ERROR_MESSAGE);
                vista.txtNombre.setText("");
                vista.txtNombre.requestFocus();
                return;
            }
        }
        if (tablaIngreVacia()) {
            vista.AgregarIngredientes.setSize(374, 370);
            vista.AgregarIngredientes.setLocationRelativeTo(null);
            rellenar_Combo_Ingredientes();
            vista.AgregarIngredientes.setVisible(true);
        } else {

            String id = vista.txt_categoria.getSelectedItem().toString();
            String ids = id.split(" - ")[0];
            producto producto = new producto();
            producto.setNombre(vista.txtNombre.getText());
            producto.setId(Integer.parseInt(ids));
            producto.setDescripcion(vista.txtDescripcion.getText());
            producto.setPrecio(Integer.parseInt(textoSinFormato));
            producto.setCantidad(Integer.parseInt(vista.txtCantidad.getValue().toString()));
            producto.setStock(Integer.parseInt(vista.txtStock.getValue().toString()));
            producto.setIdIngredientes(ingredientes);
            producto.setImagen(transformar_imagen());
            producto.setId_img(vista.publicId);

            productoDAO.insertar(producto);
            limpiarCampos();
            // metodo que envia una alerta cuando se ingresa un producto
            EventBus.PublishProducto();
            mostrar();
            JOptionPane.showMessageDialog(null, "Producto Ingresado");

        }
        vista.imagenpro.setIcon(null);
    }

    public void filtrar(String nombre) {
        modeloProductos = (DefaultTableModel) vista.tabla_producto.getModel();
        estilosBotones();
        modeloProductos.setRowCount(0);
        ProductosContador = 0;
        productos = productoDAO.filtrarProducto(nombre);
        if (productos.isEmpty()) {
            vista.no_hay_productos.setVisible(true);
            System.out.println("No hay productos en la base de datos.");
        } else {
            vista.no_hay_productos.setVisible(false);
            for (producto Producto : productos) {
                ProductosContador++;
                System.out.println(Producto.getNombre());
                modeloProductos.addRow(new Object[]{
                    Producto.getId(),
                    Producto.getNombre(),
                    Producto.getCategoria(),
                    Producto.getPrecio(),
                    Producto.getCantidad(),
                    botonVer,
                    botonEditar,
                    botonBorrar
                });
            }

            vista.contar_productos.setText(String.valueOf(ProductosContador));
        }
    }

    private boolean tablaIngreVacia() {
        boolean vacia = false;
        if (modeloingredientes.getRowCount() <= 0) {
            JOptionPane.showMessageDialog(null, "No puedes dejar vacia la tabla de ingredientes", "Error", JOptionPane.ERROR_MESSAGE);
            vacia = true;
        }
        return vacia;

    }

//  botones para editar y eliminar
    private void estilosBotones() {
        botonEditar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-edit-30.png")));
        botonVer.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-eye-30.png")));
        botonBorrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-trash-30.png")));
        botonBorrar.setBorder(BorderFactory.createEmptyBorder());
        botonEditar.setBorder(BorderFactory.createEmptyBorder());
        botonVer.setBorder(BorderFactory.createEmptyBorder());
    }

    // rellenar la tabla con los datos del producto
    public void mostrar() {
        modeloProductos = (DefaultTableModel) vista.tabla_producto.getModel();
        estilosBotones();
        modeloProductos.setRowCount(0);
        ProductosContador = 0;
        productos = productoDAO.listar();
        if (productos.isEmpty()) {
            vista.no_hay_productos.setVisible(true);
            System.out.println("No hay productos en la base de datos.");
        } else {
            vista.no_hay_productos.setVisible(false);
            for (producto Producto : productos) {
                ProductosContador++;
                modeloProductos.addRow(new Object[]{
                    Producto.getId(),
                    Producto.getNombre(),
                    Producto.getCategoria(),
                    Producto.getPrecio(),
                    Producto.getCantidad(),
                    //                    Producto.getStock(),
                    //                    Producto.getDescripcion(),
                    botonVer,
                    botonEditar,
                    botonBorrar
                });
            }
            vista.contar_productos.setText(String.valueOf(ProductosContador));
        }
    }
    int idprodu = 0;

// metodo para cambiar el boton de actualizar por el de crear un nuevo producto
    private void nuevoProducto() {
        vista.boton_actualizar.setVisible(false);
        vista.boton_crear.setVisible(true);
        vista.lblNombre.setText("Nuevo Producto");
    }

    // rellenar todos los campos cuando se va a actualizar un producto
    public void rellenarActualizar() {

        Map<Integer, Ingrediente> ingredientesMap = new HashMap<>();
        // recorrer la lista de ingredientes y agregar el id del ingrediente y el objeto ingrediente
        IngredienteDAO.listar().forEach(ingrediente -> ingredientesMap.put(ingrediente.getId(), ingrediente));

        // Obtener los datos de la fila seleccionada
        DefaultTableModel modelo1 = (DefaultTableModel) vista.T_ingredientes.getModel();
        int fila = vista.tabla_producto.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) vista.tabla_producto.getModel();
        idprodu = Integer.parseInt(vista.tabla_producto.getValueAt(fila, 0).toString());
        String nombre = modelo.getValueAt(fila, 1).toString();
        String categoria = modelo.getValueAt(fila, 2).toString();
        String precio = modelo.getValueAt(fila, 3).toString();
        String cantidad = modelo.getValueAt(fila, 4).toString();

        // rellenar los campos del producto para poder modificarlos
        double precioDoble = Double.parseDouble(precio);
        String precioFormateado = (precioDoble % 1 == 0) ? String.valueOf((int) precioDoble) : String.valueOf(precioDoble);
        vista.boton_actualizar.setVisible(true);
        vista.boton_crear.setVisible(false);
        vista.lblNombre.setText("Actualizar producto");
        vista.txtInfoNombre.setText(nombre);
        vista.txtNombre.setText(nombre);
        vista.txtprecio.setText(precioFormateado);
        vista.TxtInfoPrecio.setText(precioFormateado);

        for (categoria cate : this.categoria) {
            if (cate.getId() == Integer.parseInt(categoria)) {
                vista.txt_categoria.setSelectedItem(cate.getId() + " - " + cate.getNombre());
            }
        }

        vista.txtCantidad.setValue(Integer.parseInt(cantidad));

        // obtener el string que viene desde productoDao
        String[] idsIngredientes = productoDAO.obtenerIdIngredientes(idprodu).replace("{", "").replace("}", "").replace("\"", "").trim().split(",");

        // remplazar las llaves por espacio vacio y separarlo por comas
        listaIds.clear();
        listaIds.addAll(Arrays.asList(idsIngredientes));

        // recorrer la lista de productos y verificar si el id seleccionado concide con el de la lista
        modelo1.setRowCount(0);

        int idIngre = 0;

        // recorremos la lista de tipo producto 
        //luego se compara los ids de la lista con el id que fue seleccionado
        for (producto prod : productoDAO.listar()) {
            estilosBotones();
            if (prod.getId() == idprodu) {
                vista.txtDescripcion.setText(prod.getDescripcion());
                vista.txtStock.setValue(prod.getStock());
                try {
                    long init = System.currentTimeMillis();
                    URL url;
                    url = new URL(prod.getImagen());
                    ImageIcon imageIcon = new ImageIcon(url);
                    long fin = System.currentTimeMillis();
                    System.out.println(init - fin + "ms");
                    vista.imagenpro.setIcon(imageIcon);
                } catch (MalformedURLException ex) {
                    System.out.println(ex);
                }
                for (String i : listaIds) {
                    // tratar de convertir el string a numero
                    try {
                        idIngre = Integer.parseInt(i);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    Ingrediente ing = ingredientesMap.get(idIngre);
                    if (ing != null) {
                        modelo1.addRow(new Object[]{
                            i, ing.getNombre(), botonBorrar});
                    }
                }
            }
        }
    }

    public String transformar_imagen() {
        String cloudName = "ddc47jehx";  // Reemplaza esto con tu nombre de Cloudinary
        String transformedUrl = "https://res.cloudinary.com/" + cloudName + "/image/upload/q_auto/f_auto/r_12,c_fill,h_110,w_120/" + vista.imagenUrl.split("/")[vista.imagenUrl.split("/").length - 1];
        return transformedUrl;
    }

    // metodo para actualizar los datos del producto...
    public void actualizar(ArrayList<Integer> ingredientes) {
        modeloingredientes = (DefaultTableModel) vista.T_ingredientes.getModel();
        String id = vista.txt_categoria.getSelectedItem().toString();
        String ids = id.split(" - ")[0];
        if (tablaIngreVacia()) {
            return;
        }
        producto producto = new producto();
        producto.setNombre(vista.txtNombre.getText());
        producto.setId(Integer.parseInt(ids));
        producto.setDescripcion(vista.txtDescripcion.getText());
        producto.setPrecio(Double.parseDouble(vista.txtprecio.getText()));
        producto.setCantidad(Integer.parseInt(vista.txtCantidad.getValue().toString()));
        producto.setStock(Integer.parseInt(vista.txtStock.getValue().toString()));
        producto.setIdIngredientes(ingredientes);
//        producto.setImagen(transformar_imagen());
        producto.setId_img(vista.publicId);

        int filaAfectada = productoDAO.actualizar(producto, idprodu);

        if (filaAfectada > 0) {
            nuevoProducto();
            limpiarCampos();
            mostrar();
            EventBus.PublishProducto();
            JOptionPane.showMessageDialog(null, "Producto Actualizado");

        } else {
            System.out.println("No se modifico los datos del producto");
        }

    }

    public void Acciones_tabla() {
        int columna = vista.tabla_producto.getSelectedColumn();
        int fila = vista.tabla_producto.getSelectedRow();
        // editar
        if (columna == 6) {
            rellenarActualizar();

            // eliminar
        } else if (columna == 7) {
            Long idEliminar = Long.valueOf(vista.tabla_producto.getValueAt(fila, 0).toString());
            productoDAO.eliminar(idEliminar);
            mostrar();
            JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente");
        }

    }

    // quitar ingrediente de un producto
    public void eliminaringrediente() {
        DefaultTableModel modelo = (DefaultTableModel) vista.T_ingredientes.getModel();
        int fila = vista.T_ingredientes.getSelectedRow();
        int columna = vista.T_ingredientes.getSelectedColumn();
        int idIngrediente = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
        if (columna == 2) {
            System.out.println("Fila eliminada correctamente...");
            modelo.removeRow(vista.T_ingredientes.getSelectedRow());
        }

    }

    // Ingresar los ingredientes al comboBox
    public void rellenar_Combo_Ingredientes() {
        vista.comboIngredientes.removeAllItems();
        IngredienteDAO.listar().forEach(ingrediente -> {
            vista.comboIngredientes.addItem(ingrediente);
        });
    }

    // Ingresar las categorias al comboBox
    private void rellenar_combo_categoria() {
        categoria = categoriaDAO.listar();
        if (!categoria.isEmpty()) {
            vista.txt_categoria.removeAllItems();
            categoria.forEach(catego -> {
                // Imprimir el ID de cada categoria
                System.out.println("ID: " + catego.getId());

                // Añadir al comboBox
                vista.txt_categoria.addItem(String.valueOf(catego.getId() + " - " + catego.getNombre()));
            });

        }
    }

//    public void actualizarCombo() {
//        rellenar_combo_categoria();
//    }
// Obtenemos el campo selecionado en el combobobox y se agrega a la tabla de ingredientes para el producto
    public void agregar_Ingredientes() {
        modeloingredientes = (DefaultTableModel) vista.T_ingredientes.getModel();
        Ingrediente sele = (Ingrediente) vista.comboIngredientes.getSelectedItem();
        modeloingredientes.addRow(new Object[]{
            sele.getId(),
            sele.getNombre(),
            botonBorrar
        });

    }

    public void limpiarCampos() {
        nuevoProducto();
        vista.txtNombre.setText("");
        vista.txtprecio.setText("");
        vista.txtDescripcion.setText("");
        vista.txtCantidad.setValue(0);
        vista.txtStock.setValue(0);
        vista.TxtInfoPrecio.setText("$0.0");
        vista.txtInfoNombre.setText("Nombre Producto");
        modeloingredientes = (DefaultTableModel) vista.T_ingredientes.getModel();
        modeloingredientes.setNumRows(0);
        vista.imagenpro.setIcon(null);
    }

    public void ocultarMensajes() {
        vista.m1NombreVacio2.setVisible(false);
        vista.m4PrecioVacio.setVisible(false);
        vista.m5CantidadVacio.setVisible(false);
    }

    public boolean verificarCamposVacios() {
        int numero = 0;
        boolean ok = true;
        if (vista.txtNombre.getText().isEmpty()) {
            vista.m1NombreVacio2.setVisible(true);
            ok = false;
        } else {
            vista.m1NombreVacio2.setVisible(false);
        }
        if (vista.txtprecio.getText().isEmpty()) {
            vista.m4PrecioVacio.setVisible(true);
            ok = false;
        } else {
            vista.m4PrecioVacio.setVisible(false);
        }
        if (vista.txtCantidad.getValue().equals(numero)) {
            vista.m5CantidadVacio.setVisible(true);
            ok = false;
        } else {
            vista.m5CantidadVacio.setVisible(false);
        }
        return ok;
    }

    public boolean datosIncorrectos() {
        boolean ok = true;
        for (int i = 0; i < vista.txtNombre.getText().length(); i++) {

            if (!vista.txtNombre.getText().isEmpty() && Character.isDigit(vista.txtNombre.getText().charAt(i))) {
                vista.txtNombre.setText("");
                vista.txtNombre.requestFocus();
                ok = false;
            }
        }
        return ok;
    }

    // metodos par el dialog de agregar ingredientes cuando no hay
    public void ocultarMensajeIngredientes() {
        vista.m1NombreVacio.setVisible(false);
        vista.m2CalVacio.setVisible(false);
        vista.m3CarboVacio.setVisible(false);
        vista.m4AzucarVacio.setVisible(false);
        vista.m5ProteVacio.setVisible(false);
    }

    public void limpiarIngredientes() {
        vista.txtNombre.setText("");
        vista.txtAzucar.setText("");
        vista.txtCarbo.setText("");
        vista.txtcalorias.setText("");
        vista.txtproteinas.setText("");
    }

    public boolean campoVacioIngrediente() {

        if (vista.txtNombre.getText().isEmpty()) {
            vista.m1NombreVacio.setVisible(true);
            vista.txtNombre.requestFocus();
            return false;
        } else {
            vista.m1NombreVacio.setVisible(false);
        }

        if (vista.txtcalorias.getText().isEmpty()) {
            vista.m2CalVacio.setVisible(true);
            vista.txtcalorias.requestFocus();
            return false;
        } else {
            vista.m2CalVacio.setVisible(false);
        }

        if (vista.txtCarbo.getText().isEmpty()) {
            vista.m3CarboVacio.setVisible(true);
            vista.txtCarbo.requestFocus();
            return false;
        } else {
            vista.m3CarboVacio.setVisible(false);
        }

        if (vista.txtAzucar.getText().isEmpty()) {
            vista.m4AzucarVacio.setVisible(true);
            vista.txtAzucar.requestFocus();
            return false;
        } else {
            vista.m4AzucarVacio.setVisible(false);
        }

        if (vista.txtproteinas.getText().isEmpty()) {
            vista.m5ProteVacio.setVisible(true);
            vista.txtproteinas.requestFocus();
            return false;
        } else {
            vista.m5ProteVacio.setVisible(false);
        }

        // Si todos los campos están llenos, retornar verdadero
        return true;
    }

    public void IngresarIngrediente() {
        String nombreIngre = vista.txtNombreIngre.getText();
        int caloriasIngre = Integer.parseInt(vista.txtcalorias.getText());
        int carbosIngre = Integer.parseInt(vista.txtCarbo.getText());
        int azucarIngre = Integer.parseInt(vista.txtAzucar.getText());
        int proteIngre = Integer.parseInt(vista.txtproteinas.getText());
        Ingrediente ingre = new Ingrediente(nombreIngre, caloriasIngre, carbosIngre, proteIngre, azucarIngre);
        IngredienteDAO.insertar(ingre);
        limpiarIngredientes();
        rellenar_Combo_Ingredientes();
        // metodo que envia una notificacion cuando se crea un ingrediente
        EventBus.PublishIngrediente();
        JOptionPane.showMessageDialog(null, "Ingrediente Ingresado", "Ingresado", JOptionPane.INFORMATION_MESSAGE);

    }

    public void DatosIngreNoAdmitidos() {
        for (int i = 0; i < vista.txtNombreIngre.getText().length(); i++) {
            if (Character.isDigit(vista.txtNombreIngre.getText().charAt(i))) {
                vista.txtNombreIngre.setText("");
            }
        }
        for (int i = 0; i < vista.txtAzucar.getText().length(); i++) {
            if (!Character.isDigit(vista.txtAzucar.getText().charAt(i))) {
                vista.txtAzucar.setText("");
            }
        }
        for (int i = 0; i < vista.txtCarbo.getText().length(); i++) {
            if (!Character.isDigit(vista.txtCarbo.getText().charAt(i))) {
                vista.txtCarbo.setText("");
            }
        }
        for (int i = 0; i < vista.txtcalorias.getText().length(); i++) {
            if (!Character.isDigit(vista.txtcalorias.getText().charAt(i))) {
                vista.txtcalorias.setText("");
            }
        }
        for (int i = 0; i < vista.txtproteinas.getText().length(); i++) {
            if (!Character.isDigit(vista.txtproteinas.getText().charAt(i))) {
                vista.txtproteinas.setText("");
            }
        }

    }

    @Override
    public void EscuchadorProductoActivo() {
        try {
            rellenar_combo_categoria();
            mostrar();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void EscuchadorIngreActivo() {
        try {
            rellenarActualizar();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Entro al catch de escuchador ingrediente en producto controller linea 432");
        }

    }

    public void dias() {
        vista.nuevos.setText(productoDAO.contarproductosUltimos30Dias() + "");
    }
}
