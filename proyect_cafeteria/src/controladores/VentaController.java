/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import modelos.DAO.DaoProductoImpl;
import modelos.Entidades.producto;
import vistas.compras;
import vistas.menu.producto_info;

/**
 *
 * @author SENA
 */
public class VentaController {

    private final compras vista;
    private DaoProductoImpl ProductosDAO;
    private List<producto> ListaProductos = new ArrayList<>();

    public VentaController(compras vista) {
        this.vista = vista;
        this.ProductosDAO = new DaoProductoImpl();
        
    }
    
    public void relenar_productos(){
    ListaProductos = ProductosDAO.listar();
    vista.contenido_producto.setLayout(new GridLayout(0, 4, 16, 16));

        for (producto producto : ListaProductos) {     
            vista.contenido_producto.add(new producto_info(producto));
            vista.contenido_producto.revalidate();
vista.contenido_producto.repaint();
        }
    }
}
