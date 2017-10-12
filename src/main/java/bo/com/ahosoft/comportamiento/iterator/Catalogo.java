package bo.com.ahosoft.comportamiento.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 11:15 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.iterator
 **/
public abstract class Catalogo <TElemento extends Elemento, TIterador extends Iterador<TElemento>> {
    protected List<TElemento> contenido = new ArrayList<TElemento>();

    protected abstract TIterador creaIterador();

    public TIterador busqueda(String palabraClaveConsulta) {
        TIterador resultado = creaIterador();
        resultado.setPalabraClaveConsulta(palabraClaveConsulta, contenido);
        return resultado;
    }
}
