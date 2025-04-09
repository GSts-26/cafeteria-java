package modelos.DAO;

import java.util.List;
import modelos.Bd.conexion;
import modelos.Entidades.Cliente;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;


public class DaoClienteImpl implements DAOGeneral<Cliente> {

    @Override
    public void insertar(Cliente t) {
        String consulta = "INSERT INTO public.cliente (cedula, nombre, nacimiento, genero, telefono, email, direccion) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(consulta)) {

            st.setLong(1, t.getCedula());
            st.setString(2, t.getNombre());
            st.setDate(3, t.getFechaNacimiento());
            st.setString(4, t.getGenero());
            st.setLong(5, t.getTelefono());
            st.setString(6, t.getEmail());
            st.setString(7, t.getDireccion());
            st.executeUpdate();

            System.out.println("Cliente ingresado");
            this.listar();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(Cliente t) {
        String consulta = "UPDATE cliente SET nombre=?, nacimiento=?, genero=?, telefono=?, email=?, direccion=? WHERE cedula=?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta)) {

            ps.setString(1, t.getNombre());
            ps.setDate(2, t.getFechaNacimiento());
            ps.setString(3, t.getGenero());
            ps.setLong(4, t.getTelefono());
            ps.setString(5, t.getEmail());
            ps.setString(6, t.getDireccion());
            ps.setLong(7, t.getCedula());
            ps.executeUpdate();

            listar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(Long cedula) {
        String consulta = "DELETE FROM public.cliente WHERE cedula = ?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(consulta)) {

            st.setLong(1, cedula);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> listaClientes = new ArrayList<>();
        String sql = "SELECT * FROM public.cliente";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(sql); ResultSet rs = st.executeQuery()) {

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
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
        return listaClientes;
    }
    public List<Cliente> Filtrar(String cedula) {
        List<Cliente> listaClientes = new ArrayList<>();
        String sql = "SELECT * FROM public.cliente where CAST(cedula AS TEXT) like ?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(sql); ) {
st.setString(1, '%'+cedula+'%');
ResultSet rs = st.executeQuery();
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
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
        return listaClientes;
    }

}
