package controladores;

import vistas.Panel_factura;

public class metodo_factura {
    
    private Panel_factura facturas;
    
    public metodo_factura(Panel_factura factura) {
        this.facturas = factura;
    }
    
    public void itemSeleccionado() {
        String itemSelec = String.valueOf(facturas.getCombo_filtro().toString());
        facturas.getMS_cliente().setText("Filtrado por" + itemSelec);
        if (itemSelec.equalsIgnoreCase("fecha")) {
            facturas.getMS_fec_Ini().setVisible(true);
            facturas.getMS_fec_fin().setVisible(true);
            facturas.getTxt_fecha2().setVisible(true);
            facturas.getBoton_filtrar_fecha().setVisible(true);
            
        } else {
            facturas.getMS_fec_Ini().setVisible(false);
            facturas.getMS_fec_fin().setVisible(false);
            facturas.getTxt_fecha2().setVisible(false);
            facturas.getBoton_filtrar_fecha().setVisible(false);
            
        }
    }
    
    public void filtrarFecha() {
        if (facturas.getTxt_fecha1().getText().isEmpty() || facturas.getTxt_fecha2().getText().isEmpty()) {
            facturas.getMS_fechas().setVisible(true);
        } else {
            facturas.getMS_fechas().setVisible(false);
            
        }
    }
    
    public void filas_seleccionadas() {
        int filasSeleccionadas = facturas.getTabla_fact().getSelectedRowCount();
        if (filasSeleccionadas > 1 || filasSeleccionadas <= 0) {
            facturas.getmsFilasTabla().setVisible(true);
        } else {
            facturas.getmsFilasTabla().setVisible(false);
        }
    }
    
}
