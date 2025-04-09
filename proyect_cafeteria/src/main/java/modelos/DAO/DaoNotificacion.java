package modelos.DAO;

import java.sql.*;
import modelos.Bd.conexion;

public class DaoNotificacion {

    public int cantiEnBajoStock() {
        int canti = 0;
        String consulta = "select count(*) from producto where cantidad<= existencias";
        try (Connection con = conexion.getInstance().getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                canti = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return canti;
    }

}
