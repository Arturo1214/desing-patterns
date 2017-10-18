package bo.com.ahosoft.comportamiento.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 03:22 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.visitor
 **/
public class EmpresaMadre extends Empresa {

    protected List<Empresa> filiales = new ArrayList<Empresa>();

    public EmpresaMadre(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }

    public Boolean agregaFilial(Empresa filial) {
        return filiales.add(filial);
    }

    public void aceptaVisitante(Visitante visitante) {
        visitante.visita(this);
        for (Empresa filial: filiales)
            filial.aceptaVisitante(visitante);
    }
}
