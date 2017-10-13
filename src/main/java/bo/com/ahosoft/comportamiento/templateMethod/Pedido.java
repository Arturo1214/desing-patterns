package bo.com.ahosoft.comportamiento.templateMethod;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 01:39 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.templateMethod
 **/
public abstract class Pedido {
    protected Double importeSinIva;
    protected Double importeIVA;
    protected Double importeConIVA;

    protected abstract void calculaIVA();

    public void calculaPrecioConIVA() {
        this.calculaIVA();
        importeConIVA = importeSinIva + importeIVA;
    }

    public void setImporteSinIva(Double importeSinIva) {
        this.importeSinIva = importeSinIva;
    }

    public void visualiza() {
        System.out.println("Pedido");
        System.out.println("Importe sin IVA " + importeSinIva);
        System.out.println("Importe con IVA " + importeConIVA);
    }
}
