package bo.com.ahosoft.comportamiento.chainResponssability;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 09:26 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.chainResponssability
 **/
public abstract class ObjetoBasico {

    protected ObjetoBasico siguiente;

    private String descripcionPorDefecto() {
        return "descripcion por defecto";
    }

    protected abstract String getDescripcion() ;

    public String devuelveDescripcion() {
        String resultado;
        resultado = this.getDescripcion();
        if(resultado != null)
            return resultado;
        if(siguiente != null)
            return siguiente.devuelveDescripcion();
        else
            return this.descripcionPorDefecto();
    }

    public void setSiguiente(ObjetoBasico siguiente) {
        this.siguiente = siguiente;
    }
}
