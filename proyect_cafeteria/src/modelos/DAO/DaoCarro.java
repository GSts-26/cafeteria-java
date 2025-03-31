package modelos.DAO;

import modelos.Bd.conexion;
import modelos.Entidades.CarroCompras;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class DaoCarro implements DAOGeneral.DaoVenta {

    //insertar productos al carro
    @Override
    public void insertar(CarroCompras t) {
    }

    //actualizar precios productos
    @Override
    public void actualizar(CarroCompras t) {
        String sentencia = "update public.pedidos set Total = ? where id=?";
        try (Connection con = conexion.getConnection(); PreparedStatement st = con.prepareStatement(sentencia)) {
            st.setDouble(1, t.getTotal());
            st.setInt(2, t.getIdCarro());
            st.executeUpdate(sentencia);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(Long id) {
        String sql = "DELETE FROM public.carro_compra WHERE id = ?";
        try (Connection con = conexion.getConnection(); PreparedStatement st = con.prepareStatement(sql)) {

            st.setLong(1, id);
            st.executeUpdate();

        } catch (Exception e) {
            System.err.println("Error al eliminar el carro: " + e.getMessage());
        }
    }

    @Override
    public List<CarroCompras> listar() {
        return List.of();
    }

    @Override
    public int insertreturning(CarroCompras t) {
        int id = 0;
        String sql = "INSERT INTO public.carro_compra (cliente, empleado, estado) VALUES(?, ?, ?) RETURNING id";

        try (Connection con = conexion.getConnection(); PreparedStatement st = con.prepareStatement(sql)) {

            // Asigna valores a la consulta
            st.setLong(1, t.getCliente());
            st.setLong(2, t.getEmpleado());
            st.setBoolean(3, t.isEstado());

            // Ejecuta la consulta y obtiene el ID generado
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    id = rs.getInt(1);
                }
            }
            System.out.println("Pedido nuevo en curso....");
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Manejo de errores
        }
        return id; // Retorna el ID del nuevo pedido
    }

    @Override
    public CarroCompras activo(long cedulaempleado) {
        CarroCompras c = new CarroCompras();
        String sql = "SELECT id, cliente, empleado, estado FROM public.carro_compra WHERE empleado = ? AND estado = TRUE LIMIT 1";

        try (Connection con = conexion.getConnection(); PreparedStatement st = con.prepareStatement(sql)) {

            st.setLong(1, cedulaempleado);

            // Ejecuta la consulta y obtiene el estado del carro de compras
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    
                    c.setIdCarro(rs.getInt("id"));
                    c.setCliente(rs.getLong("cliente"));
                    c.setEmpleado(rs.getLong("empleado"));
                    c.setEstado(rs.getBoolean("estado"));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Manejo de errores
        }
        return c;
    }

    @Override
    public void actualizarValor(CarroCompras compras) {
//        String sentencia = "update public.pedidos set valor_total = ? where id_pedido=?";
//        try (Connection con = conexion.getConnection(); Statement st = con.createStatement()) {
//            st.setLong(1, valor);
//            st.setLong(2, pedido);
//            st.executeUpdate(sentencia);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

}
