package bo.com.ahosoft.comportamiento.templateMethod;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 01:48 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.templateMethod
 **/
public class Usuario {
    public static void main(String[] args) {
        Pedido pedidoEspaña = new PedidoEspaña();
        pedidoEspaña.setImporteSinIva(10000D);
        pedidoEspaña.calculaPrecioConIVA();
        pedidoEspaña.visualiza();

        Pedido pedidoLuxemburgo = new PedidoLuxemburgo();
        pedidoLuxemburgo.setImporteSinIva(10000D);
        pedidoLuxemburgo.calculaPrecioConIVA();
        pedidoLuxemburgo.visualiza();
    }
}
