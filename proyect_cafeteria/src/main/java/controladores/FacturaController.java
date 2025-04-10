package controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import modelos.Bd.conexion;
import modelos.DAO.DaoClienteImpl;
import modelos.DAO.DaoEmpleado;
import modelos.DAO.DaoFactura;
import modelos.DAO.DaoProductoImpl;
import modelos.DAO.EscuchadorCarroCompras;
import modelos.Entidades.Cliente;
import modelos.Entidades.Empleado;
import modelos.Entidades.detalleVenta;
import modelos.Entidades.producto;
import modelos.Entidades.ventas;
import vistas.Panel_factura;

public class FacturaController implements EscuchadorCarroCompras {

    private final Panel_factura vistaFactura;
    private DefaultTableModel modeloTabla;
    private DefaultTableModel modeloTablaDetalle;
    private final DaoFactura daoFactura;
    private final DaoClienteImpl daoClienteImpl;
    private final DaoEmpleado daoEmpleado;
    private final DaoProductoImpl daoProducto;
    private List<Cliente> listaCliente = new ArrayList<>();
    private List<Empleado> listaEmpleado = new ArrayList<>();
    private List<ventas> listaVentas = new ArrayList<>();
    private List<detalleVenta> listaDetalleVenta = new ArrayList<>();
    private List<producto> listaProducto = new ArrayList<>();

    private final JButton botonVer = new JButton();
    private final JButton botonEliminar = new JButton();
    private String nombreCliente = null;
    private String generoCliente = null;
    private String nombreEmpleado = null;

    private void estilosBotones() {
        botonVer.setIcon(new ImageIcon(getClass().getResource("/imagenes/ver factura.png")));
        botonEliminar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-trash-30.png")));
        botonEliminar.setBorder(BorderFactory.createEmptyBorder());
        botonVer.setBorder(BorderFactory.createEmptyBorder());
    }

//    private Cliente cliente;
    public FacturaController(Panel_factura vistaFactura) {
        this.vistaFactura = vistaFactura;
        this.daoFactura = new DaoFactura();
        this.daoClienteImpl = new DaoClienteImpl();
        this.daoEmpleado = new DaoEmpleado();
        this.daoProducto = new DaoProductoImpl();
        EventBus.subscribirseCarroCompras(this);
    }

    private void ComboFechaSeleccionada() {
        vistaFactura.boton_filtar_fecha.setVisible(true);
        vistaFactura.FechaInicio.setVisible(true);
        vistaFactura.FechaFin.setVisible(true);
        vistaFactura.txt_filtrado.setVisible(false);
    }

    private void ComboOtroSeleccionado() {
        vistaFactura.boton_filtar_fecha.setVisible(false);
        vistaFactura.FechaInicio.setVisible(false);
        vistaFactura.FechaFin.setVisible(false);
        vistaFactura.txt_filtrado.setVisible(true);

    }

    private void ObtenerDatoCliente(long cedula) {
        Cliente cli = listaCliente.stream().filter(cliente -> cliente.getCedula() == cedula)
                .findFirst()
                .orElse(null);
        if (cli != null) {
            vistaFactura.cedula_cliente.setText(String.valueOf(cedula));
            vistaFactura.nombre_cliente.setText(cli.getNombre());
            vistaFactura.genero_cliente.setText(cli.getGenero());
        }
    }

    private void ObtenerDatoEmpleado(long cedula) {
        Empleado emple = listaEmpleado.stream().filter(empleado -> empleado.getCedula() == cedula).
                findFirst().
                orElse(null);
        if (emple != null) {
            vistaFactura.nombre_empleado.setText(emple.getNombre());
            vistaFactura.cedula_empleado.setText(String.valueOf(cedula));
        }
    }

    public void ocultarCampos() {
        vistaFactura.boton_filtar_fecha.setVisible(false);
        vistaFactura.FechaInicio.setVisible(false);
        vistaFactura.FechaFin.setVisible(false);
        vistaFactura.ms_fechas.setVisible(false);

    }

