/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Modelo.Entidades.*;
import java.util.List;

public interface DAOGeneral<T> {

    public void Insertar(T t);
    public void Actualizar(T t );
    public void Eliminar(long t);
    public List<T> listar();
    
    interface EmpleadoDAO extends DAOGeneral<Empleado>{ 
    }
  
    

}
