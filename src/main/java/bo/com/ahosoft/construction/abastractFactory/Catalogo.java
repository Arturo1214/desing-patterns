package bo.com.ahosoft.construction.abastractFactory;

import java.util.Scanner;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 10:49 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.abastractFactory
 **/
public class Catalogo {

    public static Integer nAutos = 3;
    public static Integer nScooters = 2;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FabricaVehiculo fabrica;
        Automovil [] autos = new Automovil[nAutos];
        Scooter [] scooters = new Scooter[nScooters];
        System.out.print("Desea utilizar " +
                "vehiculos electricos (1) o a gasolina (2):");
        String eleccion = reader.next();
        if (eleccion.equals("1"))
        {
            fabrica = new FabricaVehiculoElectricidad();
        }
        else
        {
            fabrica = new FabricaVehiculoGasolina();
        }
        for (int index = 0; index < nAutos; index++)
            autos[index] = fabrica.creaAutomovil("estandar",
                    "amarillo", 6+index, 3.2);
        for (int index = 0; index < nScooters; index++)
            scooters[index] = fabrica.creaScooter("clasico",
                    "rojo", 2+index);
        for (Automovil auto: autos)
            auto.mostrarCaracteristicas();
        for (Scooter scooter: scooters)
            scooter.mostrarCaracteristicas();
    }
}
