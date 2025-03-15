package metodos;

import vistas.panel_empleado;
import Conexion.conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.*;
import javax.swing.JOptionPane;
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
        try (Connection con = conex.getConnection()) {
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

        String consulta = "SELECT * FROM empleado";
        try (Connection con = conex.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                empleado.getPanel_noHay_empleado().setVisible(false);
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
            } else {
                System.out.println("vacio");
                empleado.getPanel_noHay_empleado().setVisible(true);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
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

}
