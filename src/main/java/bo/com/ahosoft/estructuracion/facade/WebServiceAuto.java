package bo.com.ahosoft.estructuracion.facade;

import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 04:13 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.facade
 **/
public interface WebServiceAuto {
    String documento(Integer indice);
    List<String> buscarVehiculos(Integer precioMedio, Integer deviacionMax);
}
