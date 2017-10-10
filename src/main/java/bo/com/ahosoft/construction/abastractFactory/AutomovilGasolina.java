package bo.com.ahosoft.construction.abastractFactory;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 10:36 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.abastractFactory
 **/
public class AutomovilGasolina extends Automovil {

    public AutomovilGasolina(String modelo, String color, Integer potencia, Double espacio) {
        super(modelo, color, potencia, espacio);
    }

    public void mostrarCaracteristicas() {
        System.out.println(
                "Automovil de gasolina de modelo: " + modelo +
                        " de color: " + color + " de potencia: " +
                        potencia + " de espacio: " + espacio);
    }
}
