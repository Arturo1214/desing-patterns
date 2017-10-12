package bo.com.ahosoft.comportamiento.memento;

import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 03:33 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.memento
 **/
public interface Memento {
    void setEstado(List<OpcionVehiculo> opciones);
    List<OpcionVehiculo> getEstado();
}
