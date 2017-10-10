package bo.com.ahosoft.estructuracion.composite;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 01:48 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.composite
 **/
public class EmpresaSinFilial extends Empresa {
    public Double calculaCosteMantenimiento() {
        return nVehiculos * costeUnitarioVehiculo;
    }

    public Boolean agregaFilial(Empresa filial) {
        return false;
    }
}
