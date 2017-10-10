package bo.com.ahosoft.estructuracion.composite;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 01:53 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.composite
 **/
public class Usuario {
    public static void main(String[] args) {
        Empresa empresa1 = new EmpresaSinFilial();
        empresa1.agregaVehiculo();
        Empresa empresa2 = new EmpresaSinFilial();
        empresa2.agregaVehiculo();
        empresa2.agregaVehiculo();
        Empresa grupo = new EmpresaMadre();
        grupo.agregaFilial(empresa1);
        grupo.agregaFilial(empresa2);
        grupo.agregaVehiculo();
        System.out.println(
                "Coste de mantenimiento total del grupo: " +
                        grupo.calculaCosteMantenimiento());
    }
}
