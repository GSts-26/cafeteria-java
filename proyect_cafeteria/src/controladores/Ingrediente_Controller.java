///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controladores;
//
//import com.formdev.flatlaf.FlatClientProperties;
//import java.util.ArrayList;
//import java.util.List;
//import javax.swing.JButton;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
//import modelos.DAO.DaoProductoImpl;
//import modelos.Entidades.producto;
//import vistas.Ingredientes;
//
///**
// *
// * @author SENA
// */
//public class Ingrediente_Controller {
//      private final Ingredientes vista;
//    private DaoProductoImpl productoDAO;
//    private DefaultTableModel modeloProductos;
//    private int ProductosContador;
//    private List<producto> productos = new ArrayList<>();
//    private List<Integer> ingredientes = new ArrayList<>();
//    JButton boton = new JButton();
//
//    public Ingrediente_Controller(Ingredientes vista) {
//        this.vista = vista;
//        this.productoDAO = new DaoProductoImpl();
//        this.ProductosContador = 0;
//    }
//
//    public void ingresar() {
//        producto producto = new producto(vista.txtprecio.getText(), (int) vista.txt_categoria.getSelectedItem(),vista.txtDescripcion.getText(), (Integer.parseInt(vista.txtprecio.getText())), ingredientes);
//        productoDAO.insertar(producto);
//        JOptionPane.showMessageDialog(null, "Producto Ingresado");
//        mostrar();
//    }
//    
//    public void mostrar() {
//    modeloProductos = (DefaultTableModel) vista.tabla_producto.getModel();
//    boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-20.png")));
//    boton.putClientProperty(FlatClientProperties.STYLE, "arc: 50");
//    modeloProductos.setRowCount(0);
//    ProductosContador = 0;
//    List<producto> productos = productoDAO.listar();
//    if (productos.isEmpty()) {
//        vista.no_hay_productos.setVisible(true);
//        System.out.println("No hay productos en la base de datos.");
//    } else {
//        vista.no_hay_productos.setVisible(false);
//        for (producto Producto : productos) {
//            ProductosContador++;
//            modeloProductos.addRow(new Object[]{
//                Producto.getId(),
//                Producto.getNombre(),
//                Producto.getCategorias(),
//                Producto.getDescripcion(),
//                Producto.getPrecio(),
//                Producto.getIdIngredientes(),
//                boton
//            });
//        }
//        vista.contar_productos.setText(String.valueOf(ProductosContador));
//    }
//}
//
//    public void Acciones_tabla() {
//    int columna = vista.tabla_producto.getSelectedColumn();
//    int fila = vista.tabla_producto.getSelectedRow();
//
//    if (columna == 6) {
//        Long idEliminar = Long.parseLong(vista.tabla_producto.getValueAt(fila, 0).toString());
//        productoDAO.eliminar(idEliminar);
//        JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente");
//        mostrar();
//    }
//}
//}
