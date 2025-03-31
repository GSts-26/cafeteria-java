package modelos.DAO;

import java.util.List;
import modelos.Bd.conexion;
import modelos.Entidades.Ingrediente;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class DaoIngredienteImpl implements DAOGeneral<Ingrediente> {

    @Override
    public void insertar(Ingrediente t) {
        String sql = "INSERT INTO public.ingredientes (nombre, calorias, carbohidratos, proteina, azucar) VALUES(?, ?, ?, ?, ?)";
        try (Connection con = conexion.getConnection(); PreparedStatement st = con.prepareStatement(sql)) {

            st.setString(1, t.getNombre());
            st.setInt(2, t.getCalorias());
            st.setInt(3, t.getCarbohidratos());
            st.setInt(4, t.getProteinas());
            st.setInt(5, t.getAzucar());
            st.executeUpdate();

            this.listar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Ingrediente t) {
        String sql = "UPDATE ingredientes SET nombre=?, calorias=?, carbohidratos=?, azucar=?, proteina=? WHERE id=?";
        try (Connection con = conexion.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, t.getNombre());
            ps.setInt(2, t.getCalorias());
            ps.setInt(3, t.getCarbohidratos());
            ps.setInt(4, t.getAzucar());
            ps.setInt(5, t.getProteinas());
            ps.setInt(6, t.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Ingrediente> listar() {
        List<Ingrediente> listaIngredientes = new ArrayList<>();
        String sql = "SELECT * FROM public.ingredientes";

        try (Connection con = conexion.getConnection(); PreparedStatement st = con.prepareStatement(sql); ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                Ingrediente ing = new Ingrediente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("calorias"),
                        rs.getInt("carbohidratos"),
                        rs.getInt("proteina"),
                        rs.getInt("Azucar")
                );
                listaIngredientes.add(ing);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaIngredientes;
    }

    
    public void eliminar(int id) {
        String sql = "DELETE FROM ingredientes WHERE id=?";
        try (Connection con = conexion.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Integer> obtenerInfoNutri(int id) {
        ArrayList<Integer> lista = new ArrayList<>();
        String sql = "SELECT calorias, carbohidratos, azucar, proteina FROM ingredientes WHERE id=?";

        try (Connection con = conexion.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    lista.add(rs.getInt("calorias"));
                    lista.add(rs.getInt("carbohidratos"));
                    lista.add(rs.getInt("azucar"));
                    lista.add(rs.getInt("proteina"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public void eliminar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
