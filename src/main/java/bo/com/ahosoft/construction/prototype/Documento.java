package bo.com.ahosoft.construction.prototype;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 03:14 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.prototype
 **/
public abstract class Documento implements Cloneable {

    protected String contenido = new String();

    public Documento duplica() {
        Documento resultado;
        try {
            resultado = (Documento) this.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }

        return resultado;
    }

    public void rellena(String informacion) {
        contenido = informacion;
    }

    public abstract void imprime() ;
    public abstract void visualiza() ;
}
