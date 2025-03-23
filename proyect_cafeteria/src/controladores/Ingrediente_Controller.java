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
import vistas.Agregar_ingredientes;
import vistas.Ingredientes;

/**
 *
 * @author SENA
 */
public class Ingrediente_Controller {

    private Ingredientes vista;
    private Agregar_ingredientes vista1;
    private DaoIngredienteImpl IngredienteDAO;
    private DefaultTableModel modeloIngrediente;
    private int ingredientesContador;
    private List<Ingrediente> ListaIngrediente = new ArrayList<>();
    JButton boton = new JButton();

    public Ingrediente_Controller(Agregar_ingredientes vista1) {
        this.vista1 = vista1;
        this.IngredienteDAO = new DaoIngredienteImpl();

    }

    public Ingrediente_Controller(Ingredientes vista) {
        this.vista = vista;
        this.IngredienteDAO = new DaoIngredienteImpl();
        this.ingredientesContador = 0;
    }

    public void ingresar() {
        Ingrediente ingrediente = new Ingrediente(vista.txtNombre.getText(), (int) vista.txtcalorias.getValue(), (int) vista.txtCarbo.getValue(), (int) vista.txtAzucar.getValue(), (int) vista.txtproteinas.getValue());;
        IngredienteDAO.insertar(ingrediente);
        JOptionPane.showMessageDialog(null, "Ingrediente Ingresado");
        mostrar();
    }

    public void ingresar1() {

        String nombre = vista1.txtNombre.getText();
        int calorias = Integer.parseInt(vista1.txtcalorias.getText());
        int carbohidrato = Integer.parseInt(vista1.txtCarbo.getText());
        int azucar = Integer.parseInt(vista1.txtAzucar.getText());
        int proteinas = Integer.parseInt(vista1.txtproteinas.getText());
        Ingrediente ingrediente = new Ingrediente(nombre, calorias, carbohidrato, azucar, proteinas);
        IngredienteDAO.insertar(ingrediente);
        JOptionPane.showMessageDialog(null, "Ingrediente Ingresado");
        this.limpiar();
//        mostrar();
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

    public void limpiar() {
        vista1.txtNombre.setText("");
        vista1.txtAzucar.setText("");
        vista1.txtCarbo.setText("");
        vista1.txtcalorias.setText("");
        vista1.txtproteinas.setText("");
    }

    public void ocultarM() {
        vista1.m1NombreVacio.setVisible(false);
        vista1.m2CalVacio.setVisible(false);
        vista1.m3CarboVacio.setVisible(false);
        vista1.m4AzucarVacio.setVisible(false);
        vista1.m5ProteVacio.setVisible(false);
    }

    public boolean campoVacio() {

        if (vista1.txtNombre.getText().isEmpty()) {
            vista1.m1NombreVacio.setVisible(true);
            vista1.txtNombre.requestFocus();
            return false;
        } else {
            vista1.m1NombreVacio.setVisible(false);
        }

        if (vista1.txtcalorias.getText().isEmpty()) {
            vista1.m2CalVacio.setVisible(true);
            vista1.txtcalorias.requestFocus();
            return false;
        } else {
            vista1.m2CalVacio.setVisible(false);
        }

        if (vista1.txtCarbo.getText().isEmpty()) {
            vista1.m3CarboVacio.setVisible(true);
            vista1.txtCarbo.requestFocus();
            return false;
        } else {
            vista1.m3CarboVacio.setVisible(false);
        }

        if (vista1.txtAzucar.getText().isEmpty()) {
            vista1.m4AzucarVacio.setVisible(true);
            vista1.txtAzucar.requestFocus();
            return false;
        } else {
            vista1.m4AzucarVacio.setVisible(false);
        }

        if (vista1.txtproteinas.getText().isEmpty()) {
            vista1.m5ProteVacio.setVisible(true);
            vista1.txtproteinas.requestFocus();
            return false;
        } else {
            vista1.m5ProteVacio.setVisible(false);
        }

        // Si todos los campos están llenos, retornar verdadero
        return true;
    }

    public void DatosNoAdmiditodos() {
        for (int i = 0; i < vista1.txtNombre.getText().length(); i++) {
            if (Character.isDigit(vista1.txtNombre.getText().charAt(i))) {
                vista1.txtNombre.setText("");
            }
        }
        for (int i = 0; i < vista1.txtAzucar.getText().length(); i++) {
            if (!Character.isDigit(vista1.txtAzucar.getText().charAt(i))) {
                vista1.txtAzucar.setText("");
            }
        }
        for (int i = 0; i < vista1.txtCarbo.getText().length(); i++) {
            if (!Character.isDigit(vista1.txtCarbo.getText().charAt(i))) {
                vista1.txtCarbo.setText("");
            }
        }
        for (int i = 0; i < vista1.txtcalorias.getText().length(); i++) {
            if (!Character.isDigit(vista1.txtcalorias.getText().charAt(i))) {
                vista1.txtcalorias.setText("");
            }
        }
        for (int i = 0; i < vista1.txtproteinas.getText().length(); i++) {
            if (!Character.isDigit(vista1.txtproteinas.getText().charAt(i))) {
                vista1.txtproteinas.setText("");
            }
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
