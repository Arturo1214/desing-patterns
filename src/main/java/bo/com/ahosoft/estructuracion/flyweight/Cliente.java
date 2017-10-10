package bo.com.ahosoft.estructuracion.flyweight;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 04:50 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.flyweight
 **/
public class Cliente {
    public static void main(String[] args) {
        FabricaOpcion fabrica = new FabricaOpcion();
        VehiculoSolicitado vehiculo = new VehiculoSolicitado();
        vehiculo.agregarOpciones("air bag", 80, fabrica);
        vehiculo.agregarOpciones("direccion asistida", 90, fabrica);
        vehiculo.agregarOpciones("elevalunas electricos", 85, fabrica);

        vehiculo.muestraOpciones();
    }
}
