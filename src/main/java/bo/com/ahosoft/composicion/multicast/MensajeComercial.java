package bo.com.ahosoft.composicion.multicast;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 04:09 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.composicion.multicast
 **/
public class MensajeComercial extends MensajeAbstracto {

    protected String contenido;

    public MensajeComercial(String contenido) {
        super();
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}
