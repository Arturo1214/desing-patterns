package bo.com.ahosoft.construction.abastractFactory;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 10:43 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.abastractFactory
 **/
public interface FabricaVehiculo {
    Automovil creaAutomovil(String modelo, String color, Integer potencia, Double espacio);

    Scooter creaScooter(String modelo, String color, Integer potencia);
}