    public void ComboSeleccionado() {
        String seleccionado = vistaFactura.combo_filtro.getSelectedItem().toString();
        if (seleccionado.equalsIgnoreCase("fecha")) {
            ComboFechaSeleccionada();
        } else {
            ComboOtroSeleccionado();
            vistaFactura.FechaInicio.setDate(null);
            vistaFactura.FechaFin.setDate(null);
            rellenarTablaVentas();
        }
    }

    public void listarCliente() {
        listaCliente = daoClienteImpl.listar();
    }

    public void listarEmpleado() {
        listaEmpleado = daoEmpleado.listar();
    }

    public void VerificarTablaLlena() {
        if (vistaFactura.tabla_factura.getRowCount() == 0) {
            vistaFactura.panelFacVacia.setVisible(true);
        } else {
            vistaFactura.panelFacVacia.setVisible(false);
        }
    }

    public void verDetalleFactura() {
        // creacion de map para obtener los datos del producto 
        Map<Integer, producto> mapaProductos = new HashMap<>();
        for (producto producto : listaProducto) {
            mapaProductos.put(producto.getId(), producto);
        }
        int columna = vistaFactura.tabla_factura.getSelectedColumn();
        if (columna == 5 && listaDetalleVenta != null) {
            this.mostrarLabelsDetalleFactura();
            modeloTablaDetalle = (DefaultTableModel) vistaFactura.tabla_detalle_factura.getModel();
            modeloTablaDetalle.setRowCount(0);
            int fila = vistaFactura.tabla_factura.getSelectedRow();
            int idVenta = Integer.parseInt(modeloTabla.getValueAt(fila, 0).toString());
            long cedulaCliente = Long.parseLong(modeloTabla.getValueAt(fila, 1).toString());
            long cedulaEmpleado = Long.parseLong(modeloTabla.getValueAt(fila, 2).toString());
            String fecha = modeloTabla.getValueAt(fila, 3).toString();
            String total = modeloTabla.getValueAt(fila, 4).toString();
            // validar si la columna seleccionada es la 5 y ocultar el panel de detalle factura

            ObtenerDatoCliente(cedulaCliente);
            ObtenerDatoEmpleado(cedulaEmpleado);
            vistaFactura.fecha_factura.setText(fecha);
            vistaFactura.numero_factura.setText(String.valueOf(idVenta));
            vistaFactura.total.setText(total);
            vistaFactura.panelDetalleVacio.setVisible(false);
            for (detalleVenta Detalleventa : listaDetalleVenta) {
                if (Detalleventa.getId() == idVenta) {
                    producto prod = mapaProductos.get(Detalleventa.getIdProducto());
                    if (prod != null) {
                        modeloTablaDetalle.addRow(new Object[]{
                            prod.getNombre(),
                            Detalleventa.getCantidad(),
                            prod.getPrecio(),
                            prod.getPrecio() * Detalleventa.getCantidad()});
                    }
                }
            }

        } else {
            vistaFactura.panelDetalleVacio.setVisible(true);

        }
    }

    public void listarProductosCompra() {
        listaDetalleVenta = daoFactura.obtenerProductos();
    }

    public void listarProductos() {
        listaProducto = daoProducto.listar();
    }

    public void rellenarTablaVentas() {
        modeloTabla = (DefaultTableModel) vistaFactura.tabla_factura.getModel();
        estilosBotones();
        modeloTabla.setRowCount(0);
        listaVentas = daoFactura.Obtenerventas();
        for (ventas listaVenta : listaVentas) {
            modeloTabla.addRow(new Object[]{
                listaVenta.getId(),
                listaVenta.getCliente(),
                listaVenta.getEmpleado(),
                listaVenta.getFecha(),
                listaVenta.getValorTotal(),
                botonVer,
                botonEliminar});
        }
    }

