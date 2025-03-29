package controladores;

import vistas.Categorias;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Bd.conexion;
import javax.swing.JOptionPane;

public class metodo_categoria  {

    private int id = 0;
    private String nombreCate = null;
    private Categorias categorias;
  

    public metodo_categoria(Categorias Categoria) {
        this.categorias = Categoria;

    }

    public void contarCategorias()  {
        String consulta = "SELECT COUNT(*) FROM categoria";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                categorias.getContar_categoria().setText(String.valueOf(rs.getInt(1)));
            }
        } catch (Exception e) {
        }
    }

    public void columSelect() throws InterruptedException {

        int colum = categorias.getTabla_cate().getSelectedColumn();
        if (colum == 2) {
         
            System.out.println("en hilo");

            int fila = categorias.getTabla_cate().getSelectedRow();
            id = Integer.parseInt(categorias.getModel_tabla().getValueAt(fila, 0).toString());

            nombreCate = categorias.getModel_tabla().getValueAt(fila, 1).toString();
            categorias.getTxt_nombre().setText(nombreCate);
            categorias.getTxt_id().setText(String.valueOf(id));

            categorias.getBoton_agregar().setVisible(false);
            categorias.getBoton_update().setVisible(true);
        }
    }

   
}
