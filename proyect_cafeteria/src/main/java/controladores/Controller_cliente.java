package controladores;

import vistas.Clientes;

import com.formdev.flatlaf.FlatClientProperties;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelos.DAO.DaoClienteImpl;
import modelos.Entidades.Cliente;

public class Controller_cliente {

    private final Clientes vista; //vista del panel
    private DaoClienteImpl clienteDAO;
    private DefaultTableModel modeloClientes;
    private int clientesContador;
    private List<Cliente> clientes = new ArrayList<>();
    JButton botonEditar = new JButton();
    JButton botonEliminar = new JButton();

    public Controller_cliente(Clientes Views_client) {
        this.vista = Views_client;
        this.clienteDAO = new DaoClienteImpl();
        this.clientesContador = 0;

    }

    public void ingresar() {
        Cliente cliente = new Cliente(Long.parseLong(vista.txtcedula.getText()), vista.getTxtnombre().getText(), new java.sql.Date(vista.getTxtnacimiento().getDate().getTime()), vista.getTxtgenero().getSelectedItem().toString(),
                Long.parseLong(vista.getTxttelefono().getText()),
                vista.getTxtEmail().getText(),
                vista.getTxtDireccion().getText()
        );
        clienteDAO.insertar(cliente);
        JOptionPane.showMessageDialog(null, "Cliente Ingresado");
        mostrar();
        dias();
    }
    
    public void dias(){
    vista.nuevoscli.setText(clienteDAO.contarEmpleadosUltimos30Dias()+"");
    }
private void EstilosBotones(){

        botonEditar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-edit-30.png")));
        botonEliminar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-trash-30.png")));
        botonEliminar.setBorder(BorderFactory.createEmptyBorder());
        botonEditar.setBorder(BorderFactory.createEmptyBorder());
}
    public void mostrar() {
        modeloClientes = (DefaultTableModel) vista.getT_Clientes().getModel();
        EstilosBotones();
        modeloClientes.setRowCount(0);
        clientesContador = 0;
        clientes = clienteDAO.listar();
        if (clientes.isEmpty()) {
            vista.getAdvertencia().setVisible(true);
            System.out.println("No hay clientes en la base de datos.");
        } else {
            vista.getAdvertencia().setVisible(false);
            for (Cliente Cliente : clientes) {
                clientesContador++;
                modeloClientes.addRow(new Object[]{
                    Cliente.getCedula(),
                    Cliente.getNombre(),
                    Cliente.getFechaNacimiento(),
                    Cliente.getGenero(),
                    Cliente.getTelefono(),
                    Cliente.getEmail(),
                    Cliente.getDireccion(),
                    botonEditar,
                    botonEliminar
                });
            }
            vista.getnumero().setText(String.valueOf(clientesContador));
        }
    }

    public  void filtrar(String cedula){
        modeloClientes = (DefaultTableModel) vista.getT_Clientes().getModel();
        EstilosBotones();
        modeloClientes.setRowCount(0);
        clientesContador = 0;
        clientes = clienteDAO.Filtrar(cedula);
        if (clientes.isEmpty()) {
            vista.getAdvertencia().setVisible(true);
            System.out.println("No hay clientes en la base de datos.");
        } else {
            vista.getAdvertencia().setVisible(false);
            for (Cliente Cliente : clientes) {
                clientesContador++;
                modeloClientes.addRow(new Object[]{
                        Cliente.getCedula(),
                        Cliente.getNombre(),
                        Cliente.getFechaNacimiento(),
                        Cliente.getGenero(),
                        Cliente.getTelefono(),
                        Cliente.getEmail(),
                        Cliente.getDireccion(),
                        botonEditar,
                        botonEliminar
                });
            }
            vista.getnumero().setText(String.valueOf(clientesContador));
        }
    }

    public void Acciones_tabla() {
        int columna = vista.getT_Clientes().getSelectedColumn();
        int fila = vista.getT_Clientes().getSelectedRow();
        if (columna == 7) {
            rellenarActualizar();
        }

        if (columna == 8) {
            Long valorEliminar = Long.parseLong(vista.getT_Clientes().getValueAt(fila, 0).toString());
            clienteDAO.eliminar(valorEliminar);
            JOptionPane.showMessageDialog(null, "Cliente Eliminado Correctamente");
            mostrar();
        }

    }

    public void actualizar() {
        long cedula = Long.parseLong(vista.txtcedula.getText());
        String nombre = vista.txtnombre.getText();
        Date nacimiento = new java.sql.Date(vista.txtnacimiento.getDate().getTime());
        String genero = vista.txtgenero.getSelectedItem().toString();
        long telefono = Long.parseLong(vista.txttelefono.getText());
        String email = vista.txtEmail.getText();
        String direccion = vista.txtDireccion.getText();
        Cliente cliente = new Cliente(cedula, nombre, (java.sql.Date) nacimiento, genero, telefono, email, direccion);
        clienteDAO.actualizar(cliente);
        JOptionPane.showMessageDialog(null, "Datos del cliente han sido modificados", "Modificación", JOptionPane.INFORMATION_MESSAGE);
        mostrar();
        limpiarCampos();
        NuevoEmpleado();
    }

