package bo.com.ahosoft.comportamiento.observer;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 09:40 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.observer
 **/
public class Vehiculo extends Sujeto {
    protected String descripcion;
    protected Double precio;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
        this.notifica();
    }
}
