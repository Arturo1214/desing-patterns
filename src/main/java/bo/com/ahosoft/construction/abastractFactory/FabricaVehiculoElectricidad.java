package bo.com.ahosoft.construction.abastractFactory;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 10:46 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.abastractFactory
 **/
public class FabricaVehiculoElectricidad implements FabricaVehiculo {

    public Automovil creaAutomovil(String modelo, String color, Integer potencia, Double espacio) {
        return new AutomovilElectricidad(modelo, color, potencia, espacio);
    }

    public Scooter creaScooter(String modelo, String color, Integer potencia) {
        return new ScooterElectrico(modelo, color, potencia);
    }
}
