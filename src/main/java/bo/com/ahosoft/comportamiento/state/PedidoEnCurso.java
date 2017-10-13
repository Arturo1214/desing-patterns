package bo.com.ahosoft.comportamiento.state;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 10:50 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.state
 **/
public class PedidoEnCurso  extends EstadoPedido {

    public PedidoEnCurso(Pedido pedido) {
        super(pedido);
    }

    public void agregaProducto(Producto producto) {
        pedido.getProductos().add(producto);
    }

    public void borra() {
        pedido.getProductos().clear();
    }

    public void suprimeProducto(Producto producto) {
        pedido.getProductos().remove(producto);
    }

    public EstadoPedido estadoSiguiente() {
        return new PedidoValidado(pedido);
    }
}
