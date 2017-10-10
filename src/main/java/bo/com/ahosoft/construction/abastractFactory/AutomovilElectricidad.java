package bo.com.ahosoft.construction.abastractFactory;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 10:33 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.abastractFactory
 **/
public class AutomovilElectricidad extends Automovil {


    public AutomovilElectricidad(String modelo, String color, Integer potencia, Double espacio) {
        super(modelo, color, potencia, espacio);
    }

    public void mostrarCaracteristicas() {
        System.out.println("Automovil electrico de modelo:" + modelo +
            " de color: " + color + " de potencia: " + potencia +
            " de espacio:" + espacio);
    }
}
