package controladores;

import vistas.Panel_factura;
import java.sql.*;
import modelos.Bd.conexion;

public class metodo_factura {

    private Panel_factura facturas;
    private int cliente = 0;
    private String NombreCliente = null;
    private String GeneroCliente = null;
    private int idProducto = 0;
    private int empleado = 0;
    private String NombreEmpleado = null;
    private int idFactura = 0;

    private String nombreProducto = null;
    private double precioProducto = 0.0;
    private int cantidadProducto = 0;
    private double subtotalProducto = 0;

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
        int filaselec = facturas.getTabla_fact().getSelectedRow();
        if (filasSeleccionadas > 1 || filasSeleccionadas <= 0) {
            facturas.getmsFilasTabla().setVisible(true);

        } else {
            idFactura = Integer.parseInt(String.valueOf(facturas.getModelo_tablaFactura().getValueAt(filaselec, 0)));
            cliente = Integer.parseInt(String.valueOf(facturas.getModelo_tablaFactura().getValueAt(filaselec, 1)));
            empleado = Integer.parseInt(String.valueOf(facturas.getModelo_tablaFactura().getValueAt(filaselec, 2)));
            Long fecha = Long.valueOf(String.valueOf(facturas.getModelo_tablaFactura().getValueAt(filaselec, 3)));
            String consulta_cliente = "SELECT nombre, genero FROM cliente WHERE cedula=?";
            String consulta_empleado = "SELECT nombre FROM empleado WHERE cedula=?";
            String id_producto = "SELECT producto, cantidad, total  FROM  compra WHERE cliente=? AND fecha=?";
            String datos_producto = "SELECT nombre, precio FROM producto WHERE id=?";
            try (Connection con = conexion.getConnection()) {
                PreparedStatement psCliente = con.prepareStatement(consulta_cliente);
                psCliente.setInt(1, cliente);
                ResultSet rs_cliente = psCliente.executeQuery();
                if (rs_cliente.next()) {
                    NombreCliente = rs_cliente.getString("nombre");
                    GeneroCliente = rs_cliente.getString("genero");
                } else {
                    System.out.println("No hay cliente");
                }

                PreparedStatement psEmpleado = con.prepareStatement(consulta_empleado);
                psEmpleado.setInt(1, empleado);
                ResultSet rs_empledo = psEmpleado.executeQuery();

                if (rs_empledo.next()) {
                    NombreEmpleado = rs_empledo.getString("nombre");
                } else {
                    System.out.println("No hay empleados");
                }

                PreparedStatement psIdProducto = con.prepareStatement(id_producto);
                PreparedStatement psDatosProducto = con.prepareStatement(datos_producto);
                psIdProducto.setInt(1, cliente);
                psIdProducto.setDate(2, new java.sql.Date(fecha));
                ResultSet rs_idProducto = psIdProducto.executeQuery();
                while (rs_idProducto.next()) {
                    idProducto = rs_idProducto.getInt("id");
                    cantidadProducto = rs_idProducto.getInt("cantidad");
//                    subtotalProducto = rs_idProducto.getDouble("total");
                    psDatosProducto.setInt(1, idProducto);

                    ResultSet rs_datos_producto = psDatosProducto.executeQuery();
                    while (rs_datos_producto.next()) {
                        nombreProducto = rs_datos_producto.getString("nombre");
                        precioProducto = rs_datos_producto.getDouble("precio");
                        facturas.getModelo_tablaFactura_final().addRow(new Object[]{
                            nombreProducto,
                            cantidadProducto,
                            precioProducto,
                            subtotalProducto = cantidadProducto * precioProducto});
                    }
                }
                // rellenar los labels de los datos del cliente que hizo la factura
                facturas.getlbl_cedula_cliente().setText(String.valueOf(cliente));
                facturas.getlbl_nombre_cliente().setText(NombreCliente);
                facturas.getlbl_genero_cliente().setText(GeneroCliente);

                // rellenar los labels de el numeo de factura y la fecha
                facturas.getlbl_numero_factura().setText(String.valueOf(idFactura));
                facturas.getlbl_fecha_factura().setText(String.valueOf(fecha));
                // rellenar los labels de los datos del empleado que atendio al cliente
                facturas.getnombre_empleado().setText(NombreEmpleado);
                facturas.getCedula_empleado().setText(String.valueOf(empleado));

                // agregar los datos de los productos que compro cada cliente
            } catch (SQLException e) {
                System.out.println("entro al catch" + e.getMessage());
            }

            facturas.getmsFilasTabla().setVisible(false);

        }

    }

}
