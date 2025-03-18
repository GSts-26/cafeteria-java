
package controladores;

import vistas.panel_empleado;
import Conexion.conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class metodo_empleado {

    DefaultTableModel modelo_tabla;
    conexion conex = new conexion();
    private panel_empleado empleado;
    private long cedula = 0;
    private String nombre = null;
    private String apellido = null;
    private JDateChooser nacimiento;
    private String genero = null;
    private long telefono = 0;
    private String email = null;
    private String direccion = null;

    public metodo_empleado(panel_empleado vista_empleado) {
        this.empleado = vista_empleado;
    }

    public void agregar_empleado() {
        cedula = empleado.getTxt_cedula();
        nombre = empleado.getTxt_nombre();
        apellido = empleado.getTxt_apellido();
        genero = empleado.getGenero();
        telefono = empleado.getTxt_telefono();
        email = empleado.getTxt_correo();
        direccion = empleado.getTxt_direccion();
        nacimiento = empleado.getFecha_nacimiento();
        String consulta = "INSERT INTO empleado (cedula, nombre, apellido, nacimiento, genero, telefono, email, direccion) VALUES(?,?,?,?,?,?,?,?)";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps_insertar = con.prepareStatement(consulta);
            ps_insertar.setLong(1, cedula);
            ps_insertar.setString(2, nombre);
            ps_insertar.setString(3, apellido);
            ps_insertar.setDate(4, new java.sql.Date(nacimiento.getDate().getTime()));
            ps_insertar.setString(5, genero);
            ps_insertar.setLong(6, telefono);
            ps_insertar.setString(7, email);
            ps_insertar.setString(8, direccion);
            int fila_insertada = ps_insertar.executeUpdate();
            if (fila_insertada > 0) {
                listarEmpleado();
                JOptionPane.showMessageDialog(null, "Empleado agregado correctamente", "Agregado", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (SQLException e) {
            System.out.println("Entro al catch" + e.getMessage());
        }

    }

    public void listarEmpleado() {
        modelo_tabla = (DefaultTableModel) empleado.getTabla_empleado().getModel();
        modelo_tabla.setRowCount(0);
        String busqueda = empleado.getTxt_filtradoStr();
        String consulta = "SELECT * FROM empleado WHERE nombre LIKE ? OR  apellido LIKE ?";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setString(1, "%" + busqueda + "%");
            ps.setString(2, "%" + busqueda + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                empleado.getadv().setVisible(false);
                do {
                    modelo_tabla.addRow(new Object[]{
                        rs.getLong("cedula"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getDate("nacimiento"),
                        rs.getString("genero"),
                        rs.getLong("telefono"),
                        rs.getString("email"),
                        rs.getString("direccion")});

                } while (rs.next());
                contarEmpleados();
            } else {
                empleado.getadv().setVisible(true);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void contarEmpleados() {
        String consulta = "SELECT COUNT(*) FROM empleado";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                empleado.getlabelCount().setText(String.valueOf(rs.getInt(1)));
            }

        } catch (SQLException e) {
            System.out.println("Entro al catch" + e.getMessage());
        }
    }

    public void eliminar() {

        modelo_tabla = (DefaultTableModel) empleado.getTabla_empleado().getModel();
        int fila = empleado.getTabla_empleado().getSelectedRow();
        if (empleado.getTabla_empleado().getSelectedColumn() == 9) {
            int cedula_celeccionada = Integer.parseInt(modelo_tabla.getValueAt(fila, 0).toString());
            String consulta = "DELETE FROM empleado WHERE cedula=?";
            try (Connection con = conex.getConnection()) {
                PreparedStatement ps = con.prepareStatement(consulta);
                ps.setLong(1, cedula_celeccionada);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Empleado eliminado correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
                listarEmpleado();

            } catch (SQLException e) {
                System.out.println("Entro al catch" + e.getMessage());
            }
        }
    }

    public boolean datosIncorrectos() {
        boolean ok = true;

        for (int i = 0; i < empleado.getTxt_cedulaStr().length(); i++) {
            if (Character.isLetter(empleado.getTxt_cedulaStr().charAt(i))) {
                empleado.getm2ced_dato().setVisible(true);
                ok = false;

            } else {
                empleado.getm2ced_dato().setVisible(false);
                ok = true;

            }
        }
        for (int i = 0; i < empleado.getTxt_telStr().length(); i++) {
            if (Character.isLetter(empleado.getTxt_telStr().charAt(i))) {
                empleado.getm10tel_dato().setVisible(true);
                ok = false;
            } else {
                empleado.getm10tel_dato().setVisible(false);
                ok = true;

            }
        }

        return ok;
    }

    public boolean camposVacios(String campo) {
        boolean ok = true;

        if (campo.equals("cedula")) {
            if (empleado.getTxt_cedulaStr().isEmpty()) {
                empleado.getm2ced_dato().setVisible(false);
                empleado.getm1ced_campo().setVisible(true);
                ok = false;
            } else {
                empleado.getm1ced_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("nombre")) {
            if (empleado.getTxt_nombre().isEmpty()) {
                empleado.getm4nomb_campo().setVisible(true);
                ok = false;
            } else {
                empleado.getm4nomb_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("apellido")) {
            if (empleado.getTxt_apellido().isEmpty()) {
                empleado.getm5apell_campo().setVisible(true);
                ok = false;
            } else {
                empleado.getm5apell_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("fecha_nacimiento")) {
            if (empleado.getFecha_nacimiento().getDate() == null) {
                empleado.getm13nacimiento_campo().setVisible(true);
                ok = false;
            } else {
                empleado.getm13nacimiento_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("telefono")) {
            if (empleado.getTxt_telStr().isEmpty()) {
                empleado.getm10tel_dato().setVisible(false);
                empleado.getm9tel_campo().setVisible(true);
                ok = false;
            } else {
                empleado.getm9tel_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("correo")) {
            if (empleado.getTxt_correo().isEmpty()) {
                empleado.getm11correo_campo().setVisible(true);
                ok = false;
            } else {
                empleado.getm11correo_campo().setVisible(false);
            }
            return ok;
        }

        if (campo.equals("direccion")) {
            if (empleado.getTxt_direccion().isEmpty()) {
                empleado.getm7direccion_campo().setVisible(true);
                ok = false;
            } else {
                empleado.getm7direccion_campo().setVisible(false);
            }
            return ok;
        }
        return ok;
    }
}
