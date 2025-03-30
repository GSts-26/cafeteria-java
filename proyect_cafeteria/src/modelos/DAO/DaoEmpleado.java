package modelos.DAO;

import java.util.ArrayList;
import java.util.List;
import modelos.Entidades.Empleado;
import java.sql.*;
import modelos.Bd.conexion;

public class DaoEmpleado implements DAOGeneral<Empleado> {

    @Override
    public void insertar(Empleado t) {
        long cedula = t.getCedula();
        String nombre = t.getNombre();
        Date nacimineto = (Date) t.getNacimiento();
        String genero = t.getGenero();
        long telefono = t.getTelefono();
        String email = t.getEmail();
        String direccion = t.getDireccion();
        String apellido = t.getApellido();

        // crear un usuario
        String ced = String.valueOf(cedula);
        ced = ced.substring(ced.length() - 3);
        // usuario //
        String usuario = nombre + ced;
        // crea la clave , toda la cedula y las tres primeras letras del nombre
        String clav = nombre.substring(0, 3);
        // clave //
        String clave = cedula + clav;

        String consulta = "insert into empleado values (?,?,?,?,?,?,?,?)";
        String agregarUsuario = "insert into usuario values (?,?,?)";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta); PreparedStatement psUsuario = con.prepareStatement(agregarUsuario)) {

            // Insertar usuario
            psUsuario.setString(1, usuario);
            psUsuario.setString(2, clave);
            psUsuario.setString(3, "empleado");
            psUsuario.executeUpdate();
            System.out.println("Usuario creado con éxito");

            // Insertar empleado
            ps.setLong(1, t.getCedula());
            ps.setString(2, t.getNombre());
            ps.setDate(3, new java.sql.Date(t.getNacimiento().getTime()));
            ps.setString(4, t.getGenero());
            ps.setLong(5, t.getTelefono());
            ps.setString(6, t.getEmail());
            ps.setString(7, t.getDireccion());
            ps.setString(8, t.getApellido());
            ps.executeUpdate();

            this.listar(); // Llamar al método listar después de la inserción

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Empleado t) {
        String consulta = "UPDATE empleado SET nombre=?, nacimiento=?, genero=?, telefono=?, email=?, direccion=?, apellido=? WHERE cedula=?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta)) {

            ps.setString(1, t.getNombre());
            ps.setDate(2, new java.sql.Date(t.getNacimiento().getTime()));
            ps.setString(3, t.getGenero());
            ps.setLong(4, t.getTelefono());
            ps.setString(5, t.getEmail());
            ps.setString(6, t.getDireccion());
            ps.setString(7, t.getApellido());
            ps.setLong(8, t.getCedula());
            ps.executeUpdate();

            this.listar(); // Llamar a listar después de la actualización

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(Long cedula) {
        String consulta = "DELETE FROM empleado WHERE cedula=?";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta)) {

            ps.setLong(1, cedula);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Empleado> listar() {
        List<Empleado> lista = new ArrayList<>();
        String consulta = "SELECT * FROM empleado";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Empleado empleado = new Empleado(
                        rs.getLong("cedula"),
                        rs.getString("nombre"),
                        rs.getDate("nacimiento"),
                        rs.getString("genero"),
                        rs.getLong("telefono"),
                        rs.getString("email"),
                        rs.getString("direccion"),
                        rs.getString("apellido")
                );
                lista.add(empleado);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public int contarEmpleado() {
        int numero = 0;
        String consulta = "SELECT COUNT(*) FROM empleado";

        try (Connection con = conexion.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(consulta); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                numero = rs.getInt(1);
            }

        } catch (SQLException e) {
            System.out.println("Entró al catch: " + e.getMessage());
        }

        return numero;
    }

}