    public void OcultarMensajes() {
        vista.m1CedulaVacia.setVisible(false);
        vista.m2NombreVacio.setVisible(false);
        vista.m3FechaVacia.setVisible(false);
        vista.m4TelefonoVacio.setVisible(false);
        vista.m5DireccionVacia.setVisible(false);
        vista.m6Emailvacio.setVisible(false);
        vista.boton_actualizar.setVisible(false);
    }

    public boolean CamposVacios() {
        boolean ok = false;
        if (vista.txtcedula.getText().isEmpty()) {
            vista.m1CedulaVacia.setVisible(true);
            return ok;
        } else {
            vista.m1CedulaVacia.setVisible(false);
            ok = true;
        }
        if (vista.txtnombre.getText().isEmpty()) {
            vista.m2NombreVacio.setVisible(true);
            return ok;
        } else {
            vista.m2NombreVacio.setVisible(false);
            ok = false;
        }
        if (vista.txtnacimiento.getDate() == null) {
            vista.m3FechaVacia.setVisible(true);
            return ok;
        } else {
            vista.m3FechaVacia.setVisible(false);
            ok = true;
        }

        if (vista.txttelefono.getText().isEmpty()) {
            vista.m4TelefonoVacio.setVisible(true);
            return ok;
        } else {
            vista.m4TelefonoVacio.setVisible(false);
            ok = true;
        }
        if (vista.txtDireccion.getText().isEmpty()) {
            vista.m5DireccionVacia.setVisible(true);
            return ok;
        } else {
            vista.m5DireccionVacia.setVisible(false);
            ok = true;
        }
        if (vista.txtEmail.getText().isEmpty()) {
            vista.m6Emailvacio.setVisible(true);
            return ok;
        } else {
            vista.m6Emailvacio.setVisible(false);
            ok = true;
        }

        return ok;

    }

    public boolean DatosNoAdmitidos() {
        for (int i = 0; i < vista.txtcedula.getText().length(); i++) {
            if (!Character.isDigit(vista.txtcedula.getText().charAt(i))) {
                vista.txtcedula.setText("");
                return false;
            }
        }
        for (int i = 0; i < vista.txtnombre.getText().length(); i++) {
            if (Character.isDigit(vista.txtnombre.getText().charAt(i))) {
                vista.txtnombre.setText("");
                return false;
            }
        }
        for (int i = 0; i < vista.txttelefono.getText().length(); i++) {
            if (!Character.isDigit(vista.txttelefono.getText().charAt(i))) {
                vista.txttelefono.setText("");
                return false;
            }
        }
        return true;
    }

    public void limpiarCampos() {
        JTextField[] campos = {vista.txtcedula, vista.txtnombre, vista.txtDireccion, vista.txtEmail, vista.txttelefono};
        for (JTextField campo : campos) {
            campo.setText("");
        }
        vista.txtnacimiento.setDate(null);
        vista.txtcedula.requestFocus();
    }

    public void NuevoEmpleado() {
        limpiarCampos();
        vista.lblCliente.setText("Nuevo Empleado");
        vista.txtcedula.setEditable(true);
        vista.boton_crear.setVisible(true);
        vista.boton_actualizar.setVisible(false);
    }

    public void rellenarActualizar() {
        DefaultTableModel modeloTabla = (DefaultTableModel) vista.T_Clientes.getModel();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        int fila = vista.T_Clientes.getSelectedRow();
        String cedulaSelec = modeloTabla.getValueAt(fila, 0).toString();
        String nombreSelec = modeloTabla.getValueAt(fila, 1).toString();
//        String apellidoSelec = modeloTabla.getValueAt(fila, 2).toString();
        String nacimientoSelec = modeloTabla.getValueAt(fila, 2).toString();
        String generoSelec = modeloTabla.getValueAt(fila, 3).toString();
        String telefonoSelec = modeloTabla.getValueAt(fila, 4).toString();
        String emailSelec = modeloTabla.getValueAt(fila, 5).toString();
        String direccionSelec = modeloTabla.getValueAt(fila, 6).toString();
        vista.lblCliente.setText("Actualizar Empleado");
        //ocultar el boton de agregar y mostar el de actualizar
        vista.boton_crear.setVisible(false);
        vista.boton_actualizar.setVisible(true);
        // quitar la opcion de modificar la cedula
        vista.txtcedula.setEditable(false);
        // rellenar los textfields con los datos de la fila seleccionada
        vista.txtcedula.setText(cedulaSelec);
        vista.txtnombre.setText(nombreSelec);

        vista.txttelefono.setText(telefonoSelec);
        vista.txtEmail.setText(emailSelec);
        vista.txtDireccion.setText(direccionSelec);
        vista.txtgenero.setSelectedItem(generoSelec);
        try {
            // Convertir el String a Date
            java.util.Date nacDate = formato.parse(nacimientoSelec);
            // Asignar la fecha al JDateChooser
            vista.txtnacimiento.setDate(nacDate);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha: " + e.getMessage());
        }

    }
}
