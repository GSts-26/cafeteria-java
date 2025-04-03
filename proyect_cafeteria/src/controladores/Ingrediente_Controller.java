package controladores;

import com.formdev.flatlaf.FlatClientProperties;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.DAO.DaoIngredienteImpl;
import modelos.Entidades.Ingrediente;
import vistas.Agregar_ingredientes;
import vistas.Ingredientes;

public class Ingrediente_Controller {

    private Ingredientes vista;
    private Agregar_ingredientes vista1;
    private DaoIngredienteImpl IngredienteDAO;
    private DefaultTableModel modeloIngrediente;
    private int ingredientesContador;
    private List<Ingrediente> ListaIngrediente = new ArrayList<>();
    JButton botonEditar = new JButton();
    JButton botonEliminar = new JButton();

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
        this.resetear();
        JOptionPane.showMessageDialog(null, "Ingrediente Ingresado");
        mostrar();
    }
// metodos para el dialog de agregar ingredientes
    
    
  
//    public void ingresar1() {
//
//        String nombre = vista1.txtNombre.getText();
//        int calorias = Integer.parseInt(vista1.txtcalorias.getText());
//        int carbohidrato = Integer.parseInt(vista1.txtCarbo.getText());
//        int azucar = Integer.parseInt(vista1.txtAzucar.getText());
//        int proteinas = Integer.parseInt(vista1.txtproteinas.getText());
//        Ingrediente ingrediente = new Ingrediente(nombre, calorias, carbohidrato, azucar, proteinas);
//        IngredienteDAO.insertar(ingrediente);
//        JOptionPane.showMessageDialog(null, "Ingrediente Ingresado");
//        this.limpiarAgreIngrediente();
//        mostrar();
//    }

    public void mostrar() {
        modeloIngrediente = (DefaultTableModel) vista.T_Ingrediente.getModel();
        modeloIngrediente.setRowCount(0);
        botonEditar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-edit-30.png")));
        botonEliminar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-trash-30.png")));
        botonEditar.setBorder(BorderFactory.createEmptyBorder());
        botonEliminar.setBorder(BorderFactory.createEmptyBorder());
//        botonEliminar.putClientProperty(FlatClientProperties.STYLE, "arc: 20; " + "background: #E6D2D4;");
//        botonEditar.putClientProperty(FlatClientProperties.STYLE, "arc: 20;" + "background: #F9F2ED;");
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
                    botonEditar,
                    botonEliminar
                });
            }
            vista.contadornumero.setText(String.valueOf(ingredientesContador));
        }
    }


   

  

  

    public void rellenarACtu() {
        vista.lblIngrediente.setText("Actualizar Ingrediente");
        vista.boton_actualizar.setVisible(true);
        vista.boton_crear.setVisible(false);
    }

    public void rellenarNuevo() {
        vista.lblIngrediente.setText("Nuevo Ingrediente");
        vista.boton_actualizar.setVisible(false);
        vista.boton_crear.setVisible(true);
        resetear();
    }

    public void resetear() {
        vista.txtNombre.setText("");
        vista.txtcalorias.setValue(0);
        vista.txtCarbo.setValue(0);
        vista.txtAzucar.setValue(0);
        vista.txtproteinas.setValue(0);

    }
    int idIngre = 0;

    public void Acciones_tabla() {
        ArrayList<Integer> lista = new ArrayList<>();
        DefaultTableModel modelo = (DefaultTableModel) vista.T_Ingrediente.getModel();
        int columna = vista.T_Ingrediente.getSelectedColumn();
        int fila = vista.T_Ingrediente.getSelectedRow();
        int idEliminar = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
        idIngre = Integer.parseInt(modelo.getValueAt(fila, 0).toString());

        if (columna == 3) {
            IngredienteDAO.eliminar(idEliminar);
            JOptionPane.showMessageDialog(null, "Ingrediente Eliminado Correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            mostrar();
        } else if (columna == 2) {
            rellenarACtu();
            String nombre = modelo.getValueAt(fila, 1).toString();
            vista.txtNombre.setText(nombre);
            lista = IngredienteDAO.obtenerInfoNutri(idEliminar);
            vista.txtcalorias.setValue(lista.get(0));
            vista.txtCarbo.setValue(lista.get(1));
            vista.txtAzucar.setValue(lista.get(2));
            vista.txtproteinas.setValue(lista.get(3));

        }
    }

    public void actualizar() {
        String nombre = vista.txtNombre.getText();
        int cal = Integer.parseInt(vista.txtcalorias.getValue().toString());
        int carbo = Integer.parseInt(vista.txtCarbo.getValue().toString());
        int azucar = Integer.parseInt(vista.txtAzucar.getValue().toString());
        int proteina = Integer.parseInt(vista.txtproteinas.getValue().toString());
        Ingrediente ingre = new Ingrediente(idIngre, nombre, cal, carbo, proteina, azucar);
        IngredienteDAO.actualizar(ingre);
        JOptionPane.showMessageDialog(null, "Datos modificados", "Modificado", JOptionPane.INFORMATION_MESSAGE);
        mostrar();
        rellenarNuevo();
    }
    
    
}
