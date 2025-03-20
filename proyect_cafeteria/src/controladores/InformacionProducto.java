package controladores;

import modelos.Bd.conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import vistas.panel_informacion_producto;
import vistas.panel_productos;


public class InformacionProducto {


    List<String> productosIDS = new ArrayList<>();

  
      
  

    private int totalProteina = 0;
    private int totalazucar = 0;
    private int totalcalorias = 0;
    private int totalcarbohidratos = 0;
    modelos.Bd.conexion con = new conexion();
    private int idIngrente = 0;

    private panel_informacion_producto info;
    private panel_productos product;

    public InformacionProducto(panel_productos product, panel_informacion_producto info) {
        this.product = product;
        this.info = info;
    }

    public void rellenar() {

       
        int fila = product.getTabla_producto().getSelectedRow();
        String nombreP = product.getModelo_Tabla_producto().getValueAt(fila, 1).toString();
        int idP = Integer.parseInt(product.getModelo_Tabla_producto().getValueAt(fila, 0).toString());
        double precioP = Double.parseDouble(product.getModelo_Tabla_producto().getValueAt(fila, 3).toString());
        info.setLbl_precio_producto().setText(String.valueOf(precioP));

        info.setLbl_nombre_producto().setText(nombreP);
        info.setArea_ingredientes().setText("");
        productosIDS.clear();
        totalProteina = 0;
        totalazucar = 0;
        totalcalorias = 0;
        totalcarbohidratos = 0;

        product.getModelo_Tabla_producto();
        product.getTabla_producto();

        if (product.getTabla_producto().getSelectedColumn() == 5) {
            try (Connection cons = conexion.getConnection()) {
                String consulta = "SELECT ids_ingrediente, descripcion FROM producto WHERE id=?";
                String Ingrediente = "SELECT proteina, calorias, carbohidratos, azucar, nombre FROM ingredientes WHERE id=?";
                PreparedStatement ps = cons.prepareStatement(consulta);
                PreparedStatement psIngredientes = cons.prepareStatement(Ingrediente);
                ps.setInt(1, idP);
                ResultSet rsIds = ps.executeQuery();
                while (rsIds.next()) {
                    info.getLbl_descripcion_producto().setText(rsIds.getString("descripcion"));
                    String idsProductos = rsIds.getString("ids_ingrediente");
                    idsProductos = idsProductos.replace("{", "").replace("}", "");
                    String[] arrayids = idsProductos.split(",");
                    for (String arrayid : arrayids) {
                        productosIDS.add(arrayid.trim());
                    }
                }

                for (String prod : productosIDS) {
                    idIngrente = Integer.parseInt(prod);
                    psIngredientes.setInt(1, idIngrente);
                    ResultSet rsIngrediente = psIngredientes.executeQuery();
                    while (rsIngrediente.next()) {
                        info.setArea_ingredientes().append(rsIngrediente.getString("nombre") + "\n");
                        totalProteina += rsIngrediente.getInt("proteina");
                        totalazucar += rsIngrediente.getInt("azucar");
                        totalcalorias += rsIngrediente.getInt("calorias");
                        totalcarbohidratos += rsIngrediente.getInt("carbohidratos");

                        info.setTxt_carbohidratos().setText(String.valueOf(totalcarbohidratos + "  " + "G"));
                        info.setTxt_proteinas().setText(String.valueOf(totalProteina + "  " + "G"));
                        info.setTxt_azucar().setText(String.valueOf(totalazucar + "  " + "G"));
                        info.setTxt_calorias().setText(String.valueOf(totalcalorias + "  " + "KCAL"));
                    }
                }

            } catch (SQLException e) {

                System.out.println(e.getMessage());
            }
        }

    }

}
