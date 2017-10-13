package bo.com.ahosoft.comportamiento.state;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 10:55 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.state
 **/
public class PedidoValidado extends EstadoPedido {

    public PedidoValidado(Pedido pedido) {
        super(pedido);
    }

    public void agregaProducto(Producto producto) {

    }

    public void borra() {
        pedido.getProductos().clear();
    }

    public void suprimeProducto(Producto producto) {

    }

    public EstadoPedido estadoSiguiente() {
        return new PedidoEntregado(pedido);
    }
}
