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

public class CacheService {

  private static final DaoProductoImpl daoProducto = new DaoProductoImpl();
    private static final DaoIngredienteImpl daoIngrediente = new DaoIngredienteImpl();

    private static final Cache<String, List<producto>> productoCache = Caffeine.newBuilder()
            .expireAfterWrite(1, TimeUnit.MINUTES)
            .maximumSize(100) // límite razonable
            .build();

    private static final Cache<String, List<Ingrediente>> ingredienteCache = Caffeine.newBuilder()
            .expireAfterWrite(5, TimeUnit.MINUTES)
            .maximumSize(100)
            .build();

    private static final String PRODUCTOS_KEY = "productos";
    private static final String INGREDIENTES_KEY = "ingredientes";

    public static List<producto> obtenerProductos() {
        return productoCache.get(PRODUCTOS_KEY, key -> {
            System.out.println("Consulta a la BD (productos)");
            return daoProducto.listar();
        });
    }

    public static List<Ingrediente> obtenerIngredientes() {
        return ingredienteCache.get(INGREDIENTES_KEY, key -> {
            System.out.println("Consulta a la BD (ingredientes)");
            return daoIngrediente.listar();
        });
    }

    public static Map<Integer, producto> obtenerProductosMapeadosPorId() {
        List<producto> productos = obtenerProductos();
        Map<Integer, producto> mapa = new HashMap<>();
        for (producto p : productos) {
            mapa.put(p.getId(), p);
        }
        return mapa;
    }

    // Métodos para invalidar manualmente caché
    public static void invalidarCacheProductos() {
        productoCache.invalidate(PRODUCTOS_KEY);
        System.out.println("Caché de productos invalidada manualmente");
    }

    public static void invalidarCacheIngredientes() {
        ingredienteCache.invalidate(INGREDIENTES_KEY);
        System.out.println("Caché de ingredientes invalidada manualmente");
    }

}
