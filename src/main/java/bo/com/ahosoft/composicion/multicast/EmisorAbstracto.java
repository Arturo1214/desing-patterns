package bo.com.ahosoft.composicion.multicast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 03:46 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.composicion.multicast
 **/
public abstract class EmisorAbstracto<TMensaje extends MensajeAbstracto,
                                    TReceptor extends ReceptorAbstracto<TMensaje>> {

    protected List<TReceptor> registro = new ArrayList<TReceptor>();

    public void agrega(TReceptor receptor) {
        registro.add(receptor);
    }

    public void envioMultiple(TMensaje mensaje) {
        for (TReceptor receptor: registro)
            receptor.recibe(mensaje);
    }
}
