package bo.com.ahosoft.comportamiento.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 11:46 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.strategy
 **/
public class VistaCatalogo {
    protected List<VistaVehiculo> contenido = new ArrayList<VistaVehiculo>();
    protected DibujaCatalogo dibujo;

    public VistaCatalogo(DibujaCatalogo dibujo) {
        contenido.add(new VistaVehiculo("vehiculo economico"));
        contenido.add(new VistaVehiculo("vehiculo amplio"));
        contenido.add(new VistaVehiculo("vehiculo rapido"));
        contenido.add(new VistaVehiculo("vehiculo confortable"));
        contenido.add(new VistaVehiculo("vehiculo deportivo"));
        this.dibujo = dibujo;
    }

    public void dibuja() {
        dibujo.dibuja(contenido);
    }
}
