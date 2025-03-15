package Conexion;

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
        config.setMaximumPoolSize(10); // Puedes ajustar el tamaño del pool según lo necesario

        dataSource = new HikariDataSource(config);
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
