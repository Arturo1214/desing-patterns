package bo.com.ahosoft.composicion.multicast;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 04:12 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.composicion.multicast
 **/
public class DireccionComercial {
    protected EmisorComercial emisorComercial = new EmisorComercial();

    public void enviaMensajes() {
        MensajeComercial mensaje =  new MensajeComercial("Anuncio nueva gama");
        emisorComercial.envioMultiple(mensaje);
        mensaje = new MensajeComercial("Anuncio supresion modelo");
        emisorComercial.envioMultiple(mensaje);
    }

    public void agregaReceptorComercial(ReceptorComercial receptor) {
        emisorComercial.agrega(receptor);
    }
}
