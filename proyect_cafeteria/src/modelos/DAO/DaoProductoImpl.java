
package modelos.DAO;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Bd.conexion;
import modelos.Entidades.producto;

public class DaoProductoImpl implements DAOGeneral<producto> {

    @Override
    public void insertar(producto t) {
        // Convertir el ArrayList a Integer[]
        Integer[] ingredientesArray = t.getIdIngredientes().toArray(new Integer[0]);

        String sql = "INSERT INTO public.producto (nombre, id_familia, descripcion, precio, cantidad, existencias, ids_ingrediente) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(sql)) {

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

        } catch (SQLException e) {
            System.out.println("Error al insertar el producto: " + e.getMessage());
        }
    }

    public int actualizar(producto t, int id) {
        int filaAfectada = 0;
        Integer[] ingredienteArray = t.getIdIngredientes().toArray(new Integer[0]);

        String consulta = "UPDATE producto SET nombre=?, id_familia=?, descripcion=?, precio=?, cantidad=?, existencias=?, ids_ingrediente=? WHERE id=?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta)) {

            ps.setString(1, t.getNombre());
            ps.setInt(2, t.getCategoria());
            ps.setString(3, t.getDescripcion());
            ps.setDouble(4, t.getPrecio());
            ps.setInt(5, t.getCantidad());
            ps.setInt(6, t.getStock());

            Array idsArray = con.createArrayOf("INTEGER", ingredienteArray);
            ps.setArray(7, idsArray);
            ps.setInt(8, id);

            filaAfectada = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return filaAfectada;
    }

    public void eliminarProducto(Long id) {
        String sql = "DELETE FROM public.producto WHERE id = ?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(sql)) {

            st.setLong(1, id);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int eliminarIngrediente(int id) {
        int filaAfectada = 0;
        String consulta = "DELETE FROM ingredientes WHERE id=?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta)) {

            ps.setInt(1, id);
            filaAfectada = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return filaAfectada;
    }

    public String obtenerIdIngredientes(int id) {
        String ids = null;
        String consulta = "SELECT ids_ingrediente FROM producto WHERE id=?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta);) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ids = rs.getString("ids_ingrediente");
            }

            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en dao producto");
            System.out.println(e.getMessage());
        }

        return ids;
    }

    @Override
    public List<producto> listar() {
        List<producto> listaProductos = new ArrayList<>();
        String sql = "SELECT * FROM public.producto";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(sql); ResultSet rs = st.executeQuery()) {

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

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listaProductos;
    }

    public void actualizar1(producto t, int id) {
        String consulta = "update producto set cantidad=?, existencias=? where id=?";
        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta)) {
            ps.setInt(1, t.getCantidad());
            ps.setInt(2, t.getStock());
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(Long id) {
        String consulta = "DELETE FROM producto WHERE id=?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta)) {

            ps.setLong(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(producto t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
