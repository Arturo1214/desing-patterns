package bo.com.ahosoft.construction.prototype;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 03:26 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.prototype
 **/
public class CertificadoCesion extends Documento {
    public void imprime() {
        System.out.println(
                "Imprime el certificado de cesion: " + contenido);
    }

    public void visualiza() {
        System.out.println(
                "Muestra el certificado de cesion: " + contenido);
    }
}
