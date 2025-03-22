/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import com.formdev.flatlaf.FlatClientProperties;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.DAO.DaoCategoria;

import modelos.DAO.DaoIngredienteImpl;
import modelos.DAO.DaoProductoImpl;
import modelos.Entidades.Ingrediente;
import modelos.Entidades.categoria;
import modelos.Entidades.producto;
import vistas.panel_productos;

/**
 *
 * @author Admin
 */
public class productoController {

    private final panel_productos vista;
    private DaoProductoImpl productoDAO;
    private DaoIngredienteImpl IngredienteDAO;
    private DaoCategoria categoriaDAO;

    private DefaultTableModel modeloProductos;
    private DefaultTableModel modeloingredientes;
    private int ProductosContador;

    private List<producto> productos = new ArrayList<>();
    private List<categoria> categoria = new ArrayList<>();
    //private List<Integer> ingredientes = new ArrayList<>();

    JButton boton = new JButton();

    public productoController(panel_productos vista) {
        this.vista = vista;
        this.productoDAO = new DaoProductoImpl();
        this.IngredienteDAO = new DaoIngredienteImpl();
        this.categoriaDAO = new DaoCategoria();
        this.ProductosContador = 0;

    }

    public void ingresar(ArrayList<Integer> ingredientes) {
        producto producto = new producto(vista.txtNombre.getText(), Integer.parseInt(vista.txt_categoria.getSelectedItem().toString()), vista.txtDescripcion.getText(), (Integer.parseInt(vista.txtprecio.getText())), Integer.parseInt(vista.txtCantidad.getValue().toString()), Integer.parseInt(vista.txtStock.getValue().toString()),
                ingredientes);
        productoDAO.insertar(producto);
        JOptionPane.showMessageDialog(null, "Producto Ingresado");

        mostrar();
    }

    public void mostrar() {
        modeloProductos = (DefaultTableModel) vista.tabla_producto.getModel();
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-20.png")));
        boton.putClientProperty(FlatClientProperties.STYLE, "arc: 50");
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
                    Producto.getCantidad(),
                    Producto.getStock(),
                    Producto.getDescripcion(),
                    Producto.getPrecio(),
                    boton
                });
            }
            vista.contar_productos.setText(String.valueOf(ProductosContador));
        }
    }

    public void Acciones_tabla() {
        int columna = vista.tabla_producto.getSelectedColumn();
        int fila = vista.tabla_producto.getSelectedRow();

        if (columna == 6) {
            Long idEliminar = Long.parseLong(vista.tabla_producto.getValueAt(fila, 0).toString());
            productoDAO.eliminar(idEliminar);
            JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente");
            mostrar();
        }
    }

    public void rellenar_Combo_Ingredientes() {

        vista.comboIngredientes.removeAllItems();
        IngredienteDAO.listar().forEach(ingrediente -> {
            vista.comboIngredientes.addItem(ingrediente);
        });
    }

    public void rellenar_combo_categoria() {
        categoria = categoriaDAO.listar();
        if (categoria.isEmpty()) {
            System.out.println("vacia");
        }
        vista.txt_categoria.removeAllItems();
        for (categoria categ : categoria) {
            vista.txt_categoria.addItem(String.valueOf(categ.getId()));

        }

    }

    public void agregar_Ingredientes() {
        modeloingredientes = (DefaultTableModel) vista.T_ingredientes.getModel();
        Ingrediente sele = (Ingrediente) vista.comboIngredientes.getSelectedItem();
        modeloingredientes.addRow(new Object[]{
            sele.getId(),
            sele.getNombre(),
            boton
        });
    }
}
