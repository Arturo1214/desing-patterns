package bo.com.ahosoft.construction.prototype;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 03:24 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.prototype
 **/
public class SolicitudMatriculacion extends Documento {
    public void imprime() {
        System.out.println(
                "Imprime la solicitud de matriculacion: " + contenido);
    }

    public void visualiza() {
        System.out.println(
                "Muestra la solicitud de matriculacion: " + contenido);
    }
}
