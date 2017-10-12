package bo.com.ahosoft.comportamiento.iterator;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 10:50 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.iterator
 **/
public abstract class Elemento {
    protected String descripcion;

    public Elemento(String descripcion) {
        this.descripcion = descripcion;
    }

    public Elemento() {

    }

    public Boolean palabraClaveValida(String palabraClave) {
        return descripcion.indexOf(palabraClave) != -1;
    }
}
