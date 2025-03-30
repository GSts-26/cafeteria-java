package modelos.DAO;

import java.util.HashMap;
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

    interface ProductosDAO extends DAOGeneral<producto> {

        public List<String> buscarIngredientes(Long id);
    }

    interface DaoVenta extends DAOGeneral<CarroCompras> {

        int insertreturning(CarroCompras compras);

        CarroCompras activo(long cedulaempleado);

        void actualizarValor(CarroCompras compras);
    }

    interface DaoItemsCarro extends DAOGeneral<itemsCarro> {
        public HashMap<Integer, Object> listar(int idcarro);
        void EliminarTodo();
    }

}
