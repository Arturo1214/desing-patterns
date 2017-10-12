package bo.com.ahosoft.comportamiento.mediator;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 11:50 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.mediator
 **/
public abstract class Control {

    protected String valor = "";
    public Formulario director;
    public String nombre;

    public Control(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Formulario getDirector() {
        return director;
    }

    public void setDirector(Formulario director) {
        this.director = director;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public abstract void informa();

    protected void modifica() {
        getDirector().controlModificado(this);
    }
}
