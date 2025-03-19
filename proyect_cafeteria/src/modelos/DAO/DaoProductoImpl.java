/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.DAO;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelos.Bd.conexion;
import modelos.Entidades.producto;

/**
 *
 * @author Admin
 */
public class DaoProductoImpl implements DAOGeneral<producto>{

    conexion conex = new modelos.Bd.conexion();
    
    @Override
    public void insertar(producto t) {
        // Convertir el ArrayList a Integer[]
        Integer[] ingredientesArray = t.getIdIngredientes().toArray(new Integer[0]);

        try (Connection con = conex.getConnection()) {
            String sql = "INSERT INTO public.producto (nombre, id_familia, descripcion, precio, cantidad, existencias, ids_ingrediente) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, t.getNombre());
            st.setInt(2, t.getCategoria());
            st.setString(3, t.getDescripcion());
            st.setDouble(4, t.getPrecio());
            st.setInt(5, t.getCantidad());
            st.setInt(6, t.getStock());

            Array pgArray = con.createArrayOf("INTEGER", ingredientesArray);
            st.setArray(7, pgArray);


            st.executeUpdate();
            System.out.println("Producto ingresado con éxito");
        } catch (Exception e) {
            System.out.println("Error al insertar el producto: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(producto t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Long id) {
        try (Connection con = conex.getConnection();) {
            PreparedStatement st = con.prepareStatement("DELETE FROM public.producto WHERE id = ?");
            st.setLong(1, id);
            st.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<producto> listar() {
         List<producto> listaProductos = new ArrayList<>();
        String sql = "SELECT * FROM public.producto";

        try (Connection con = conex.getConnection();
             PreparedStatement st = con.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                producto product = new producto(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("id_familia"),
                        rs.getString("descripcion"),
                        rs.getDouble("precio"),
                        rs.getInt("cantidad"),
                        rs.getInt("existencias")
                );
                listaProductos.add(product);
            }
    }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return listaProductos;

    }
    
}
