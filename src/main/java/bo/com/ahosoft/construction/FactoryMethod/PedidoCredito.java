package bo.com.ahosoft.construction.FactoryMethod;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 02:04 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.FactoryMethod
 **/
public class PedidoCredito extends Pedido {

    public PedidoCredito(Double importe) {
        super(importe);
    }

    public Boolean valida() {
        return (importe >= 1000) && (importe <= 5000);
    }

    public void paga() {
        System.out.println(
                "El pago del pedido a credito de: " +
                        importe + " se ha realizado.");
    }
}
