package Modelo.DAO;

import Modelo.Entidades.Empleado;
import Modelo.bd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOEmpleadoimpl implements DAOGeneral<Empleado> {

    @Override
    public void Insertar(Empleado t) {
        String consulta = "INSERT INTO empleado (cedula, nombre, apellido, nacimiento, genero, telefono, email, direccion) VALUES(?,?,?,?,?,?,?,?)";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps_insertar = con.prepareStatement(consulta);
            ps_insertar.setLong(1, t.getCedula());
            ps_insertar.setString(2, t.getNombre());
            ps_insertar.setString(3, t.getApellido());
            ps_insertar.setDate(4, new java.sql.Date(t.getNacimiento().getTime()));
            ps_insertar.setString(5, t.getGenero());
            ps_insertar.setLong(6, t.getTelefono());
            ps_insertar.setString(7, t.getEmail());
            ps_insertar.setString(8, t.getDireccion());
            int fila_insertada = ps_insertar.executeUpdate();
            if (fila_insertada > 0) {
                listar();
                JOptionPane.showMessageDialog(null, "Empleado agregado correctamente", "Agregado", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (SQLException e) {
            System.out.println("catch de insertar" + e.getMessage());
        }

    }

    @Override
    public List<Empleado> listar() {
        List<Empleado> listaEmpleado = new ArrayList<>();

        String consulta = "SELECT * FROM empleado WHERE nombre LIKE ? OR  apellido LIKE ?";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setString(1, "%");
            ps.setString(2, "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Empleado emplead = new Empleado(
                        rs.getLong("cedula"),
                        rs.getString("nombre"),
                        rs.getDate("nacimiento"),
                        rs.getString("genero"),
                        rs.getLong("telefono"),
                        rs.getString("email"),
                        rs.getString("direccion"),
                        rs.getString("apellido"));
                listaEmpleado.add(emplead);
            }
        } catch (SQLException e) {
            System.out.println("Catch de listar" + e.getMessage());

        }

        return listaEmpleado;
    }

    @Override
    public void Eliminar(long cedula) {
        String consulta = "DELETE FROM empleado WHERE cedula=?";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setLong(1, cedula);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                listar();
                JOptionPane.showMessageDialog(null, "Empleado eliminado", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Catch de eliminar" + e.getMessage());
        }

    }

    @Override
    public void Actualizar(Empleado t) {
        String consulta = "UPDATE empleado SET nombre=?, nacimiento=?, genero=?, telefono=?, email=?, direccion=?, apellido=? WHERE cedula=?";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setString(1, t.getNombre());
            ps.setDate(2, new java.sql.Date(t.getNacimiento().getTime()));
            ps.setString(3, t.getGenero());
            ps.setLong(4, t.getTelefono());
            ps.setString(5, t.getEmail());
            ps.setString(6, t.getDireccion());
            ps.setString(7, t.getApellido());
            ps.setLong(8, t.getCedula());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Empleado Actualizado", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Catch de actualizar" + e.getMessage());

        }
    }

}
