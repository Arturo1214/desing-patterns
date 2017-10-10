package bo.com.ahosoft.construction.builder;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 11:43 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.constuction.builder
 **/
public class DocumentacionPdf extends Documentacion {
    public void agregarDocumento(String documento) {
        if(documento.startsWith("<PDF>"))
            contenido.add(documento);
    }

    public void imprime() {
        System.out.println("Documentacion PDF");
        for (String s: contenido)
            System.out.println(s);
    }
}
