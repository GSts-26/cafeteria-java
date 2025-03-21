
package controladores;

import vistas.Categorias;
import java.sql.*;
import modelos.Bd.conexion;
import javax.swing.JOptionPane;

public class metodo_categoria {
    
    private int id = 0;
    private String nombreCate = null;
    private Categorias categorias;
    
    public metodo_categoria(Categorias Categoria) {
        this.categorias = Categoria;
    }
    
    public void insertarCategoria() {
        nombreCate = categorias.getTxt_nombre().getText().trim();
        String consulta = "INSERT INTO categoria (nombre) VALUES(?)";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setString(1, nombreCate);
            int fila_insertadad = ps.executeUpdate();
            if (fila_insertadad > 0) {
                listarCategorias();
                categorias.getTxt_nombre().setText("");
                JOptionPane.showMessageDialog(null, "Categoria agregada", "Agregado", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Entro al catch" + e.getMessage());
        }
    }
    
    public void listarCategorias() {
        String consulta = "SELECT * FROM categoria";
        categorias.getModel_tabla().setRowCount(0);
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                categorias.getNohay().setVisible(false);
                do {
                    categorias.getModel_tabla().addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("nombre")});
                    
                } while (rs.next());
                contarCategorias();
                
            } else {
                categorias.getNohay().setVisible(true);
            }
            
            categorias.getTabla_cate();
        } catch (Exception e) {
        }
    }
    
    public void eliminar() {
        int fila = categorias.getTabla_cate().getSelectedRow();
        int filaSelecionada = Integer.parseInt(String.valueOf(categorias.getModel_tabla().getValueAt(fila, 0)));
        id = filaSelecionada;
        String consulta = "DELETE FROM categoria WHERE id=?";
        if (categorias.getTabla_cate().getSelectedColumn() == 3) {
            
            try (Connection con = conexion.getConnection()) {
                PreparedStatement ps = con.prepareStatement(consulta);
                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Categoria eliminada", "Eliminada", JOptionPane.INFORMATION_MESSAGE);
                listarCategorias();
                
            } catch (SQLException e) {
                System.out.println("Entro al catch" + e.getMessage());
            }
        }
    }
    
    public void contarCategorias() {
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
    
    public void ocultar() {
        categorias.getMensaje().setVisible(false);
    }
    
    public boolean camposVacios() {
        boolean vacio = false;
        if (categorias.getTxt_nombre().getText().isEmpty()) {
            categorias.getMensaje().setVisible(true);
            vacio = true;
        } else {
            categorias.getMensaje().setVisible(false);
            return vacio;
            
        }
        return vacio;
    }
    
    public void columSelect() {
        int colum = categorias.getTabla_cate().getSelectedColumn();
        if (colum == 2) {
            int fila = categorias.getTabla_cate().getSelectedRow();
            id = Integer.parseInt(categorias.getModel_tabla().getValueAt(fila, 0).toString());
            
            nombreCate = categorias.getModel_tabla().getValueAt(fila, 1).toString();
            categorias.getTxt_nombre().setText(nombreCate);
            categorias.getTxt_id().setText(String.valueOf(id));
            
            categorias.getBoton_agregar().setVisible(false);
            categorias.getBoton_update().setVisible(true);
        }
    }
    
    public void actualizar() {
        int fila = categorias.getTabla_cate().getSelectedRow();
        nombreCate = categorias.getModel_tabla().getValueAt(fila, 1).toString();
        String nombCate = categorias.getTxt_nombre().getText();
        id = Integer.parseInt(categorias.getModel_tabla().getValueAt(fila, 0).toString());
        String consulta = "UPDATE categoria  SET nombre=? WHERE id=?";
        try (Connection con = conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setString(1, nombCate);
            ps.setInt(2, id);
            ps.execute();
            listarCategorias();
            categorias.getTxt_id().setText("");
            categorias.getTxt_nombre().setText("");
            JOptionPane.showMessageDialog(null, "Categoria actualizada");
            
        } catch (SQLException e) {
            System.out.println("Entro al catch" + e.getMessage());
        }
        
    }
}

