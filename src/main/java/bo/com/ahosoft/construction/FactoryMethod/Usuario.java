package bo.com.ahosoft.construction.FactoryMethod;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 02:15 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.FactoryMethod
 **/
public class Usuario {

    public static void main(String[] args) {
        Cliente cliente;
        cliente = new ClienteContado();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
        cliente = new ClienteCredito();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
    }
}
