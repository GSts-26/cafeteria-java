/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.Entidades;

import java.sql.Date;
import java.util.List;

public class producto {
    private int id;
    private String nombre;
    private int categoria;
    private String Descripcion; 
    private double precio;
    private List<Integer> idIngredientes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategorias() {
        return categoria;
    }

    public void setCategorias(int categorias) {
        this.categoria = categorias;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Integer> getIdIngredientes() {
        return idIngredientes;
    }

    public void setIdIngredientes(List<Integer> idIngredientes) {
        this.idIngredientes = idIngredientes;
    }

    public producto(int id, String nombre, int categorias, String Descripcion, double precio, List<Integer> idIngredientes) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categorias;
        this.Descripcion = Descripcion;
        this.precio = precio;
        this.idIngredientes = idIngredientes;
    }
    public producto(String nombre, int categorias, String Descripcion, double precio, List<Integer> idIngredientes) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categorias;
        this.Descripcion = Descripcion;
        this.precio = precio;
        this.idIngredientes = idIngredientes;
    }

}