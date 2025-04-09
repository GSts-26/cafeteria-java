/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import modelos.Bd.conexion;
import modelos.Entidades.usuario;

public class DaoLogin {

    public usuario userselect(String usuario, String clave) {
        usuario user = null;
        String sql = "SELECT u.usuario, u.clave, u.rol, e.cedula, e.nombre, e.apellido FROM public.usuario u INNER JOIN public.empleado e ON u.usuario = e.nombre WHERE u.usuario = ? AND u.clave = ?;";
        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, usuario);
            st.setString(2, clave);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    user = new usuario(rs.getString("usuario"), rs.getString("clave"), rs.getString("rol"), rs.getLong("cedula"), rs.getString("nombre"), rs.getString("apellido"));

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(user);
        return user;
    }

    
}
