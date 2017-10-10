package bo.com.ahosoft.estructuracion.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 04:03 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.facade
 **/
public class ComponenteCatalogo implements Catalogo {

    protected Object[] descripcionVehiculo =
            {
                    "Berlina 5 puertas", 6000, "Compacto 3 puertas", 4000,
                    "Espace 5 puertas", 8000, "Break 5 puertas", 7000,
                    "Coupé 2 puertas", 9000, "Utilitario 3 puertas", 5000
            };

    public List<String> buscarVehiculos(Integer precioMin, Integer precioMax) {
        Integer indice, tamaño;
        List<String> resultado = new ArrayList<String>();
        tamaño = descripcionVehiculo.length / 2;

        for (indice = 0; indice < tamaño; indice++) {
            Integer precio = (Integer) descripcionVehiculo[2 * indice + 1];
            if ((precio >= precioMin) && (precio <= precioMax))
                resultado.add((String) descripcionVehiculo[2 * indice]);
        }
        return resultado;
    }
}
