package modelos.Entidades;

import java.util.ArrayList;
import java.util.List;

public class categoria {

    public categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public categoria(String nombre){
        this.nombre=nombre;
    }

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
    private int id;
    private String nombre;

}
