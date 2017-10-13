package bo.com.ahosoft.comportamiento.state;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 11:01 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.state
 **/
public class Usuario {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.agregaProducto(new Producto("vehiculo 1"));
        pedido.agregaProducto(new Producto("accesorio 2"));
        pedido.visualiza();
        pedido.estadoSiguiente();
        pedido.agregaProducto(new Producto("accesorio 3"));
        pedido.borra();
        pedido.visualiza();

        Pedido pedido1 = new Pedido();
        pedido1.agregaProducto(new Producto("vehiculo 11"));
        pedido1.agregaProducto(new Producto("accesorio 21"));
        pedido1.visualiza();
        pedido1.estadoSiguiente();
        pedido1.visualiza();
        pedido1.estadoSiguiente();
        pedido1.borra();
        pedido1.visualiza();
    }
}
