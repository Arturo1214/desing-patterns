package bo.com.ahosoft.comportamiento.chainResponssability;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 09:40 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.chainResponssability
 **/
public class Marca extends ObjetoBasico{

    protected String descripcion1, descripcion2;
    protected String nombre;

    public Marca(String nombre, String descripcion1, String descripcion2) {
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.nombre = nombre;
    }

    protected String getDescripcion() {
        if ((descripcion1 != null) && (descripcion2 != null))
            return "Marca " + nombre + " : " + descripcion1 + " " + descripcion2;
        else if (descripcion1 != null)
            return "Marca " + nombre + " : " + descripcion1;
        else
            return null;
    }
}
