package metodos;

import java.sql.*;
import Conexion.conexion;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class metodo_login {

    Conexion.conexion conex = new conexion();

    public void acceso(JTextField txtUsuario, JTextField txtClave) {
        String usuario_obtenido = txtUsuario.getText().trim();
        String clave_obtenida = txtClave.getText().trim();
        String rol_obtenido = null;
        String consulta_datos = "SELECT * FROM usuario WHERE usuario=? AND clave=?";
        try (Connection con = conex.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta_datos);
            ps.setString(1, usuario_obtenido);
            ps.setString(2, clave_obtenida);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                rol_obtenido = rs.getString("rol");
                if (rol_obtenido.equalsIgnoreCase("empleado")) {
                    JOptionPane.showMessageDialog(null, "Ingresando como Empleado");
                } else if (rol_obtenido.equalsIgnoreCase("administrador")) {
                    JOptionPane.showMessageDialog(null, "Ingresando como Administrador");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrecto");
            }
        } catch (Exception e) {
        }
    }
}
