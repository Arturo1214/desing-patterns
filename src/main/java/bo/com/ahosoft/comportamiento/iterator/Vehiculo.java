package bo.com.ahosoft.comportamiento.iterator;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 10:53 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.iterator
 **/
public class Vehiculo extends Elemento{

    public Vehiculo(String descripcion) {
        super(descripcion);
    }

    public void visualiza() {
        System.out.println("Descripcion del vehiculo: " + descripcion);
    }
}
