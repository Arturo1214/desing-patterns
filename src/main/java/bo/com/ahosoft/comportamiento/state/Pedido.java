package bo.com.ahosoft.comportamiento.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 10:40 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.state
 **/
public class Pedido {
    protected List<Producto> productos = new ArrayList<Producto>();
    protected EstadoPedido estadoPedido;

    public Pedido() {
        estadoPedido = new PedidoEnCurso(this);
    }

    public void agregaProducto(Producto producto) {
        estadoPedido.agregaProducto(producto);
    }

    public void suprimeProducto(Producto producto) {
        estadoPedido.suprimeProducto(producto);
    }

    public void borra() {
        estadoPedido.borra();
    }

    public void estadoSiguiente() {
        estadoPedido = estadoPedido.estadoSiguiente();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void visualiza() {
        System.out.println("Contenido del pedido");
        for (Producto producto: productos)
            producto.visualiza();
        System.out.println();
    }
}
