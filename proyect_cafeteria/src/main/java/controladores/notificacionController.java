package controladores;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import modelos.DAO.DaoNotificacion;
import modelos.DAO.DaoProductoImpl;
import modelos.Entidades.producto;
import vistas.inicio;
import modelos.DAO.EscuchadorProducto;

public class notificacionController implements EscuchadorProducto {

    private inicio vista;
    private DaoProductoImpl daoproducto;
    private DaoNotificacion daoNotificacion;
    private List<producto> listaProducto;
    private DefaultTableModel modeloTabla;
    private JButton botonReabastecer;
    private int Stock = 0;
    private int cantidad = 0;

    public notificacionController(inicio vista) {
        this.vista = vista;
        this.daoproducto = new DaoProductoImpl();
        this.daoNotificacion = new DaoNotificacion();
        this.botonReabastecer = new JButton();
        EventBus.SubscribirseProducto(this);
    }

    private void EstilosBotones() {
        botonReabastecer.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-edit-30.png")));
        botonReabastecer.setBorder(BorderFactory.createEmptyBorder());
    }

    public void ProductosEnBajoStock() {
        EstilosBotones();
        modeloTabla = (DefaultTableModel) vista.tabla_notificacion.getModel();
        modeloTabla.setRowCount(0);
        listaProducto = daoproducto.listar();
        for (producto prod : listaProducto) {
            int cantidad = prod.getCantidad();
            int limite = prod.getStock();
            if (cantidad <= limite) {
                modeloTabla.addRow(new Object[]{
                        prod.getNombre(),
                        prod.getCantidad(),
                        prod.getStock(),
                        botonReabastecer});
            }
        }
        if (modeloTabla.getRowCount() == 0) {
            vista.PanelSinAlertas.setVisible(true);
        } else {
            vista.PanelSinAlertas.setVisible(false);

        }
    }

    public void ocultar() {
        vista.lblCantiEn_bajo_Stock.setVisible(false);
    }

    public void CantidadEnBajoStock() {
        vista.lblCantiEn_bajo_Stock.setVisible(true);

        int cantiBaja = daoNotificacion.cantiEnBajoStock();
        if (cantiBaja > 0) {
            vista.lblCantiEn_bajo_Stock.setVisible(true);
            vista.lblCantiEn_bajo_Stock.setText(String.valueOf(cantiBaja));
        } else {
            vista.lblCantiEn_bajo_Stock.setText("0");
        }
    }

    public void AccionTabla() {
        int idProducto = 0;
        modeloTabla = (DefaultTableModel) vista.tabla_notificacion.getModel();
        int fila = vista.tabla_notificacion.getSelectedRow();
        int columna = vista.tabla_notificacion.getSelectedColumn();
        String producto = modeloTabla.getValueAt(fila, 0).toString();
        int cantidad = (int) modeloTabla.getValueAt(fila, 1);
        int stock = (int) modeloTabla.getValueAt(fila, 2);
        if (columna == 3) {
            for (producto p : listaProducto) {
                if (p.getNombre().equals(producto)) {
                    idProducto = p.getId();
                }
            }
            vista.reabastecerProducto.setPreferredSize(new Dimension(407, 330));
            vista.reabastecerProducto.setMinimumSize(new Dimension(407, 330));
            vista.reabastecerProducto.setMaximumSize(new Dimension(407, 330));
            vista.reabastecerProducto.setLocationRelativeTo(null);
            vista.reabastecerProducto.setVisible(true);
            vista.txtNombreProducto.setText(producto);
            vista.txtCantidad.setValue(cantidad);
            vista.txtStock.setValue(stock);
            vista.IdProducto.setText(String.valueOf(idProducto));
            vista.IdProducto.setVisible(false);
            vista.m1CantidadInvalida.setVisible(false);
        }

    }

    public void Limpiar() {
        vista.txtStock.setValue(0);
        vista.txtNombreProducto.setText("");
        vista.txtCantidad.setValue(0);
        vista.IdProducto.setText("");
        vista.IdProducto.setVisible(false);
    }

    public void Actualizar() {
        vista.txtNombreProducto.setText(vista.txtNombreProducto.getText());
        Stock = (int) vista.txtStock.getValue();
        cantidad = (int) vista.txtCantidad.getValue();
        int idProducto = Integer.parseInt(vista.IdProducto.getText());
        if (CantidadMinimo()) {
            return;
        }
        if (cantidad <= Stock) {
            JOptionPane.showMessageDialog(null,
                    "No puedes agregar esa cantidad de producto",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            vista.txtCantidad.requestFocus();
            return;
        }

        producto c = new producto(cantidad, Stock);
        daoproducto.actualizar1(c, idProducto);
        Limpiar();
        EventBus.PublishProducto();
        JOptionPane.showMessageDialog(null, "Producto Actualizado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        vista.reabastecerProducto.dispose();
    }

    private boolean CantidadMinimo() {
        boolean ok = false;
        if (cantidad <= 0) {
            vista.m1CantidadInvalida.setVisible(true);
            ok = true;

        } else {
            vista.m1CantidadInvalida.setVisible(false);
            ok = false;
        }
        return ok;
    }


    @Override
    public void EscuchadorProductoActivo() {
        CantidadEnBajoStock();
        ProductosEnBajoStock();
    }

}

