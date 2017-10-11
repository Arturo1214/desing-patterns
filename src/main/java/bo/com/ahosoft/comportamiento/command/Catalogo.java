package bo.com.ahosoft.comportamiento.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 10:56 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.command
 **/
public class Catalogo {
    protected List<Vehiculo> vehiculosStock = new ArrayList<Vehiculo>();
    protected List<SolicitudRebaja> solicitudes = new ArrayList<SolicitudRebaja>();

    public void ejecutaSolicitudRebaja(SolicitudRebaja solicitud) {
        solicitudes.add(0, solicitud);
        solicitud.rebaja(vehiculosStock);
    }

    public void anulaSolicitudRebaja(Integer orden) {
        solicitudes.get(orden).anula();
    }

    public void restableceSolicutudRebaja(Integer orden) {
        solicitudes.get(orden).restablece();
    }

    public void agrega(Vehiculo vehiculo) {
        vehiculosStock.add(vehiculo);
    }

    public void visualiza() {
        for (Vehiculo vehiculo: vehiculosStock)
            vehiculo.visualiza();
    }

}
