package bo.com.ahosoft.construction.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 02:09 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.FactoryMethod
 **/
public abstract class Cliente {
    protected List<Pedido> pedidos = new ArrayList<Pedido>();

    protected abstract Pedido crearPedido(Double importe);

    public  void nuevoPedido(Double importe) {
        Pedido pedido = this.crearPedido(importe);
        if( pedido.valida() ) {
            pedido.paga();
            pedidos.add(pedido);
        }
    }
}
