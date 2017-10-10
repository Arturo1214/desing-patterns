package bo.com.ahosoft.estructuracion.adapter;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 10:42 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.adapter
 **/
public class ComponentePdf {
    protected String contenido;

    public void pdfFijarContenido(String contenido) {
        this.contenido = contenido;
    }

    public void pdfPreparaVizualizacion() {
        System.out.println("Vizualiza PDF: Comienzo");
    }

    public void pdfRefresca() {
        System.out.println("Visualiza contenido PDF: " + contenido);
    }

    public void pdfFinalizaVisualizacion() {
        System.out.println("Visualiza PDF: Fin");
    }

    public void pdfEnviaImpresora() {
        System.out.println("Impresion PDF: " + contenido);
    }
}
