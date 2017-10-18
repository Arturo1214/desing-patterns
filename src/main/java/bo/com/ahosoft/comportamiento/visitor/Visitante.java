package bo.com.ahosoft.comportamiento.visitor;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 03:20 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.visitor
 **/
public interface Visitante {
    void visita(EmpresaSinFilial empresa);
    void visita(EmpresaMadre empresa);
}
