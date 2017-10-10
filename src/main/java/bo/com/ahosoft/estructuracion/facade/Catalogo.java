package bo.com.ahosoft.estructuracion.facade;

import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 04:02 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.facade
 **/
public interface Catalogo {
    List<String> buscarVehiculos(Integer precioMin, Integer precioMax);
}
