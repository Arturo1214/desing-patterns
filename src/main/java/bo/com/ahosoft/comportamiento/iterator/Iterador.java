package bo.com.ahosoft.comportamiento.iterator;

import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 10:55 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.iterator
 **/
public abstract class Iterador<TElemento> extends Elemento{

    protected String palabraClaveConsulta;
    protected Integer indice;
    protected List<TElemento> contenido;

    public Iterador(String descripcion) {
        super(descripcion);
    }

    public Iterador() {
        super();

    }


    public void setPalabraClaveConsulta(String palabraClaveConsulta,
                                        List<TElemento> contenido) {
        this.palabraClaveConsulta = palabraClaveConsulta;
        this.contenido = contenido;
    }

    public void inicio() {
        indice = 0;
        Integer tamaño = contenido.size();
        while ((indice < tamaño) && (!((Elemento)contenido.get(indice)).palabraClaveValida(palabraClaveConsulta))){
            indice++;
        }
    }

    public void siguiente()
    {
        int tamaño = contenido.size();
        indice++;
        while ((indice < tamaño) && (!((Elemento)contenido.get(indice))
                .palabraClaveValida (palabraClaveConsulta)))
            indice++;
    }
    public TElemento item()
    {
        if (indice < contenido.size())
            return contenido.get(indice);
        else
            return null;
    }
}
