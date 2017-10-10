package bo.com.ahosoft.estructuracion.decorator;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 03:34 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.decorator
 **/
public class VistaVehiculo implements ComponenteGraficoVehiculo {
    public void visualiza() {
        System.out.println("Visualizacion del vehiculo");
    }
}
