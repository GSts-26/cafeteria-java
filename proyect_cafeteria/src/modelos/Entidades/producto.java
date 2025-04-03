/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.Entidades;

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class producto {
    private int id;
    private String nombre;
    private int categoria;

     public producto() {
    }
     
    public producto(int id, String nombre, int categoria, String descripcion, double precio, int cantidad, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        Descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stock = stock;
    }
    
        public producto(int id, String nombre, int categoria, String Descripcion, double precio, int cantidad, int stock, ArrayList<Integer> idIngredientes) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.Descripcion = Descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stock = stock;
        this.idIngredientes = idIngredientes;
    }
   

    private String Descripcion;
    private double precio;
    private int cantidad;
    private int stock;
    private ArrayList<Integer> idIngredientes;





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

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Integer> getIdIngredientes() {
        return idIngredientes;
    }

    public void setIdIngredientes(ArrayList<Integer> idIngredientes) {
        this.idIngredientes = idIngredientes;
    }



    public producto(String nombre, int categoria, String descripcion, double precio, int cantidad, int stock, ArrayList<Integer> idIngredientes) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        Descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stock = stock;
        this.idIngredientes = idIngredientes;
    }





}