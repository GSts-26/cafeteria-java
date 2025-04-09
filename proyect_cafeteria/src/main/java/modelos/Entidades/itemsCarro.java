/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.Entidades;

/**
 *
 * @author Admin
 */
public class itemsCarro {

    private int idCarro_compra;
    private int productos_compra;
    private int cantidad_producto;
    private double total_item;

    public itemsCarro(int idCarro_compra, int productos_compra, int cantidad_producto, double total_item) {
        this.idCarro_compra = idCarro_compra;
        this.productos_compra = productos_compra;
        this.cantidad_producto = cantidad_producto;
        this.total_item = total_item;
    }

    public itemsCarro() {
    }
    
    
    public int getIdCarro_compra() {
        return idCarro_compra;
    }

    public void setIdCarro_compra(int idCarro_compra) {
        this.idCarro_compra = idCarro_compra;
    }

    public int getProductos_compra() {
        return productos_compra;
    }

    public void setProductos_compra(int productos_compra) {
        this.productos_compra = productos_compra;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public double getTotal_item() {
        return total_item;
    }

    public void setTotal_item(double total_item) {
        this.total_item = total_item;
    }


}
