package bo.com.ahosoft.comportamiento.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 10:43 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.command
 **/
public class SolicitudRebaja {
    protected List<Vehiculo> vehiculosEnStock = new ArrayList<Vehiculo>();
    protected Long hoy;
    protected Long tiempoEnStock;
    protected Double tasaDescuento;

    public SolicitudRebaja(Long hoy, Long tiempoEnStock, Double tasaDescuento) {
        this.hoy = hoy;
        this.tiempoEnStock = tiempoEnStock;
        this.tasaDescuento = tasaDescuento;
    }

    public void rebaja(List<Vehiculo> vehiculos) {
        vehiculosEnStock.clear();
        for (Vehiculo vehiculo : vehiculos)
            if(vehiculo.getTiempoEnStock(hoy) >= tiempoEnStock)
                vehiculosEnStock.add(vehiculo);

        for (Vehiculo vehiculo: vehiculosEnStock)
            vehiculo.modificaPrecio(1.0 - tasaDescuento);
    }

    public void anula() {
        for (Vehiculo vehiculo: vehiculosEnStock)
            vehiculo.modificaPrecio(1.0 / (1.0 - tasaDescuento));
    }

    public void restablece() {
        for (Vehiculo vehiculo: vehiculosEnStock)
            vehiculo.modificaPrecio(1.0 - tasaDescuento);
    }
}
