package bo.com.ahosoft.composicion.pluggableFactory;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 06:07 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.pluggableFactory
 **/
public class ScooterElectricidad extends Scooter {


    public void visualizaCaracteristicas() {
        System.out.println("Scooter electrica de modelo: "
                + modelo + " de color: " + color +
                " de potencia: " + potencia);
    }
}
