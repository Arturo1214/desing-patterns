package bo.com.ahosoft.comportamiento.observer;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 09:53 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.observer
 **/
public class Usuario {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setDescripcion("Vehiculo economico");
        vehiculo.setPrecio(5000.0);
        VistaVehiculo vistaVehiculo = new VistaVehiculo(vehiculo);
        vistaVehiculo.redibuja();
        vehiculo.setPrecio(4500.0);
        VistaVehiculo vistaVehiculo1 = new VistaVehiculo(vehiculo);
        vehiculo.setPrecio(5500.0);

    }
}
