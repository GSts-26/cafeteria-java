/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import vistas.Clientes;

import com.formdev.flatlaf.FlatClientProperties;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.DAO.DaoClienteImpl;
import modelos.Entidades.Cliente;

/**
 *
 * @author SENA
 */
public class Controller_cliente {

    private final Clientes vista; //vista del panel
    private DaoClienteImpl clienteDAO;
    private DefaultTableModel modeloClientes;
    private int clientesContador;
    private List<Cliente> clientes = new ArrayList<>();
    JButton boton = new JButton();

    public Controller_cliente(Clientes Views_client) {
        this.vista = Views_client;
        this.clienteDAO = new DaoClienteImpl();
        this.clientesContador = 0;

    }

    public void ingresar() {
        Cliente cliente = new Cliente(Long.parseLong(vista.txtcedula.getText()), vista.getTxtnombre().getText(), new java.sql.Date(vista.getTxtnacimiento().getDate().getTime()), vista.getTxtgenero().getSelectedItem().toString(),
                Long.parseLong(vista.getTxttelefono().getText()),
                vista.getTxtEmail().getText(),
                vista.getTxtDireccion().getText()
        );
        clienteDAO.insertar(cliente);
        JOptionPane.showMessageDialog(null, "Cliente Ingresado");
        mostrar();

    }

    public void mostrar() {
        modeloClientes = (DefaultTableModel) vista.getT_Clientes().getModel();
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-20.png")));
        boton.putClientProperty(FlatClientProperties.STYLE,
                "arc: 50");
        modeloClientes.setRowCount(0);
        clientesContador = 0;
        List<Cliente> clientes = clienteDAO.listar();
        if (clientes.isEmpty()) {
            vista.getAdvertencia().setVisible(true);
            System.out.println("No hay clientes en la base de datos.");
        } else {
            vista.getAdvertencia().setVisible(false);
            for (Cliente Cliente : clientes) {
                clientesContador++;
                modeloClientes.addRow(new Object[]{
                    Cliente.getCedula(),
                    Cliente.getNombre(),
                    Cliente.getFechaNacimiento(),
                    Cliente.getGenero(),
                    Cliente.getTelefono(),
                    Cliente.getEmail(),
                    Cliente.getDireccion(),
                    boton
                });
            }
            vista.getnumero().setText(String.valueOf(clientesContador));
        }
    }

    public void Acciones_tabla() {
        int columna = vista.getT_Clientes().getSelectedColumn();
        int fila = vista.getT_Clientes().getSelectedRow();

        if (columna == 7) {
            Long valorEliminar = Long.parseLong(vista.getT_Clientes().getValueAt(fila, 0).toString());
            clienteDAO.eliminar(valorEliminar);
            JOptionPane.showMessageDialog(null, "Cliente Eliminado Correctamente");
            mostrar();
        }

    }

    public void actualizar() {
    }
}