    public void rellenarTablaVentasFiltrado() {
        String ced = vistaFactura.txt_filtrado.getText();
        if (ced.isEmpty()) {
            rellenarTablaVentas();
        } else {
            System.out.println("rellenando tabla con filtrado");
            modeloTabla = (DefaultTableModel) vistaFactura.tabla_factura.getModel();
            estilosBotones();
            modeloTabla.setRowCount(0);
            if (vistaFactura.combo_filtro.getSelectedItem().equals("Cliente")) {
                listaVentas = daoFactura.filtradoPorCliente(ced);
                for (ventas listaVenta : listaVentas) {
                    modeloTabla.addRow(new Object[]{
                        listaVenta.getId(),
                        listaVenta.getCliente(),
                        listaVenta.getEmpleado(),
                        listaVenta.getFecha(),
                        listaVenta.getValorTotal(),
                        botonVer,
                        botonEliminar});
                }
            } else if (vistaFactura.combo_filtro.getSelectedItem().equals("Empleado")) {
                listaVentas = daoFactura.filtradoPorEmpleado(ced);
                for (ventas listaVenta : listaVentas) {
                    modeloTabla.addRow(new Object[]{
                        listaVenta.getId(),
                        listaVenta.getCliente(),
                        listaVenta.getEmpleado(),
                        listaVenta.getFecha(),
                        listaVenta.getValorTotal(),
                        botonVer,
                        botonEliminar});
                }
            }

        }

    }

    public boolean fechasVacias() {
        boolean vacias = false;
        if (vistaFactura.FechaInicio.getDate() == null || vistaFactura.FechaFin.getDate() == null) {
            vistaFactura.ms_fechas.setVisible(true);
            vacias = true;
        }
        return vacias;
    }

    public void filtarFechaVenta() {

        if (fechasVacias()) {
            vistaFactura.ms_fechas.setVisible(true);
            return;
        }
        vistaFactura.ms_fechas.setVisible(false);
        modeloTabla = (DefaultTableModel) vistaFactura.tabla_factura.getModel();
        estilosBotones();
        modeloTabla.setRowCount(0);
        Date fechaIni = vistaFactura.FechaInicio.getDate();
        Date fechaFin = vistaFactura.FechaFin.getDate();
        listaVentas = daoFactura.ObtenerVentaPorFecha(fechaIni, fechaFin);
        for (ventas listaVenta : listaVentas) {
            modeloTabla.addRow(new Object[]{
                listaVenta.getId(),
                listaVenta.getCliente(),
                listaVenta.getEmpleado(),
                listaVenta.getFecha(),
                listaVenta.getValorTotal(),
                botonVer,
                botonEliminar});
        }
    }

//    public void filtarPorCliente(){
//        
//    }
//    public void filtarPorEmpleado(){
//        
//    }
    public void ocultarLabelsDetalleFactura() {
        vistaFactura.cedula_cliente.setVisible(false);
        vistaFactura.nombre_cliente.setVisible(false);
        vistaFactura.genero_cliente.setVisible(false);
        vistaFactura.cedula_empleado.setVisible(false);
        vistaFactura.nombre_empleado.setVisible(false);
        vistaFactura.numero_factura.setVisible(false);
        vistaFactura.fecha_factura.setVisible(false);
        vistaFactura.total.setVisible(false);
    }

    private void mostrarLabelsDetalleFactura() {
        vistaFactura.cedula_cliente.setVisible(true);
        vistaFactura.nombre_cliente.setVisible(true);
        vistaFactura.genero_cliente.setVisible(true);
        vistaFactura.cedula_empleado.setVisible(true);
        vistaFactura.nombre_empleado.setVisible(true);
        vistaFactura.numero_factura.setVisible(true);
        vistaFactura.fecha_factura.setVisible(true);
        vistaFactura.total.setVisible(true);
    }

    @Override
    public void EscuchadorCarroCompras() {
        try {
            System.out.println("Rellenando la tabla de ventas con el escuchador carro compra");
            listarProductosCompra();
            listarProductos();
            rellenarTablaVentas();
            

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
