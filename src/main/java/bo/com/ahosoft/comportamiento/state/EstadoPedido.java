package bo.com.ahosoft.comportamiento.state;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 10:41 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.state
 **/
public abstract class EstadoPedido {

    protected Pedido pedido;

    public EstadoPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract void agregaProducto( Producto producto);
    public abstract void borra();
    public abstract void suprimeProducto(Producto producto);
    public abstract EstadoPedido estadoSiguiente();
}
