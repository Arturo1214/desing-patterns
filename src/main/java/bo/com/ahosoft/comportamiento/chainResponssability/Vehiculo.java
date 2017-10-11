package bo.com.ahosoft.comportamiento.chainResponssability;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 09:33 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.chainResponssability
 **/
public class Vehiculo extends ObjetoBasico{

    protected String descripcion;


    public Vehiculo(String descripcion) {
        this.descripcion = descripcion;
    }

    protected String getDescripcion() {
        return descripcion;
    }


}
