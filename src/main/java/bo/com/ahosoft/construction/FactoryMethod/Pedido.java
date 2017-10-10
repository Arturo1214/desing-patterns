package bo.com.ahosoft.construction.FactoryMethod;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 02:00 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.FactoryMethod
 **/
public abstract class Pedido {
    protected  Double importe;

    public Pedido(Double importe) {
        this.importe = importe;
    }

    public abstract Boolean valida();
    public abstract void paga();
}
