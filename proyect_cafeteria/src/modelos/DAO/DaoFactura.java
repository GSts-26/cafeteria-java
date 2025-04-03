package modelos.DAO;

import modelos.Bd.conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelos.Entidades.detalleVenta;
import modelos.Entidades.ventas;

public class DaoFactura {

    public List<ventas> Obtenerventas() {
        List<ventas> lista = new ArrayList<>();
        String consulta = "select * from venta ";
        try (Connection con = conexion.getInstance().getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                long cliente = rs.getLong("cliente");
                long empleado = rs.getLong("empleado");
                double valorTotal = rs.getDouble("valor_total");
                Date fecha = rs.getDate("fecha");
                ventas venta = new ventas(id, cliente, empleado, valorTotal, fecha);
                lista.add(venta);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public List<ventas> filtradoPorCliente(String cedula) {
        List<ventas> Ventas = new ArrayList<>();
        String consultaCliente = "select * from venta where  CAST(cliente AS TEXT)like ?";
     
        try (Connection con = conexion.getInstance().getConnection()) {
            PreparedStatement pscliente = con.prepareStatement(consultaCliente);
            pscliente.setString(1, '%' + cedula + '%');
            ResultSet rsCliente = pscliente.executeQuery();
            while (rsCliente.next()) {
                int id = rsCliente.getInt("id");
                long cliente = rsCliente.getInt("cliente");
                long empleado = rsCliente.getInt("empleado");
                double valorTotal = rsCliente.getDouble("valor_total");
                Date fecha = rsCliente.getDate("fecha");
                ventas venta = new ventas(id, cliente, empleado, valorTotal, fecha);
                Ventas.add(venta);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Ventas;
    }

    public List<ventas> filtradoPorEmpleado(String cedula) {
        List<ventas> Ventas = new ArrayList<>();
        String consultaEmpleado = "select * from venta where CAST(empleado AS TEXT)like ?";
        try (Connection con = conexion.getInstance().getConnection()) {
           
            PreparedStatement psempleado = con.prepareStatement(consultaEmpleado);
            psempleado.setString(1, '%' + cedula + '%');
            ResultSet rsEmpleado = psempleado.executeQuery();
            while (rsEmpleado.next()) {
                int id = rsEmpleado.getInt("id");
                long cliente = rsEmpleado.getInt("cliente");
                long empleado = rsEmpleado.getInt("empleado");
                double valorTotal = rsEmpleado.getDouble("valor_total");
                Date fecha = rsEmpleado.getDate("fecha");
                ventas venta = new ventas(id, cliente, empleado, valorTotal, fecha);
                Ventas.add(venta);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return Ventas;
    }

    public List<detalleVenta> obtenerProductos() {
        List<detalleVenta> lista = new ArrayList<>();
        String consulta = "select * from detalle_venta";
        try (Connection con = conexion.getInstance().getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idVenta = rs.getInt("id_venta");
                int producto = rs.getInt("producto");
                int cantidad = rs.getInt("cantidad");
                double totalVenta = rs.getDouble("total_venta");
                detalleVenta ventaDetalle = new detalleVenta(idVenta, producto, cantidad, totalVenta);
                lista.add(ventaDetalle);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;

    }

    public List<ventas> ObtenerVentaPorFecha(java.util.Date fechaInicio, java.util.Date fechaFin) {
        List<ventas> ventas = new ArrayList<>();
        String consulta = "select * from venta where fecha between ? and ?";
        try (Connection con = conexion.getInstance().getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setDate(1, new java.sql.Date(fechaInicio.getTime()));
            ps.setDate(2, new java.sql.Date(fechaFin.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                long cliente = rs.getLong("cliente");
                long empleado = rs.getLong("empleado");
                double valorTotal = rs.getDouble("valor_total");
                Date fecha = rs.getDate("fecha");
                ventas venta = new ventas(id, cliente, empleado, valorTotal, fecha);
                ventas.add(venta);
            }
        } catch (SQLException e) {
            System.out.println("Error en el catch de filtrar por fechas" + e.getMessage());
        }
        return ventas;
    }

}
