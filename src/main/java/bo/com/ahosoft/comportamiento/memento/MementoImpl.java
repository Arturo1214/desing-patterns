package bo.com.ahosoft.comportamiento.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 03:34 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.memento
 **/
public class MementoImpl implements Memento {

    protected List<OpcionVehiculo> opciones = new ArrayList<OpcionVehiculo>();

    public void setEstado(List<OpcionVehiculo> opciones) {
        this.opciones.clear();
        this.opciones.addAll(opciones);
    }

    public List<OpcionVehiculo> getEstado() {
        return opciones;
    }
}
