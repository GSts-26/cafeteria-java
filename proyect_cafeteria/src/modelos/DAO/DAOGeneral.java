package modelos.DAO;

import modelos.Entidades.*;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/**
 *
 * @author Admin
 */
public interface DAOGeneral<T> {

    public void insertar(T t);

    public void actualizar(T t);

    public void eliminar(Long id);

    public List<T> listar();

    interface ClienteDAO extends DAOGeneral<Cliente> {
    }
    interface ProductosDAO extends DAOGeneral<producto> {
        
    }interface IngredientesDAO extends DAOGeneral<Ingrediente> {
        
    }
}
