package controladores;

import Modelo.DAO.DAOEmpleadoimpl;
import Modelo.Entidades.Empleado;
import vistas.panel_empleado;
import Modelo.bd.conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.DAO.DAOGeneral;
import javax.swing.table.DefaultTableModel;

public class metodo_empleado {

    private final panel_empleado vista;
    private final DAOEmpleadoimpl empleadoDao;
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
