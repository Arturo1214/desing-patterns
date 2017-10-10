package bo.com.ahosoft.construction.builder;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 11:35 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.constuction.builder
 **/
public class DocumentacionHtml extends Documentacion {

    public void agregarDocumento(String documento) {
        if(documento.startsWith("<HTML>"))
            contenido.add(documento);
    }

    public void imprime() {
        System.out.println("Documentacion HTML");
        for (String s: contenido)
            System.out.println(s);
    }
}
