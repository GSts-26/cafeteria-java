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
import modelos.DAO.DaoIngredienteImpl;
import modelos.Entidades.Ingrediente;
import vistas.Ingredientes;

/**
 *
 * @author SENA
 */
public class Ingrediente_Controller {
    private final Ingredientes vista;
    private DaoIngredienteImpl IngredienteDAO;
    private DefaultTableModel modeloIngrediente;
    private int ingredientesContador;
    private List<Ingrediente> ListaIngrediente = new ArrayList<>();
    JButton boton = new JButton();

    public Ingrediente_Controller(Ingredientes vista) {
        this.vista = vista;
        this.IngredienteDAO = new DaoIngredienteImpl();
        this.ingredientesContador = 0;
    }

    public void ingresar() {
        Ingrediente ingrediente = new Ingrediente(vista.txtNombre.getText(),(int) vista.txtcalorias.getValue(),(int)vista.txtCarbo.getValue(),(int)vista.txtAzucar.getValue(),(int)vista.txtproteinas.getValue());;
        IngredienteDAO.insertar(ingrediente);
        JOptionPane.showMessageDialog(null, "Ingrediente Ingresado");
        mostrar();
    }
    
    public void mostrar() {
    modeloIngrediente = (DefaultTableModel) vista.T_Ingrediente.getModel();
    boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-20.png")));
    boton.putClientProperty(FlatClientProperties.STYLE, "arc: 50");
    modeloIngrediente.setRowCount(0);
    ingredientesContador = 0;
     ListaIngrediente = IngredienteDAO.listar();
    if (ListaIngrediente.isEmpty()) {
        vista.advertencia.setVisible(true);
        System.out.println("No hay ingredientes en la base de datos.");
    } else {
        vista.advertencia.setVisible(false);
        for (Ingrediente ingrediente : ListaIngrediente) {
            ingredientesContador++;
            modeloIngrediente.addRow(new Object[]{
                ingrediente.getId(),
                ingrediente.getNombre(),
                boton
            });
        }
        vista.contadornumero.setText(String.valueOf(ingredientesContador));
    }
}

//    public void Acciones_tabla() {
//    int columna = vista.tabla_producto.getSelectedColumn();
//    int fila = vista.tabla_producto.getSelectedRow();
//
//    if (columna == 6) {
//        Long idEliminar = Long.parseLong(vista.tabla_producto.getValueAt(fila, 0).toString());
//        IngredienteDAO.eliminar(idEliminar);
//        JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente");
//        mostrar();
//    }
//}

}
