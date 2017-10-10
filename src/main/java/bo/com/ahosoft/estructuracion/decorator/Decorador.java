package bo.com.ahosoft.estructuracion.decorator;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 03:35 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.decorator
 **/
public abstract class Decorador implements ComponenteGraficoVehiculo {

    protected ComponenteGraficoVehiculo componente;

    public Decorador(ComponenteGraficoVehiculo componente) {
        this.componente = componente;
    }

    public void visualiza() {
        componente.visualiza();
    }
}
