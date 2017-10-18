package bo.com.ahosoft.composicion.multicast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 03:57 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.composicion.multicast
 **/
public class DireccionGeneral {
    protected EmisorGeneral emisorGeneral = new EmisorGeneral();

    public void enviaMensajes() {
        List<String> contenido = new ArrayList<String>();
        contenido.add("Información general");
        contenido.add("Información específica");
        MensajeGeneral mensaje = new MensajeGeneral(contenido);
        emisorGeneral.envioMultiple(mensaje);
    }

    public void agregaReceptorGeneral(Empleado receptor) {
        emisorGeneral.agrega(receptor);
    }
}
