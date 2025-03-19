//package modelos.DAO;
//
//import java.util.List;
//import modelos.Bd.conexion;
//import modelos.Entidades.Ingrediente;
//import java.sql.*;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
///**
// *
// * @author Admin
// */
//public class DaoIngredienteImpl implements DAOGeneral<Ingrediente> {
//
//    conexion conex = new modelos.Bd.conexion();
////
////    @Override
////    public void insertar(Ingrediente t)  {
////        try (Connection con = conex.getConnection();) {
////            PreparedStatement st = con.prepareStatement("INSERT INTO public.ingredientes ( nombre, calorías, carbohidratos, proteina, azucar) VALUES(?, ?, ?, ?, ?)");
////          
////            st.setString(1, t.getNombre());
////            st.setInt(2, t.getCalorias());
////            st.setInt(3, t.getCarbohidratos());
////            st.setInt(4, t.getProteinas());
////            st.setInt(5, t.getAzucar());
////            st.executeUpdate();
////            System.out.println("ingresado");
////            this.listar();
////        }catch(Exception e){
////            System.out.println(e.getMessage());
////        }
////    }
//
//    @Override
//    public void actualizar(Ingrediente t)  {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
////
////    @Override
////    public void eliminar(int id)  {
////        try (Connection con = conex.getConnection();) {
////            PreparedStatement st = con.prepareStatement("DELETE FROM public.cliente WHERE cedula = ?");
////            st.setLong(1, cedula);
////            st.executeUpdate();
////        }catch(Exception e){
////            System.out.println(e.getMessage());
////        }
////
////    }
////
////    @Override
////    public List<Ingrediente> listar() {
////         List<Ingrediente> listaClientes = new ArrayList<>();
////        String sql = "SELECT * FROM public.cliente";
////
////        try (Connection con = conex.getConnection();
////             PreparedStatement st = con.prepareStatement(sql);
////             ResultSet rs = st.executeQuery()) {
////
////            while (rs.next()) {
////                Cliente cliente = new Cliente(
////                    rs.getLong("cedula"),
////                    rs.getString("nombre"),
////                    rs.getDate("nacimiento"),
////                    rs.getString("genero"),
////                    rs.getLong("telefono"),
////                    rs.getString("email"),
////                    rs.getString("direccion")
////                );
////                listaClientes.add(cliente);
////            }
////    }catch(Exception e){
////            System.out.println(e.getMessage());
////        }
////        return listaClientes;
////}
//}
