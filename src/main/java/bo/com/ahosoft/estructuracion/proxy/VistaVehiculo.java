package bo.com.ahosoft.estructuracion.proxy;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 05:08 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.proxy
 **/
public class VistaVehiculo {
    public static void main(String[] args) {
        Animacion animacion = new AnimacionProxy();
        animacion.dibuja();
        animacion.clic();
        animacion.dibuja();
    }
}
