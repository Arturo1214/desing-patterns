package bo.com.ahosoft.comportamiento.visitor;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 03:21 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.visitor
 **/
public class EmpresaSinFilial extends Empresa{

    public EmpresaSinFilial(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }

    public Boolean agregaFilial(Empresa filial) {
        return false;
    }

    public void aceptaVisitante(Visitante visitante) {
        visitante.visita(this);
    }
}
