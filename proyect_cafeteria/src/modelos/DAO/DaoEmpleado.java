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
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            PreparedStatement psUsuario = con.prepareStatement(agregarUsuario);
            // enviar los datos para crear un usuario
            psUsuario.setString(1, usuario);
            psUsuario.setString(2, clave);
            psUsuario.setString(3, "empleado");
            psUsuario.executeUpdate();
            System.out.println("Usuario creado con exito");

            ps.setLong(1, cedula);
            ps.setString(2, nombre);
            ps.setDate(3, nacimineto);
            ps.setString(4, genero);
            ps.setLong(5, telefono);
            ps.setString(6, email);
            ps.setString(7, direccion);
            ps.setString(8, apellido);
            ps.executeUpdate();
            this.listar();
            // cerrar la conexion y el preparedStatment
            con.close();
            ps.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Empleado t) {
        String consulta = "update empleado set nombre=?, nacimiento=?, genero=?, telefono=?, email=?, direccion=?, apellido=? where cedula=?";
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
            ps.executeUpdate();
            this.listar();
            con.close();
            ps.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void eliminar(Long cedula) {
        String consulta = "delete from empleado where cedula=?";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setLong(1, cedula);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Empleado> listar() {
        List<Empleado> lista = new ArrayList<>();
        String consulta = ("select * from empleado");
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                long cedula = rs.getLong("cedula");
                String nombre = rs.getString("nombre");
                Date nacimineto = rs.getDate("nacimiento");
                String genero = rs.getString("genero");
                long telefono = rs.getLong("telefono");
                String email = rs.getString("email");
                String direccion = rs.getString("direccion");
                String apellido = rs.getString("apellido");
                Empleado empleado = new Empleado(cedula, nombre, nacimineto, genero, telefono, email, direccion, apellido);
                lista.add(empleado);
            }
//            return lista;

            con.close();
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public int contarEmpleado() {
        int numero = 0;
        String consulta = "SELECT COUNT(*) FROM empleado";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                numero = rs.getInt(1);
            }

        } catch (SQLException e) {
            System.out.println("Entro al catch" + e.getMessage());
        }

        return numero;
    }

}
