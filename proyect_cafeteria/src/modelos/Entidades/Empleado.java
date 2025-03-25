package modelos.Entidades;

import java.util.Date;

public class Empleado {

    long cedula;
    String nombre;
    Date nacimiento;
    String genero;
    long telefono;
    String email;
    String direccion;
    String apellido;

    public Empleado(long cedula, String nombre, Date nacimiento, String genero, long telefono, String email, String direccion, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.genero = genero;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.apellido = apellido;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
