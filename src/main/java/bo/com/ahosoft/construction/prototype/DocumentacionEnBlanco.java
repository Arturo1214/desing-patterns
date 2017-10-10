package bo.com.ahosoft.construction.prototype;

import java.util.ArrayList;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 03:33 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.prototype
 **/
public class DocumentacionEnBlanco extends Documentacion {

    private static DocumentacionEnBlanco _instance = null;

    private DocumentacionEnBlanco() {
        documentos = new ArrayList<Documento>();
    }

    public static DocumentacionEnBlanco Instance() {
        if(_instance == null)
            _instance = new DocumentacionEnBlanco();
        return _instance;
    }

    public void incluye(Documento doc) {
        documentos.add(doc);
    }

    public void excluye(Documento doc) {
        documentos.remove(doc);
    }
}
