package bo.com.ahosoft.comportamiento.templateMethod;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 01:46 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.templateMethod
 **/
public class PedidoEspaña extends Pedido {
    protected void calculaIVA() {
        importeIVA = importeSinIva * 0.21;
    }
}
