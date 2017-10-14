package bo.com.ahosoft.composicion.pluggableFactory;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 06:02 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.pluggableFactory
 **/
public class AutomovilElectricidad extends Automovil {
    public void visualizaCaracteristicas() {
        System.out.println(
                "Automovil electrico de modelo: " + modelo +
                        " de color: " + color + " de potencia: " +
                        potencia + " de espacio: " + espacio);
    }
}
