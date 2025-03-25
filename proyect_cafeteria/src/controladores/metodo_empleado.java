
package controladores;

import vistas.panel_empleado;
import modelos.Bd.conexion;
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
//                listarEmpleado();

            } catch (SQLException e) {
                System.out.println("Entro al catch" + e.getMessage());
            }
        }
    }

   
}
