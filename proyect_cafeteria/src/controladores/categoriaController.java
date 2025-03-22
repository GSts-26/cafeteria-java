package controladores;

import java.util.ArrayList;
import java.util.List;
import modelos.DAO.DaoCategoria;
import modelos.DAO.DaoProductoImpl;
import vistas.Categorias;
import modelos.Entidades.categoria;

public class categoriaController {

    private DaoCategoria categoriaDao;
    private Categorias vistaCategoria;
    private List<categoria> lista = new ArrayList<>();

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
        lista = categoriaDao.listar();
        if (lista.isEmpty()) {
            vistaCategoria.getNohay().setVisible(true);
        } else {
vistaCategoria.getNohay().setVisible(false);
            vistaCategoria.getModel_tabla().setRowCount(0);
            for (categoria cate : lista) {
                vistaCategoria.getModel_tabla().addRow(new Object[]{
                    cate.getId(),
                    cate.getNombre()
                });
            }
        }
    }

    public void accionTabla() {
        int fila = vistaCategoria.getTabla_cate().getSelectedRow();
        int filaseleccionada = Integer.parseInt(vistaCategoria.getModel_tabla().getValueAt(fila, 0).toString());
        int columna = vistaCategoria.getTabla_cate().getSelectedColumn();
        if (columna == 2) {
            categoriaDao.eliminar(filaseleccionada);
            mostrar();

        }

    }

}
