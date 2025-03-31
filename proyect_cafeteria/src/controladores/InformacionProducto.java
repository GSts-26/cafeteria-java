package controladores;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import modelos.Bd.conexion;
import modelos.DAO.DaoIngredienteImpl;
import modelos.DAO.DaoProductoImpl;
import modelos.Entidades.Ingrediente;
import vistas.panel_informacion_producto;
import vistas.panel_productos;

public class InformacionProducto {

    DaoProductoImpl daoproduc = new DaoProductoImpl();
    DaoIngredienteImpl daoIngre = new DaoIngredienteImpl();
    List<String> productosIDS = new ArrayList<>();

    private int totalProteina = 0;
    private int totalazucar = 0;
    private int totalcalorias = 0;
    private int totalcarbohidratos = 0;
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
        double precio = Double.parseDouble(product.getModelo_Tabla_producto().getValueAt(fila, 3).toString());

        info.setLbl_nombre_producto().setText(nombreP);
        info.setLbl_precio_producto().setText(String.valueOf(precio));
        info.getArea_ingredientes().setText("");
        if (!info.getLbl_descripcion_producto().getText().isEmpty()) {
            info.getLbl_descripcion_producto().setText("");
        }
        productosIDS.clear();
        totalProteina = 0;
        totalazucar = 0;
        totalcalorias = 0;
        totalcarbohidratos = 0;

        if (product.getTabla_producto().getSelectedColumn() == 5) {
            product.tabla_producto.clearSelection();

            try (Connection con = conexion.getConnection()) {

                Map<Integer, Ingrediente> ingredientesMap = new HashMap<>();
                daoIngre.listar().forEach(ingrediente -> ingredientesMap.put(ingrediente.getId(), ingrediente));

                String consulta = "SELECT ids_ingrediente FROM producto WHERE id=?";
                PreparedStatement ps = con.prepareStatement(consulta);
                ps.setInt(1, idP);
                ResultSet rsIds = ps.executeQuery();

                if (rsIds.next()) {
                    String idsProductos = rsIds.getString("ids_ingrediente");
                    idsProductos = idsProductos.replace("{", "").replace("}", "");
                    Arrays.stream(idsProductos.split(","))
                            .map(String::trim)
                            .forEach(productosIDS::add);
                }

                daoproduc.listar().forEach(prods -> {
                    if (idP == prods.getId()) {
                        if (prods.getDescripcion().isEmpty()) {
                            info.getLbl_descripcion_producto().append("Este Producto No tiene una descripcion");
                        } else {

                            info.getLbl_descripcion_producto().append(prods.getDescripcion());
                        }
                    }
                });

                productosIDS.forEach(prod -> {
                    int idIngrente = Integer.parseInt(prod);
                    Ingrediente ingrediente = ingredientesMap.get(idIngrente);

                    if (ingrediente != null) {
                        info.getArea_ingredientes().append("-" + ingrediente.getNombre() + "\n");
                        totalProteina += ingrediente.getProteinas();
                        totalazucar += ingrediente.getAzucar();
                        totalcalorias += ingrediente.getCalorias();
                        totalcarbohidratos += ingrediente.getCarbohidratos();
                    }
                });

                // Actualizar los valores en la interfaz
                info.setTxt_carbohidratos().setText(totalcarbohidratos + " G");
                info.setTxt_proteinas().setText(totalProteina + " G");
                info.setTxt_azucar().setText(totalazucar + " G");
                info.setTxt_calorias().setText(totalcalorias + " KCAL");
            } catch (SQLException e) {
                System.out.println("Error al rellenar la información del producto: " + e.getMessage());
            }
        }
    }

}
