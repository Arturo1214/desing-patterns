package bo.com.ahosoft.comportamiento.state;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 10:36 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.state
 **/
public class Producto {
    protected String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public void visualiza() {
        System.out.println("Producto: " + nombre);
    }
}
