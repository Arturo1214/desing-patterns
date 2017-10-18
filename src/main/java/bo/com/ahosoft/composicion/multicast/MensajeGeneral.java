package bo.com.ahosoft.composicion.multicast;

import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 03:50 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.composicion.multicast
 **/
public class MensajeGeneral extends MensajeAbstracto{
    protected List<String> contenido;


    public MensajeGeneral(List<String> contenido) {
        this.contenido = contenido;
    }

    public List<String> getContenido() {
        return contenido;
    }

}
