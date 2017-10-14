package bo.com.ahosoft.composicion.reflectiveVisitor;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 07:38 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.reflectiveVisitor
 **/
public interface VisitanteEmpresa {
    void visita(EmpresaSinFilial empresa);
    void visita(EmpresaMadre empresa);
}
