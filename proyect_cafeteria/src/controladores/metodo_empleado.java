package controladores;

import Modelo.DAO.DAOEmpleadoimpl;
import Modelo.Entidades.Empleado;
import vistas.panel_empleado;
import Modelo.bd.conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.DAO.DAOGeneral;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class metodo_empleado {

    private panel_empleado vista;
    private DAOEmpleadoimpl empleadoDao;
    private DefaultTableModel modeloTabla;
    private List<Empleado> listaEmpleado = new ArrayList<>();

    public metodo_empleado(panel_empleado vista_empleado) {
        this.vista = vista_empleado;
        this.empleadoDao = new DAOEmpleadoimpl();

    }

    public void agregar_empleado() {
        Empleado Empleado = new Empleado(Long.parseLong(vista.getTxt_cedula().getText()),
                vista.getTxt_nombre().getText(),
                new java.sql.Date(vista.getFecha_nacimiento().getDate().getTime()),
                vista.getGenero(),
                Long.parseLong(vista.getTxt_telefono().getText()),
                vista.getTxt_correo().getText(),
                vista.getTxt_direccion().getText(),
                vista.getTxt_apellido().getText());
        empleadoDao.Insertar(Empleado);
        listarEmpleado();

    }

    public void listarEmpleado() {
        modeloTabla = (DefaultTableModel) vista.getTabla_empleado().getModel();
        modeloTabla.setRowCount(0);
        listaEmpleado = empleadoDao.listar();
        if (listaEmpleado.isEmpty()) {
            vista.getAdvertencia().setVisible(true);
            System.out.println("No hay empleados");
        } else {
            vista.getAdvertencia().setVisible(false);
            for (Empleado emple : listaEmpleado) {
                modeloTabla.addRow(new Object[]{
                    emple.getCedula(),
                    emple.getNombre(),
                    emple.getApellido(),
                    emple.getNacimiento(),
                    emple.getGenero(),
                    emple.getTelefono(),
                    emple.getEmail(),
                    emple.getDireccion()
                });
                contarEmpleados();
            }

        }

    }

    public void contarEmpleados() {
        String consulta = "SELECT COUNT(*) FROM empleado";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vista.getNumero_empleados().setText(String.valueOf(rs.getInt(1)));
            }

        } catch (SQLException e) {
            System.out.println("Entro al catch" + e.getMessage());
        }
    }

    public void eliminar() {
        modeloTabla = (DefaultTableModel) vista.getTabla_empleado().getModel();
        int fila = vista.getTabla_empleado().getSelectedRow();
        long filaseleccionada = Long.parseLong(modeloTabla.getValueAt(fila, 0).toString());
        if (vista.getTabla_empleado().getSelectedColumn() == 9) {
            empleadoDao.Eliminar(filaseleccionada);
            listarEmpleado();

        }

    }

    public void rellenar() {
        if (vista.getTabla_empleado().getSelectedColumn() == 8) {

            modeloTabla = (DefaultTableModel) vista.getTabla_empleado().getModel();
            int fila = vista.getTabla_empleado().getSelectedRow();
            long cedula = Long.parseLong(modeloTabla.getValueAt(fila, 0).toString());
            String nombre = modeloTabla.getValueAt(fila, 1).toString();
            String apellido = modeloTabla.getValueAt(fila, 2).toString();
//        Date fecha = (Date) modeloTabla.getValueAt(fila, 3);
            String genero = modeloTabla.getValueAt(fila, 4).toString();
            long telefono = Long.parseLong(modeloTabla.getValueAt(fila, 5).toString());
            String email = modeloTabla.getValueAt(fila, 6).toString();
            String direccion = modeloTabla.getValueAt(fila, 7).toString();
//        System.out.println(cedula + "  " + nombre);

            vista.getTxt_cedula().setText(String.valueOf(cedula));
            vista.getTxt_nombre().setText(nombre);
//        vistaactualizar.fecha_nacimiento.setDate(fecha);
        }
    }

    public void actualizar() {
        modeloTabla = (DefaultTableModel) vista.getTabla_empleado().getModel();
        int fila = vista.getTabla_empleado().getSelectedRow();
        long filaseleccionada = Long.parseLong(modeloTabla.getValueAt(fila, 0).toString());
        if (vista.getTabla_empleado().getSelectedColumn() == 8) {

            String nombre = vista.getTxt_nombre().getText();
            Date nacimiento = (Date) vista.getFecha_nacimiento().getDate();
            String genero = vista.getGenero();
            long telefono = Long.parseLong(vista.getTxt_telefono().getText());
            String email = vista.getTxt_correo().getText();
            String direccion = vista.getTxt_direccion().getText();
            String apellido = vista.getTxt_apellido().getText();

            Empleado c = new Empleado(filaseleccionada, nombre, nacimiento, genero, telefono, email, direccion, apellido);
            empleadoDao.Actualizar(c);
        }

    }

    public boolean datosIncorrectos() {
        boolean ok = true;

        for (int i = 0; i < vista.getTxt_cedula().getText().length(); i++) {
            if (Character.isLetter(vista.getTxt_cedula().getText().charAt(i))) {
                vista.getM2cedula_dato().setVisible(true);
                ok = false;

            } else {
                vista.getM2cedula_dato().setVisible(false);
                ok = true;

            }
        }
        for (int i = 0; i < vista.getTxt_telefono().getText().length(); i++) {
            if (Character.isLetter(vista.getTxt_telefono().getText().charAt(i))) {
                vista.getM10telefono_dato().setVisible(true);
                ok = false;
            } else {
                vista.getM10telefono_dato().setVisible(false);
                ok = true;
            }
        }

        return ok;
    }

    public boolean camposVacios(String campo) {
        boolean ok = true;

        if (campo.equals("cedula")) {
            if (vista.getTxt_cedula().getText().isEmpty()) {
                vista.getM2cedula_dato().setVisible(false);
                vista.getM1cedula_campo().setVisible(true);
                ok = false;
            } else {
                vista.getM1cedula_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("nombre")) {
            if (vista.getTxt_nombre().getText().isEmpty()) {
                vista.getM4nombre_campo().setVisible(true);
                ok = false;
            } else {
                vista.getM4nombre_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("apellido")) {
            if (vista.getTxt_apellido().getText().isEmpty()) {
                vista.getM5apellido_campo().setVisible(true);
                ok = false;
            } else {
                vista.getM5apellido_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("fecha_nacimiento")) {
            if (vista.getFecha_nacimiento().getDate() == null) {
                vista.getM13fechanacimiento_campo().setVisible(true);
                ok = false;
            } else {
                vista.getM13fechanacimiento_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("telefono")) {
            if (vista.getTxt_telefono().getText().isEmpty()) {
                vista.getM10telefono_dato().setVisible(false);
                vista.getM9telefono_campo().setVisible(true);
                ok = false;
            } else {
                vista.getM9telefono_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("correo")) {
            if (vista.getTxt_correo().getText().isEmpty()) {
                vista.getM11correo_campo().setVisible(true);
                ok = false;
            } else {
                vista.getM11correo_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("direccion")) {
            if (vista.getTxt_direccion().getText().isEmpty()) {
                vista.getM7direccion_campo().setVisible(true);
                ok = false;
            } else {
                vista.getM7direccion_campo().setVisible(false);
            }
            return ok;
        }

        return ok;
    }

}
