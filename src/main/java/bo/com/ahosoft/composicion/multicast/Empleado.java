package bo.com.ahosoft.composicion.multicast;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 03:59 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.composicion.multicast
 **/
public abstract class Empleado implements ReceptorGeneral {
    protected String nombre;

    public Empleado(String nombre) {
        super();
        this.nombre = nombre;
    }

    public void recibe(MensajeGeneral mensaje) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Mensaje: ");
        for (String linea: mensaje.contenido)
            System.out.println(linea);
    }
}
