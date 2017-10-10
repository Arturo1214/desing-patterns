package bo.com.ahosoft.construction.FactoryMethod;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 02:13 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.FactoryMethod
 **/
public class ClienteCredito extends Cliente {

    protected Pedido crearPedido(Double importe) {
        return new PedidoCredito(importe);
    }
}
