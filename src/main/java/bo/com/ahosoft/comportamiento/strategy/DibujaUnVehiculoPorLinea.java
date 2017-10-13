package bo.com.ahosoft.comportamiento.strategy;

import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 11:32 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.strategy
 **/
public class DibujaUnVehiculoPorLinea implements DibujaCatalogo{

    public void dibuja(List<VistaVehiculo> contenido) {
        System.out.println("Dibuja los vehiculos mostrando un vehiculo por linea");
        for (VistaVehiculo vistaVehiculo: contenido) {
            vistaVehiculo.dibuja();
            System.out.println();
        }
        System.out.println();
    }
}
