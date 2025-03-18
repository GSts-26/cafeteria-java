package modelos.Bd;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class conexion {

    private static final HikariDataSource dataSource;

    // Bloque estático para inicializar el pool de conexiones
    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:5432/postgres");
        config.setUsername("postgres.pyhqsjvywazyifwdeyax");
        config.setPassword("afeteria_1234");
        config.setDriverClassName("org.postgresql.Driver"); // Especifica el driver PostgreSQL

        // Configuración del pool de conexiones
        config.setMaximumPoolSize(10);   // Máximo de conexiones activas
        config.setMinimumIdle(2);        // Mínimo de conexiones inactivas
        config.setConnectionTimeout(30000); // Tiempo máximo para obtener una conexión (30s)
        config.setIdleTimeout(600000);   // Tiempo antes de cerrar conexiones inactivas (10 min)
        config.setMaxLifetime(1800000);  // Vida máxima de una conexión (30 min)

        // Opcional: Mejoras para Supabase
        config.addDataSourceProperty("prepareThreshold", "0");

        dataSource = new HikariDataSource(config);
    }

    /**
     * Obtiene una conexión del pool.
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * Cierra la conexión devolviéndola al pool (NO la cierra físicamente).
     */
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close(); // Con HikariCP, esto solo devuelve la conexión al pool
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    /**
     * Cierra el pool de conexiones (usarlo solo al apagar la aplicación).
     */
    public static void shutdownPool() {
        if (dataSource != null && !dataSource.isClosed()) {
            dataSource.close();
            System.out.println("HikariCP ha sido cerrado.");
        }
    }
}
