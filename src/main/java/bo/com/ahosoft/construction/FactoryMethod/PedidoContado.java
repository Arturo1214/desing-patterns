package bo.com.ahosoft.construction.FactoryMethod;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 02:03 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.FactoryMethod
 **/
public class PedidoContado extends Pedido {

    public PedidoContado(Double importe) {
        super(importe);
    }

    public Boolean valida() {
        return true;
    }

    public void paga() {
        System.out.println(
                "El pago del pedido por importe de: " +
                        importe + " se ha realizado.");
    }
}
