package controladores;

import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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

    public notificacionController(inicio vista) {
        this.vista = vista;
        this.daoproducto = new DaoProductoImpl();
        this.daoNotificacion = new DaoNotificacion();
        this.botonReabastecer = new JButton();
        EventBus.SubscribirseProducto(this);
    }

    private void EstilosBotones() {
        botonReabastecer.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-refresh-30.png")));
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

    @Override
    public void EscuchadorProductoActivo() {
        CantidadEnBajoStock();
        ProductosEnBajoStock();
    }

}
