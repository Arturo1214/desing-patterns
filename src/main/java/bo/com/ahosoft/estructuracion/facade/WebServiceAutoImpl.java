package bo.com.ahosoft.estructuracion.facade;

import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 04:14 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.facade
 **/
public class WebServiceAutoImpl implements WebServiceAuto {

    protected Catalogo catalogo = new ComponenteCatalogo();
    protected GestionDocumento gestionDocumento = new ComponenteGestionDocumento();

    public String documento(Integer indice) {
        return gestionDocumento.documento(indice);
    }

    public List<String> buscarVehiculos(Integer precioMedio, Integer deviacionMax) {
        return catalogo.buscarVehiculos(precioMedio - deviacionMax, precioMedio + deviacionMax);
    }
}
