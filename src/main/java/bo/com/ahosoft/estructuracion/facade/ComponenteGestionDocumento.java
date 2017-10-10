package bo.com.ahosoft.estructuracion.facade;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 04:10 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.facade
 **/
public class ComponenteGestionDocumento implements GestionDocumento {
    public String documento(Integer indice) {
        return "Documento numero " + indice;
    }
}
