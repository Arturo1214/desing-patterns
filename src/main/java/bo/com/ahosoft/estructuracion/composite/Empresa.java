package bo.com.ahosoft.estructuracion.composite;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 01:18 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.composite
 **/
public abstract class Empresa {
    protected static Double costeUnitarioVehiculo = 5.0;
    protected Integer nVehiculos = 0;

    public void agregaVehiculo() {
        nVehiculos = nVehiculos + 1;
    }

    public abstract Double calculaCosteMantenimiento();
    public abstract Boolean agregaFilial(Empresa filial);
}
