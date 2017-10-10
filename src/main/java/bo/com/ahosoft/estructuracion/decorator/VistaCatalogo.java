package bo.com.ahosoft.estructuracion.decorator;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 03:42 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.decorator
 **/
public class VistaCatalogo {
    public static void main(String[] args) {
        VistaVehiculo vistaVehiculo = new VistaVehiculo();
        ModeloDecorador modeloDecorador = new ModeloDecorador(vistaVehiculo);
        MarcaDecorador marcaDecorador = new MarcaDecorador(modeloDecorador);
        marcaDecorador.visualiza();
    }
}
