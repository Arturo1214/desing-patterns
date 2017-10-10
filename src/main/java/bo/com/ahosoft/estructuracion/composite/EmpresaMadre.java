package bo.com.ahosoft.estructuracion.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 01:49 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.composite
 **/
public class EmpresaMadre extends Empresa {

    protected List<Empresa> filiales = new ArrayList<Empresa>();

    public Double calculaCosteMantenimiento() {
        Double coste = 0.0;
        for(Empresa filial : filiales)
            coste = coste + filial.calculaCosteMantenimiento();
        return coste + nVehiculos * costeUnitarioVehiculo;
    }

    public Boolean agregaFilial(Empresa filial) {
        return filiales.add(filial);
    }
}
