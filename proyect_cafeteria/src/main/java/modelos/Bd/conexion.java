//package modelos.Bd;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class conexion {
//
//    private static final HikariDataSource dataSource;
//
//    // Bloque estático para inicializar el pool de conexiones
//    static {
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres");
//        config.setUsername("postgres.daiackbvsdzqgxbyurcq");
//        config.setPassword("cafeteria?123.sf"   );
//        config.setDriverClassName("org.postgresql.Driver"); // Especifica el driver PostgreSQL
//
//        // Configuración del pool de conexiones
//        config.setMaximumPoolSize(10);   // Máximo de conexiones activas
//        config.setMinimumIdle(2);        // Mínimo de conexiones inactivas
//        config.setConnectionTimeout(30000); // Tiempo máximo para obtener una conexión (30s)
//        config.setIdleTimeout(600000);   // Tiempo antes de cerrar conexiones inactivas (10 min)
//        config.setMaxLifetime(1800000);  // Vida máxima de una conexión (30 min)
//
//        // Opcional: Mejoras para Supabase
//        config.addDataSourceProperty("prepareThreshold", "0");
//
//        dataSource = new HikariDataSource(config);
//    }
//
//    /**
//     * Obtiene una conexión del pool.
//     */
//    public static Connection getConnection() throws SQLException {
//        return dataSource.getConnection();
//    }
//
//    /**
//     * Cierra la conexión devolviéndola al pool (NO la cierra físicamente).
//     */
//    public static void closeConnection(Connection connection) {
//        if (connection != null) {
//            try {
//                connection.close(); // Con HikariCP, esto solo devuelve la conexión al pool
//            } catch (SQLException e) {
//                System.err.println("Error al cerrar la conexión: " + e.getMessage());
//            }
//        }
//    }
//
//    /**
//     * Cierra el pool de conexiones (usarlo solo al apagar la aplicación).
//     */
//    public static void shutdownPool() {
//        if (dataSource != null && !dataSource.isClosed()) {
//            dataSource.close();
//            System.out.println("HikariCP ha sido cerrado.");
//        }
//    }
//}
package modelos.Bd;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    private static HikariDataSource dataSource;

    private static final conexion INSTANCE = new conexion();

    private conexion() {
        // Constructor privado para Singleton
        initDataSource();
    }

    public static conexion getInstance() {
        return INSTANCE;
    }

    private void initDataSource() {
        try {
            HikariConfig config = new HikariConfig();

            // Configuración de conexión PostgreSQL
            config.setJdbcUrl("jdbc:postgresql://ep-shiny-unit-aclvurk4-pooler.sa-east-1.aws.neon.tech:5432/CafeteriaDB?sslmode=require");
            config.setUsername("CafeteriaDB_owner");
            config.setPassword("npg_nx3ZIE0ruPyv");

//            config.setJdbcUrl("jdbc:postgresql://localhost:5432/cafeteriabd?sslmode=require");
//            config.setUsername("postgres");
//            config.setPassword("12345678");
            // Configuración del pool
            config.setMaximumPoolSize(10);
            config.setMinimumIdle(2);
            config.setIdleTimeout(30000);
            config.setConnectionTimeout(10000);
            config.setMaxLifetime(1800000);

            // Propiedades específicas PostgreSQL
            config.addDataSourceProperty("cachePrepStmts", "true");
            config.addDataSourceProperty("prepStmtCacheSize", "250");
            config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

            // Nombre del pool para identificarlo en logs
            config.setPoolName("PostgreSQLHikariCP");

            dataSource = new HikariDataSource(config);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No tienes Conexion a Internet");
            throw new RuntimeException("No se pudo inicializar la conexión a la base de datos", e);
        }
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar ResultSet:");
        }

        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar resultset:");
        }

        try {
            if (conn != null) {
                conn.close(); // No cierra realmente, devuelve al pool
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar Conexion:");
        }
    }

    public void shutdown() {
        if (dataSource != null && !dataSource.isClosed()) {
            dataSource.close();

        }
    }
}