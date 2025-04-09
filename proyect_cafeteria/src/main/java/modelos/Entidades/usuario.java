/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.Entidades;


/**
 *
 * @author Admin
 */

public class usuario  {

    private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public usuario(String usuario, String clave, String rol, Long cedula, String nombre, String apellido) {
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    private String clave;
    private String rol;
    private Long cedula;
    private String nombre;
    private String apellido;



}