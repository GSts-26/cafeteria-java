/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.DAO;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelos.Bd.conexion;
import modelos.Entidades.itemsCarro;

/**
 *
 * @author Admin
 */
public class DaoitemsCarro implements DAOGeneral.DaoItemsCarro {

    @Override
    public void insertar(itemsCarro t) {
        String sql = ("INSERT INTO public.carro_productos (id_carro, producto, cantidad, total) VALUES(?, ?, ?,?)");
        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(sql)) {
            st.setLong(1, t.getIdCarro_compra());
            st.setLong(2, (t.getProductos_compra()));
            st.setLong(3, t.getCantidad_producto());
            st.setDouble(4, t.getTotal_item());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(itemsCarro t) {

    }

    @Override
    public void eliminar(Long id) {
        String sql = "DELETE FROM public.carro_productos WHERE id_carro = ?";
        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(sql)) {
            st.setLong(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }

    @Override
    public void EliminarTodo() {

    }

    @Override
    public List<itemsCarro> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HashMap<Integer, Object> listar(int idcarro) {
        HashMap<Integer, Object> mapaProductos = new HashMap<>();
        String sql = "SELECT producto, cantidad, total FROM public.carro_productos WHERE id_carro = ?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement st = con.prepareStatement(sql)) {

            st.setInt(1, idcarro);

            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    int idProducto = rs.getInt("producto");
                    itemsCarro item = new itemsCarro();
                    item.setProductos_compra(idProducto);
                    item.setCantidad_producto(rs.getInt("cantidad"));
                    item.setTotal_item(rs.getDouble("total"));
                    mapaProductos.put(idProducto, item);
                }
            }
        } catch (Exception e) {
            System.err.println("Error al obtener productos del pedido: " + e.getMessage());
        }

        return mapaProductos;
    }

    public void TransaccionOperacional(int idCarro) {
        String sql1 = "INSERT INTO venta (id,cliente, empleado, valor_total) SELECT id,cliente, empleado, total FROM carro_compra WHERE id = ?";
        String sql2 = "INSERT INTO detalle_venta(id_venta,producto,cantidad,total_venta) SELECT id_carro, producto, cantidad, total FROM carro_productos WHERE id_carro = ?";
        String sql3 = "DELETE FROM carro_compra WHERE id = ?";
        String sql4 = "update producto p set  cantidad  = p.cantidad  - dp.cantidad from detalle_venta dp where dp.id_venta =? and dp.producto = id";

        try (Connection con = conexion.getInstance().getConnection();) {
            con.setAutoCommit(false);
            try (PreparedStatement stmt1 = con.prepareStatement(sql1); PreparedStatement stmt2 = con.prepareStatement(sql2); PreparedStatement stmt3 = con.prepareStatement(sql3); PreparedStatement stm4 = con.prepareStatement(sql4);) {

                stmt1.setInt(1, idCarro);
                stmt2.setInt(1, idCarro);
                stmt3.setInt(1, idCarro);
                stm4.setInt(1, idCarro);

                stmt1.executeUpdate();
                stmt2.executeUpdate();
                stmt3.executeUpdate();
                stm4.executeUpdate();

                con.commit();
            } catch (Exception e) {
                con.rollback();
                System.out.println(e);
                System.out.println("error en la transaccion");
            }
        } catch (Exception e) {
            System.out.println("error en la conexion");

        }
    }
}
