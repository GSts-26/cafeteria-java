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
         try (Connection con = conex.getConnection();) {
            PreparedStatement st = con.prepareStatement("INSERT INTO public.producto (nombre,id_familia,descripcion,precio,cantidad,existencias,ids_ingredientes) VALUES(?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, t.getNombre());
            st.setInt(2, t.getCategorias());
            st.setString(3, t.getDescripcion());
            st.setDouble(4, t.getPrecio());
            st.setArray(5, (Array) t.getIdIngredientes());
            st.executeQuery();
            System.out.println("ingresado");
        }catch(Exception e){
            System.out.println(e.getMessage());
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
//                producto product = new producto(
//                    
//                );
//                listaProductos.add(product);
            }
    }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return listaProductos;

    }
    
}
