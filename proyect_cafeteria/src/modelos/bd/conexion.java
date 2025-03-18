package modelos.bd;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private Connection conect;

    private HikariDataSource dataSource;

    public conexion() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:5432/postgres");
        config.setUsername("postgres.pyhqsjvywazyifwdeyax");
        config.setPassword("afeteria_1234");
        config.setMaximumPoolSize(6); 
         config.setMinimumIdle(2);        
        config.setConnectionTimeout(30000); // Timeout de conexión (30 segundos)
        config.setIdleTimeout(600000);     // Tiempo de inactividad antes de cerrar conexiones (10 minutos)
        config.setMaxLifetime(300000);    // Vida máxima de una conexión (30 minutos)

        dataSource = new HikariDataSource(config);
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
