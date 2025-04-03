package modelos.Entidades;

public class detalleVenta {

    private int id;
    private int idProducto;
    private int cantidad;
    private double precio;
    private double subtotal;

    public detalleVenta(int id, int idProducto, int cantidad, double subtotal) {
        this.id = id;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getId() {
        return id;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

   

    public double getSubtotal() {
        return subtotal;
    }

}
