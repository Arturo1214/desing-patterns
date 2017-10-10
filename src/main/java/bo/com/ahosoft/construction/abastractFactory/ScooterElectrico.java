package bo.com.ahosoft.construction.abastractFactory;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 10:41 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.abastractFactory
 **/
public class ScooterElectrico extends Scooter {

    public ScooterElectrico(String modelo, String color, Integer potencia) {
        super(modelo, color, potencia);
    }

    public void mostrarCaracteristicas() {
        System.out.println("Scooter electrica de modelo: " +
                modelo + " de color: " + color +
                " de potencia: " + potencia);
    }
}
