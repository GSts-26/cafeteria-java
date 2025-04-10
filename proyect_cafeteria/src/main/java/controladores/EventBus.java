package controladores;

import java.util.ArrayList;
import java.util.List;

import modelos.DAO.EscuchadorCarroCompras;
import modelos.DAO.EscuchadorIngrediente;
import modelos.DAO.EscuchadorProducto;

public class EventBus {

    private static final List<EscuchadorProducto> ListenersProducto = new ArrayList<>();
    private static final List<EscuchadorIngrediente> ListenersIngrediente = new ArrayList<>();
    private static final List<EscuchadorCarroCompras> ListenerCarroCompra = new ArrayList<>();

    public static void SubscribirseProducto(EscuchadorProducto listener) {
        ListenersProducto.add(listener);
    }

    public static void SubscribirseIngrediente(EscuchadorIngrediente listener) {
        ListenersIngrediente.add(listener);
    }

    public static void subscribirseCarroCompras(EscuchadorCarroCompras listener) {
        ListenerCarroCompra.add(listener);
    }


    public static void PublishProducto() {
        for (EscuchadorProducto listener : ListenersProducto) {
            listener.EscuchadorProductoActivo();
        }
    }

    public static void PublishIngrediente() {
        for (EscuchadorIngrediente listener : ListenersIngrediente) {
            listener.EscuchadorIngreActivo();
        }
    }

    public static void PublishCarroCompras() {
        for (EscuchadorCarroCompras listener : ListenerCarroCompra) {
            listener.EscuchadorCarroCompras();
        }
    }


}
