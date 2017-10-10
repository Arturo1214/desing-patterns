package bo.com.ahosoft.construction.prototype;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 03:23 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.prototype
 **/
public class OrdenDePedido extends Documento {
    public void imprime() {
        System.out.println("Imprime la orden de pedido: " +
                contenido);
    }

    public void visualiza() {
        System.out.println("Muestra la orden de pedido: " +
                contenido);
    }
}
