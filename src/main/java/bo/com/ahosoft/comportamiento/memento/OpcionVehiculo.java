package bo.com.ahosoft.comportamiento.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 03:20 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.memento
 **/
public class OpcionVehiculo {
    protected String nombre;
    protected List<OpcionVehiculo> opcionesIncompatibles = new ArrayList<OpcionVehiculo>();

    public OpcionVehiculo(String nombre) {
        this.nombre = nombre;
    }

    public void agregaOpcionIncompatible(OpcionVehiculo opcionVehiculo) {
        if(!opcionesIncompatibles.contains(opcionVehiculo)) {
            opcionesIncompatibles.add(opcionVehiculo);
            opcionVehiculo.agregaOpcionIncompatible(this);
        }
    }

    public List<OpcionVehiculo> getOpcionesIncompatibles() {
        return opcionesIncompatibles;
    }

    public void visualiza() {
        System.out.println("opcion: " + nombre);
    }
}
