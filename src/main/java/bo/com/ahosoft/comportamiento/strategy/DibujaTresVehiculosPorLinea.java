package bo.com.ahosoft.comportamiento.strategy;

import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 11:38 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.strategy
 **/
public class DibujaTresVehiculosPorLinea implements DibujaCatalogo {

    public void dibuja(List<VistaVehiculo> contenido) {
        Integer contador = 0;
        System.out.println("Dibuja los vehiculos mostrando tres vehiculos por linea");
        for (VistaVehiculo vistaVehiculo: contenido) {
            vistaVehiculo.dibuja();
            contador ++;
            if (contador == 3) {
                System.out.println();
                contador = 0;
            } else {
                System.out.print(" ");
            }
        }

        if (contador != 0)
            System.out.println();
        System.out.println();
    }
}
