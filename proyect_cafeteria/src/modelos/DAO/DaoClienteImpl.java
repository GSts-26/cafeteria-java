package modelos.DAO;

import java.util.List;
import modelos.Bd.conexion;
import modelos.Entidades.Cliente;
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
public class DaoClienteImpl implements DAOGeneral<Cliente> {

    conexion conex = new modelos.Bd.conexion();

    @Override
    public void insertar(Cliente t)  {
        try (Connection con = conex.getConnection();) {
            PreparedStatement st = con.prepareStatement("INSERT INTO public.cliente (cedula, nombre, nacimiento, genero, telefono, email, direccion) VALUES(?, ?, ?, ?, ?, ?, ?)");
            st.setLong(1, t.getCedula());
            st.setString(2, t.getNombre());
            st.setDate(3, (t.getFechaNacimiento()));
            st.setString(4, t.getGenero());
            st.setLong(5, t.getTelefono());
            st.setString(6, t.getEmail());
            st.setString(7, t.getDireccion());
            st.executeUpdate();
            System.out.println("ingresado");
            this.listar();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Cliente t)  {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Long cedula)  {
        try (Connection con = conex.getConnection();) {
            PreparedStatement st = con.prepareStatement("DELETE FROM public.cliente WHERE cedula = ?");
            st.setLong(1, cedula);
            st.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public List<Cliente> listar() {
         List<Cliente> listaClientes = new ArrayList<>();
        String sql = "SELECT * FROM public.cliente";

        try (Connection con = conex.getConnection();
             PreparedStatement st = con.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente(
                    rs.getLong("cedula"),
                    rs.getString("nombre"),
                    rs.getDate("nacimiento"),
                    rs.getString("genero"),
                    rs.getLong("telefono"),
                    rs.getString("email"),
                    rs.getString("direccion")
                );
                listaClientes.add(cliente);
            }
    }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return listaClientes;
}
}
