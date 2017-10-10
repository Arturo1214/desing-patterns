package bo.com.ahosoft.estructuracion.adapter;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 10:40 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.adapter
 **/
public class DocumentoHtml implements Documento{

    protected String contenido;

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void dibuja() {
        System.out.println("Dibuja el documento HTML: " +
                contenido);
    }

    public void imprime() {
        System.out.println("Imprime el documento HTML: " +
                contenido);
    }
}
