package bo.com.ahosoft.construction.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 11:32 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.constuction.builder
 **/
public abstract class Documentacion {
    protected List<String> contenido = new ArrayList<String>();

    public abstract void agregarDocumento (String documento);
    public abstract void imprime ();
}
