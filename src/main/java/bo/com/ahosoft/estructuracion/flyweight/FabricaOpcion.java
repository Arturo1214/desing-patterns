package bo.com.ahosoft.estructuracion.flyweight;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 04:36 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.flyweight
 **/
public class FabricaOpcion {
    protected Map<String, OpcionVehiculo> opciones = new TreeMap<String, OpcionVehiculo>();

    public OpcionVehiculo getOption(String nombre) {
        OpcionVehiculo resultado;
        if (opciones.containsKey(nombre))
            return opciones.get(nombre);
        else {
            resultado = new OpcionVehiculo(nombre);
            opciones.put(nombre, resultado);
        }
        return resultado;

    }
}
