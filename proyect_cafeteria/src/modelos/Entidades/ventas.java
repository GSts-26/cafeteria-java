package modelos.Entidades;

import java.util.Date;

public class ventas {

    private int id;
    private long cliente;
    private long empleado;
    private double valorTotal;
    private Date fecha;

    public ventas(int id, long cliente, long empleado, double valorTotal, Date fecha) {
        this.id = id;
        this.cliente = cliente;
        this.empleado = empleado;
        this.valorTotal = valorTotal;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCliente() {
        return cliente;
    }

    public void setCliente(long cliente) {
        this.cliente = cliente;
    }

    public long getEmpleado() {
        return empleado;
    }

    public void setEmpleado(long empleado) {
        this.empleado = empleado;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
