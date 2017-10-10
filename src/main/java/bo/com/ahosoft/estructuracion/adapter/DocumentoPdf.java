package bo.com.ahosoft.estructuracion.adapter;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 10:50 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.adapter
 **/
public class DocumentoPdf implements Documento {

    protected ComponentePdf herramientaPdf = new ComponentePdf();

    public void setContenido(String contenido) {
        herramientaPdf.pdfFijarContenido(contenido);
    }

    public void dibuja() {
        herramientaPdf.pdfPreparaVizualizacion();
        herramientaPdf.pdfRefresca();
        herramientaPdf.pdfFinalizaVisualizacion();
    }

    public void imprime() {
        herramientaPdf.pdfEnviaImpresora();
    }
}
