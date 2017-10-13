package bo.com.ahosoft.comportamiento.observer;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 09:44 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.observer
 **/
public class VistaVehiculo implements Observador {

    protected Vehiculo vehiculo;
    protected String texto = "";

    public VistaVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        vehiculo.agrega(this);
        actualizaTexto();
    }

    public void actualizaTexto() {
        texto = "Descripcion " + vehiculo.descripcion + " Precio: " + vehiculo.precio;
    }

    public void actualiza() {
        actualizaTexto();
        this.redibuja();
    }

    public void redibuja() {
        System.out.println(texto);
    }
}
