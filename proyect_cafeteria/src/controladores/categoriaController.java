package controladores;

import com.formdev.flatlaf.FlatClientProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelos.DAO.DaoCategoria;
import modelos.DAO.DaoProductoImpl;
import vistas.Categorias;
import modelos.Entidades.categoria;

public class categoriaController implements Runnable {

    private DaoCategoria categoriaDao;
    private Categorias vistaCategoria;
    private List<categoria> lista = new ArrayList<>();
    JButton botonEditar = new JButton();
    JButton botonEliminar = new JButton();
    private Thread s;

    public categoriaController(Categorias catee) {
        this.vistaCategoria = catee;
        this.categoriaDao = new DaoCategoria();

    }

    public void ingresar() {

        String nombre = vistaCategoria.getTxt_nombre().getText();
        categoria cate = new categoria(nombre);
        categoriaDao.insertar(cate);
//        vistaCategoria.getTxt_nombre().setText("");
        mostrar();

    }

    public void mostrar() {

        botonEditar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-edit-30.png")));
        botonEliminar.setIcon(new ImageIcon(getClass().getResource("/imagenes/icons8-trash-30.png")));
        botonEditar.setBorder(BorderFactory.createEmptyBorder());
        botonEliminar.setBorder(BorderFactory.createEmptyBorder());

//        botonEliminar.putClientProperty(FlatClientProperties.STYLE, "arc: 20; " + "background: #E6D2D4;");
//        botonEditar.putClientProperty(FlatClientProperties.STYLE, "arc: 20;" + "background: #F9F2ED;");
        lista = categoriaDao.listar();
        contar();
        if (lista.isEmpty()) {
            vistaCategoria.getNohay().setVisible(true);
        } else {
            vistaCategoria.getNohay().setVisible(false);
            vistaCategoria.getModel_tabla().setRowCount(0);
            for (categoria cate : lista) {
                vistaCategoria.getModel_tabla().addRow(new Object[]{
                    cate.getId(),
                    cate.getNombre(),
                    botonEditar,
                    botonEliminar});
            }
        }
    }

    public void rellenarActualizar() {
        vistaCategoria.boton_agregar.setVisible(false);
        vistaCategoria.boton_actualizar.setVisible(true);
        vistaCategoria.jLabel4.setText("Actualizar categoria");
        vistaCategoria.desr.setText("Editando categoría");
    }

    public void rellenarNuevaCategoria() {

        vistaCategoria.boton_agregar.setVisible(true);
        vistaCategoria.boton_actualizar.setVisible(false);
        vistaCategoria.jLabel4.setText("Nueva categoria");
                vistaCategoria.desr.setText("Añade una nueva categoría de productos  ");

        limpiar();
    }

    public void limpiar() {
        vistaCategoria.getTxt_id().setEditable(false);
        vistaCategoria.getTxt_id().requestFocus();
        vistaCategoria.getTxt_id().setText("");
        vistaCategoria.getTxt_nombre().setText("");
        vistaCategoria.boton_agregar.setVisible(true);
        vistaCategoria.boton_actualizar.setVisible(false);
        vistaCategoria.jLabel4.setText("Nueva categoria");
        vistaCategoria.desr.setText("Añade una nueva categoría de productos  ");
        
    }

    public void actualizar() {
        categoria c = new categoria(Integer.parseInt(vistaCategoria.getTxt_id().getText()), vistaCategoria.getTxt_nombre().getText());
        categoriaDao.actualizar(c);
        mostrar();
        limpiar();
        JOptionPane.showMessageDialog(null, "Datos modificados", "Modificado", JOptionPane.INFORMATION_MESSAGE);

    }

    public void accionTabla() {
        int fila = vistaCategoria.getTabla_cate().getSelectedRow();
        int filaseleccionada = Integer.parseInt(vistaCategoria.getModel_tabla().getValueAt(fila, 0).toString());
        String nombre = vistaCategoria.getModel_tabla().getValueAt(fila, 1).toString();
        int columna = vistaCategoria.getTabla_cate().getSelectedColumn();
        if (columna == 3) {
            categoriaDao.eliminar(filaseleccionada);
            mostrar();
        } else if (columna == 2) {

            vistaCategoria.getTxt_id().setText(String.valueOf(filaseleccionada));
            vistaCategoria.getTxt_nombre().setText(nombre);
            rellenarActualizar();

        }
    }

    public void contar() {
        int numero = categoriaDao.contarCategorias();
        vistaCategoria.contar_categoria.setText(String.valueOf(numero));
    }

    public boolean campoVacio() {
        if (vistaCategoria.getTxt_nombre().getText().isEmpty()) {
            vistaCategoria.m1nombreCampo.setVisible(true);
            return false;
        } else {
            vistaCategoria.m1nombreCampo.setVisible(false);
            return true;
        }

    }

    public void ocultar() {
        vistaCategoria.m1nombreCampo.setVisible(false);
        vistaCategoria.boton_actualizar.setVisible(false);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                s = new Thread(this);

                s.start();
                Thread.sleep(400);
                System.out.println("ggg");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(categoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
