package controladores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.DAO.DaoIngredienteImpl;
import modelos.DAO.EscuchadorIngrediente;
import modelos.Entidades.Ingrediente;
import vistas.Ingredientes;

public class Ingrediente_Controller implements EscuchadorIngrediente {

    private final Ingredientes vista;
    private final DaoIngredienteImpl IngredienteDAO;
    private DefaultTableModel modeloIngrediente;
    private int ingredientesContador;
    private List<Ingrediente> ListaIngrediente = new ArrayList<>();
    JButton botonEditar = new JButton();
    JButton botonEliminar = new JButton();

    public Ingrediente_Controller(Ingredientes vista) {
        this.vista = vista;
        this.IngredienteDAO = new DaoIngredienteImpl();
        this.ingredientesContador = 0;
        EventBus.SubscribirseIngrediente(this);

    }

    public void ingresar() {
        if(vista.txtNombre.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Ingrese un nombre", "Error", JOptionPane.ERROR_MESSAGE);
          vista.txtNombre.requestFocus();
          return;
        }

        for (Ingrediente ingrediente : ListaIngrediente) {
            if (ingrediente.getNombre().equalsIgnoreCase(vista.txtNombre.getText())) {
                JOptionPane.showMessageDialog(null, "Nombre existente", "Error", JOptionPane.ERROR_MESSAGE);
                resetear();
                return;
            }
        }
        Ingrediente ingrediente = new Ingrediente(vista.txtNombre.getText(), (int) vista.txtcalorias.getValue(), (int) vista.txtCarbo.getValue(), (int) vista.txtAzucar.getValue(), (int) vista.txtproteinas.getValue());;
        IngredienteDAO.insertar(ingrediente);
        this.resetear();
        mostrar();
        JOptionPane.showMessageDialog(null, "Ingrediente Ingresado");
    }

    public void rellenarListaIngrediente() {
        ListaIngrediente = IngredienteDAO.listar();
    }

    public void mostrar() {
        rellenarListaIngrediente();
        modeloIngrediente = (DefaultTableModel) vista.T_Ingrediente.getModel();
        modeloIngrediente.setRowCount(0);
        botonEditar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-edit-30.png")));
        botonEliminar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-trash-30.png")));
        botonEditar.setBorder(BorderFactory.createEmptyBorder());
        botonEliminar.setBorder(BorderFactory.createEmptyBorder());
//        botonEliminar.putClientProperty(FlatClientProperties.STYLE, "arc: 20; " + "background: #E6D2D4;");
//        botonEditar.putClientProperty(FlatClientProperties.STYLE, "arc: 20;" + "background: #F9F2ED;");
        ingredientesContador = 0;

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
            modelo.removeRow(fila);
            IngredienteDAO.eliminar(idEliminar);
            JOptionPane.showMessageDialog(null, "Ingrediente Eliminado Correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
//            mostrar();
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
        mostrar();
        JOptionPane.showMessageDialog(null, "Datos modificados", "Modificado", JOptionPane.INFORMATION_MESSAGE);
        rellenarNuevo();
        EventBus.PublishIngrediente();

    }

    @Override
    public void EscuchadorIngreActivo() {
        mostrar();
    }

}
