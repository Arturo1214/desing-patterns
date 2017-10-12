package bo.com.ahosoft.comportamiento.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 03:38 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.memento
 **/
public class CarritoOpciones {
    protected List<OpcionVehiculo> opciones = new ArrayList<OpcionVehiculo>();

    public Memento agregaOpcion(OpcionVehiculo opcionVehiculo) {
        MementoImpl resultado = new MementoImpl();
        resultado.setEstado(opciones);
        opciones.removeAll(opcionVehiculo.getOpcionesIncompatibles());

        opciones.add(opcionVehiculo);
        return resultado;
    }

    public void anula(Memento memento) {
        MementoImpl mementoImplInstance;
        try {
            mementoImplInstance = (MementoImpl) memento;
        } catch (ClassCastException e) {
            return;
        }

        opciones = mementoImplInstance.getEstado();
    }

    public void visualiza() {
        System.out.println("Contenido de carrito de opciones");
        for (OpcionVehiculo opcion: opciones)
            opcion.visualiza();
        System.out.println();
    }
}
