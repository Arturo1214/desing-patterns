package bo.com.ahosoft.comportamiento.iterator;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 11:26 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.iterator
 **/
public class Usuario {
    public static void main(String[] args) {
        CatalogoVehiculo catalogo = new CatalogoVehiculo();
        IteradorVehiculo iterador = catalogo.busqueda(
                "economico");
        Vehiculo vehiculo;
        iterador.inicio();
        vehiculo = iterador.item();
        while (vehiculo != null)
        {
            vehiculo.visualiza();
            iterador.siguiente();
            vehiculo = iterador.item();
        }
    }
}
