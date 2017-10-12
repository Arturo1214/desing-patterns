package bo.com.ahosoft.comportamiento.iterator;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 11:23 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.iterator
 **/
public class CatalogoVehiculo extends Catalogo<Vehiculo, IteradorVehiculo> {

    public CatalogoVehiculo()
    {
        contenido.add(new Vehiculo("vehiculo economico"));
        contenido.add(new Vehiculo("pequeño vehiculo economico"));
        contenido.add(new Vehiculo("vehiculo de gran calidad"));
    }

    protected IteradorVehiculo creaIterador() {
        return new IteradorVehiculo();
    }
}
