package bo.com.ahosoft.comportamiento.chainResponssability;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 09:36 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.chainResponssability
 **/
public class Modelo extends ObjetoBasico{

    protected String descripcion;
    protected String nombre;

    public Modelo(String nombre, String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    protected String getDescripcion() {
        if(descripcion != null)
            return "Modelo " + nombre + " : " + descripcion;
        else
            return null;
    }
}
