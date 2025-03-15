/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import vistas.Clientes;

import java.sql.*;
import Conexion.conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SENA
 */
public class Controller_cliente {

    private Clientes vista;
    DefaultTableModel modeloClientes;

    Conexion.conexion conex = new conexion();

    public Controller_cliente(Clientes Views_client) {
        this.vista = Views_client;
    }

    public void ingresar() {
        String consulta = "INSERT INTO public.cliente (cedula, nombre, nacimiento, genero, telefono, email, direccion) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = conex.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setLong(1, Long.parseLong(vista.getTxtcedula().getText()));
            ps.setString(2, vista.getTxtnombre().getText());
            ps.setDate(3, new java.sql.Date(vista.getTxtnacimiento().getDate().getTime()));
            ps.setString(4, vista.getTxtgenero().getSelectedItem().toString());
            ps.setInt(5, Integer.parseInt(vista.getTxttelefono().getText()));
            ps.setString(6, vista.getTxtEmail().getText());
            ps.setString(7, vista.getTxtDireccion().getText());
            ps.executeUpdate();
            mostrar();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void mostrar() {
        modeloClientes = (DefaultTableModel) vista.getT_Clientes().getModel();
        modeloClientes.setRowCount(0);
        String consulta = "SELECT * FROM public.cliente";
        try (Connection con = conex.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vista.getAdvertencia().setVisible(false);
                do {
                    modeloClientes.addRow(new Object[]{
                        rs.getLong("cedula"),
                        rs.getString("nombre"),
                        rs.getDate("nacimiento"),
                        rs.getString("genero"),
                        rs.getLong("telefono"),
                        rs.getString("email"),
                        rs.getString("direccion")
                    });

                } while (rs.next());
            } else {
                System.out.println("vacio");
                vista.getAdvertencia().setVisible(true);
            }
        } catch (SQLException ex) {
            
            System.out.println(ex);
        }

    }

    public void eliminar() {
        int columna = vista.getT_Clientes().getSelectedColumn();
        int fila = vista.getT_Clientes().getSelectedRow();
        modeloClientes = (DefaultTableModel) vista.getT_Clientes().getModel();
        if (columna == 7) {
            int valorEliminar = Integer.parseInt(vista.getT_Clientes().getValueAt(fila, 0).toString());
            String peticion = "DELETE FROM public.cliente WHERE cedula=?";
            try (Connection con = conex.getConnection()) {
                PreparedStatement stmt = con.prepareStatement(peticion);
                stmt.setLong(1, Long.parseLong(vista.getTxtcedula().getText()));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente Eliminado Correctamente");
                mostrar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hubo un erro al eliminar este cliente");
            }
        }

    }
}
