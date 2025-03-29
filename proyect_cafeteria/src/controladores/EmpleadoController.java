package controladores;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Dimension;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelos.DAO.DaoEmpleado;
import modelos.Entidades.Empleado;
import vistas.panel_empleado;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EmpleadoController {

    private panel_empleado vistas;
    private DaoEmpleado empleadoDao;
    private Empleado empleado;
    private List<Empleado> listaEmpleado = new ArrayList<>();
    JButton botonEditar = new JButton();
    JButton botonEliminar = new JButton();

    public EmpleadoController(panel_empleado vistas) {
        this.vistas = vistas;
        this.empleadoDao = new DaoEmpleado();
    }

    public void insertar() {
        long cedula = Long.parseLong(vistas.txt_cedula.getText());
        String nombre = vistas.txt_nombre.getText();
        Date nacimiento = new java.sql.Date(vistas.fecha_nacimiento.getDate().getTime());
        String genero = String.valueOf(vistas.genero.getSelectedItem());
        long telefono = Long.parseLong(vistas.txt_telefono.getText());
        String email = vistas.txt_correo.getText();
        String direccion = vistas.txt_direccion.getText();
        String apellido = vistas.txt_apellido.getText();
        Empleado empleado = new Empleado(cedula, nombre, nacimiento, genero, telefono, email, direccion, apellido);
        empleadoDao.insertar(empleado);
        JOptionPane.showMessageDialog(null, "Emplaedo registrado correctamente");
        mostrar();
        limpiarCampos();
    }

    public void actualizar() {
        long cedula = Long.parseLong(vistas.txt_cedula.getText());
        String nombre = vistas.txt_nombre.getText();
        Date nacimiento = new java.sql.Date(vistas.fecha_nacimiento.getDate().getTime());
        String genero = String.valueOf(vistas.genero.getSelectedItem());
        long telefono = Long.parseLong(vistas.txt_telefono.getText());
        String email = vistas.txt_correo.getText();
        String direccion = vistas.txt_direccion.getText();
        String apellido = vistas.txt_apellido.getText();
        empleado = new Empleado(cedula, nombre, nacimiento, genero, telefono, email, direccion, apellido);
        empleadoDao.actualizar(empleado);
        JOptionPane.showMessageDialog(null, "Datos del empleado han sido modificados");
        mostrar();
        limpiarCampos();
    }

    public void eliminar() {
        DefaultTableModel modeloTabla = (DefaultTableModel) vistas.Tabla_empleado.getModel();
        int fila = vistas.Tabla_empleado.getSelectedRow();
        String cedula = modeloTabla.getValueAt(fila, 0).toString();
        empleadoDao.eliminar(Long.parseLong(cedula));
        mostrar();
        limpiarCampos();
        JOptionPane.showMessageDialog(null, "Empleado eliminado", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
    }

    public void ocultar() {
        vistas.boton_actualizar.setVisible(false);
        vistas.getm10tel_dato().setVisible(false);
        vistas.getm11correo_campo().setVisible(false);
        vistas.getm13nacimiento_campo().setVisible(false);
        vistas.getm1ced_campo().setVisible(false);
        vistas.getm2ced_dato().setVisible(false);
        vistas.getm4nomb_campo().setVisible(false);
        vistas.getm5apell_campo().setVisible(false);
        vistas.getm7direccion_campo().setVisible(false);
        vistas.getm9tel_campo().setVisible(false);
    }

    public void mostrar() {
        DefaultTableModel modeloTabla = (DefaultTableModel) vistas.Tabla_empleado.getModel();
        modeloTabla.setRowCount(0);

        botonEditar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-edit-30.png")));
        botonEliminar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-trash-30.png")));
        botonEliminar.setBorder(BorderFactory.createEmptyBorder());
        botonEditar.setBorder(BorderFactory.createEmptyBorder());

//        botonEliminar.putClientProperty(FlatClientProperties.STYLE, "arc: 20; " + "background: #E6D2D4;" );
//        botonEditar.putClientProperty(FlatClientProperties.STYLE, "arc: 20;" + "background: #F9F2ED;");
        listaEmpleado = empleadoDao.listar();
        if (listaEmpleado.isEmpty()) {
            System.out.println("No hay Empleados");
            vistas.advertencia.setVisible(true);

        } else {
            vistas.advertencia.setVisible(false);
            for (Empleado emp : listaEmpleado) {
                modeloTabla.addRow(new Object[]{
                    emp.getCedula(),
                    emp.getNombre(),
                    emp.getApellido(),
                    emp.getNacimiento(),
                    emp.getGenero(),
                    emp.getTelefono(),
                    emp.getEmail(),
                    emp.getDireccion(),
                    botonEditar,
                    botonEliminar});
            }
            contar();
        }
    }

    // cambia el mensaje de nuevo empleado por actualizar empleado y el boton de agregar lo cambia por el de actualizar
    public void nuevoEmpleado() {
        limpiarCampos();
        vistas.lblEmpleado.setText("Nuevo Empleado");
        vistas.boton_actualizar.setVisible(false);
        vistas.boton_agregar.setVisible(true);
        vistas.txt_cedula.setEditable(true);
    }

    public void rellenarActualizar() {
        DefaultTableModel modeloTabla = (DefaultTableModel) vistas.Tabla_empleado.getModel();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        int fila = vistas.Tabla_empleado.getSelectedRow();
        String cedulaSelec = modeloTabla.getValueAt(fila, 0).toString();
        String nombreSelec = modeloTabla.getValueAt(fila, 1).toString();
        String apellidoSelec = modeloTabla.getValueAt(fila, 2).toString();
        String nacimientoSelec = modeloTabla.getValueAt(fila, 3).toString();
        String generoSelec = modeloTabla.getValueAt(fila, 4).toString();
        String telefonoSelec = modeloTabla.getValueAt(fila, 5).toString();
        String emailSelec = modeloTabla.getValueAt(fila, 6).toString();
        String direccionSelec = modeloTabla.getValueAt(fila, 7).toString();
        vistas.lblEmpleado.setText("Actualizar Empleado");
        //ocultar el boton de agregar y mostar el de actualizar
        vistas.boton_agregar.setVisible(false);
        vistas.boton_actualizar.setVisible(true);
        // quitar la opcion de modificar la cedula
        vistas.txt_cedula.setEditable(false);
        // rellenar los textfields con los datos de la fila seleccionada
        vistas.txt_cedula.setText(cedulaSelec);
        vistas.txt_nombre.setText(nombreSelec);
        vistas.txt_apellido.setText(apellidoSelec);
        vistas.txt_telefono.setText(telefonoSelec);
        vistas.txt_correo.setText(emailSelec);
        vistas.txt_direccion.setText(direccionSelec);
        vistas.genero.setSelectedItem(generoSelec);
        try {
            // Convertir el String a Date
            java.util.Date nacDate = formato.parse(nacimientoSelec);
            // Asignar la fecha al JDateChooser
            vistas.fecha_nacimiento.setDate(nacDate);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha: " + e.getMessage());
        }

    }

// contar la cantidad de empleados existentes
    public void contar() {
        vistas.numero_empleados.setText(String.valueOf(empleadoDao.contarEmpleado()));
    }

    public boolean datosIncorrectos() {
        boolean ok = true;

        for (int i = 0; i < vistas.getTxt_cedulaStr().length(); i++) {
            if (Character.isLetter(vistas.getTxt_cedulaStr().charAt(i))) {
                vistas.getm2ced_dato().setVisible(true);
                ok = false;

            } else {
                vistas.getm2ced_dato().setVisible(false);
                ok = true;

            }
        }
        for (int i = 0; i < vistas.getTxt_telStr().length(); i++) {
            if (Character.isLetter(vistas.getTxt_telStr().charAt(i))) {
                vistas.getm10tel_dato().setVisible(true);
                ok = false;
            } else {
                vistas.getm10tel_dato().setVisible(false);
                ok = true;

            }
        }

        return ok;
    }

    public boolean camposVacios(String campo) {
        boolean ok = true;

        if (campo.equals("cedula")) {
            if (vistas.getTxt_cedulaStr().isEmpty()) {
                vistas.getm2ced_dato().setVisible(false);
                vistas.getm1ced_campo().setVisible(true);
                ok = false;
            } else {
                vistas.getm1ced_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("nombre")) {
            if (vistas.getTxt_nombre().isEmpty()) {
                vistas.getm4nomb_campo().setVisible(true);
                ok = false;
            } else {
                vistas.getm4nomb_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("apellido")) {
            if (vistas.getTxt_apellido().isEmpty()) {
                vistas.getm5apell_campo().setVisible(true);
                ok = false;
            } else {
                vistas.getm5apell_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("fecha_nacimiento")) {
            if (vistas.getFecha_nacimiento().getDate() == null) {
                vistas.getm13nacimiento_campo().setVisible(true);
                ok = false;
            } else {
                vistas.getm13nacimiento_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("telefono")) {
            if (vistas.getTxt_telStr().isEmpty()) {
                vistas.getm10tel_dato().setVisible(false);
                vistas.getm9tel_campo().setVisible(true);
                ok = false;
            } else {
                vistas.getm9tel_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("correo")) {
            if (vistas.getTxt_correo().isEmpty()) {
                vistas.getm11correo_campo().setVisible(true);
                ok = false;
            } else {
                vistas.getm11correo_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("direccion")) {
            if (vistas.getTxt_direccion().isEmpty()) {
                vistas.getm7direccion_campo().setVisible(true);
                ok = false;
            } else {
                vistas.getm7direccion_campo().setVisible(false);
            }
            return ok;
        }
        return ok;
    }

    public void limpiarCampos() {
        JTextField[] campos = {vistas.txt_cedula, vistas.txt_nombre, vistas.txt_apellido, vistas.txt_correo, vistas.txt_direccion, vistas.txt_telefono};
        for (JTextField campo : campos) {
            campo.setText("");
        }
        vistas.fecha_nacimiento.setDate(null);
        vistas.txt_cedula.requestFocus();
    }

}
