package bo.com.ahosoft.comportamiento.strategy;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 11:28 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.strategy
 **/
public class VistaVehiculo {
    protected String descripcion;

    public VistaVehiculo(String descripcion) {
        this.descripcion = descripcion;
    }

    public void dibuja() {
        System.out.print(descripcion);
    }
}
