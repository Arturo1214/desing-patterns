package bo.com.ahosoft.construction.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 03:40 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.prototype
 **/
public class DocumentacionCliente extends Documentacion {

    public DocumentacionCliente(String informacion) {
        documentos = new ArrayList<Documento>();
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        List<Documento> documentosEnBlanco = documentacionEnBlanco.getDocumentos();
        for (Documento documento: documentosEnBlanco)
        {
            Documento copiaDocumento = documento.duplica();
            copiaDocumento.rellena(informacion);
            documentos.add(copiaDocumento);
        }
    }

    public void visualiza()
    {
        for (Documento documento: documentos)
            documento.visualiza();
    }
    public void imprime()
    {
        for (Documento documento: documentos)
            documento.imprime();
    }
}
