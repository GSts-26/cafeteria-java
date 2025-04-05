package modelos.DAO;

import controladores.EventBus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.Bd.conexion;
import modelos.Entidades.categoria;
import vistas.Categorias;

public class DaoCategoria implements DAOGeneral<categoria> {

    @Override
    public void insertar(categoria t) {
        String consulta = "INSERT INTO categoria (nombre) VALUES(?)";
        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta)) {
            ps.setString(1, t.getNombre());
            int fila_insertada = ps.executeUpdate();
            if (fila_insertada > 0) {
                listar();
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(categoria t) {
        String consulta = "UPDATE categoria SET nombre=? WHERE id=?";
        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta)) {

            ps.setString(1, t.getNombre());
            ps.setInt(2, t.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }

    public void eliminar(int id) {
        String consulta = "DELETE FROM categoria WHERE id=?";
        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            listar();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }

    @Override
    public List<categoria> listar() {
        String consulta = "SELECT * FROM categoria";
        List<categoria> listacate = new ArrayList<>();

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                categoria cate = new categoria(rs.getInt("id"), rs.getString("nombre"));
                listacate.add(cate);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
        return listacate;
    }

    public int contarCategorias() {
        int numero = 0;
        String consulta = "SELECT COUNT(*) FROM categoria";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                numero = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error al contar categorias: " + e.getMessage());
        }
        return numero;
    }

    @Override
    public void eliminar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
