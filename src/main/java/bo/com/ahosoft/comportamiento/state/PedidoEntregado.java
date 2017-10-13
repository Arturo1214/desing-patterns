package bo.com.ahosoft.comportamiento.state;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 10:59 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.state
 **/
public class PedidoEntregado extends EstadoPedido{

    public PedidoEntregado(Pedido pedido) {
        super(pedido);
    }

    public void agregaProducto(Producto producto) {

    }

    public void borra() {

    }

    public void suprimeProducto(Producto producto) {

    }

    public EstadoPedido estadoSiguiente() {
        return this;
    }
}
