package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private Connection conect;

    public conexion() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.err.println("Error " + e);
        }
    }

    public Connection getConnection() {
        try {
            return conect
                    = conect = DriverManager.getConnection(
                            "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:5432/postgres",
                            "postgres.pyhqsjvywazyifwdeyax", // Usuario
                            "afeteria_1234"); // Contraseña

        } catch (SQLException e) {
            System.err.println("Error al obtener la conexion " + e.getMessage());
            return null;
        }
    }
}
