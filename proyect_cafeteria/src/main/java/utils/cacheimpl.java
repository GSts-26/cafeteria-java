package utils;

import java.util.LinkedList;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import modelos.DAO.DaoIngredienteImpl;
import modelos.Entidades.producto;
import modelos.DAO.DaoProductoImpl;
import modelos.Entidades.Ingrediente;

public class cacheimpl {

    // DAO instances
    private static final DaoProductoImpl daoProducto = new DaoProductoImpl();
    private static final DaoIngredienteImpl daoIngrediente = new DaoIngredienteImpl();

    // Cache for productos (1 minuto)
    private static final Cache<String, List<producto>> productoCache = Caffeine.newBuilder()
            .expireAfterWrite(1, TimeUnit.MINUTES)
            .build();

    // Cache for ingredientes (5 minutos)
    private static final Cache<String, List<Ingrediente>> ingredienteCache = Caffeine.newBuilder()
            .expireAfterWrite(5, TimeUnit.MINUTES)
            .build();

    // Obtener productos desde caché o BD
    public static List<producto> obtenerProductos() {
        List<producto> productos = productoCache.getIfPresent("productos");
        if (productos == null) {
            productos = daoProducto.listar();
            productoCache.put("productos", productos);
            System.out.println("Consulta a la BD (productos)");
        } else {
            System.out.println("Cache (productos)");
        }
        return productos;
    }

    // Obtener ingredientes desde caché o BD
    public static List<Ingrediente> obtenerIngredientes() {
        List<Ingrediente> ingredientes = ingredienteCache.getIfPresent("ingredientes");
        if (ingredientes == null) {
            ingredientes = daoIngrediente.listar();
            ingredienteCache.put("ingredientes", ingredientes);
            System.out.println("Consulta a la BD (ingredientes)");
        } else {
            System.out.println("Cache (ingredientes)");
        }
        return ingredientes;
    }

    public static Map<Integer, producto> obtenerProductosMapeadosPorId() {
        List<producto> lista = obtenerProductos(); // ya hace uso de la caché
        Map<Integer, producto> mapa = new HashMap<>();
        for (producto p : lista) {
            mapa.put(p.getId(), p);
        }
        return mapa;
    }

}
