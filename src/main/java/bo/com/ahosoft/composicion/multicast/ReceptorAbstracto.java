package bo.com.ahosoft.composicion.multicast;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 03:45 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.composicion.multicast
 **/
public interface ReceptorAbstracto<TMensaje extends MensajeAbstracto> {
    void recibe(TMensaje mensaje);
}
