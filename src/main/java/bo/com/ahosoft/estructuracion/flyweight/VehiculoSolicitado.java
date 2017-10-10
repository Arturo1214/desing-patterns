package bo.com.ahosoft.estructuracion.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 04:40 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.flyweight
 **/
public class VehiculoSolicitado {
    protected List<OpcionVehiculo> opciones = new ArrayList<OpcionVehiculo>();
    protected List<Integer> precioDeVentaOpciones = new ArrayList<Integer>();

    public void agregarOpciones(String nombre, Integer precioDeVemta, FabricaOpcion fabrica) {
        opciones.add(fabrica.getOption(nombre));
        precioDeVentaOpciones.add(precioDeVemta);
    }

    public void muestraOpciones(){
        Integer indice, tamaño;
        tamaño = opciones.size();
        for(indice = 0; indice < tamaño; indice++) {
            opciones.get(indice).visualiza(precioDeVentaOpciones.get(indice));
            System.out.println();
        }
    }
}
