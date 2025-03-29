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

    conexion conex = new modelos.Bd.conexion();

    @Override
    public void insertar(Ingrediente t) {
        try (Connection con = conex.getConnection();) {
            PreparedStatement st = con.prepareStatement("INSERT INTO public.ingredientes ( nombre, calorias, carbohidratos, proteina, azucar) VALUES(?, ?, ?, ?, ?)");

            st.setString(1, t.getNombre());
            st.setInt(2, t.getCalorias());
            st.setInt(3, t.getCarbohidratos());
            st.setInt(4, t.getProteinas());
            st.setInt(5, t.getAzucar());
            st.executeUpdate();
            this.listar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Ingrediente t) {
        String consulta = "update ingredientes set nombre=?, calorias=?, carbohidratos=?, azucar=?, proteina=? where id=?";

        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
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

        try (Connection con = conex.getConnection(); PreparedStatement st = con.prepareStatement(sql); ResultSet rs = st.executeQuery()) {

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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaIngredientes;
    }

    public void eliminar(int id) {
        String consulta = "delete from ingredientes where id=?";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Integer> obtenerInfoNutri(int id) {
        ArrayList<Integer> lista = new ArrayList<>();
        String consulta = "select calorias, carbohidratos, azucar, proteina  from ingredientes where id=?";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int calorias = rs.getInt("calorias");
                int carbos = rs.getInt("carbohidratos");
                int azucar = rs.getInt("azucar");
                int prote = rs.getInt("proteina");
                lista.add(calorias);
                lista.add(carbos);
                lista.add(azucar);
                lista.add(prote);

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
