package bo.com.ahosoft.composicion.reflectiveVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 07:08 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.reflectiveVisitor
 **/
public class EmpresaMadre extends Empresa {

    protected List<Empresa> filiales = new ArrayList<Empresa>();

    public EmpresaMadre(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }

    public List<Empresa> getFiliales() {
        return filiales;
    }

    public Boolean agregaFilial(Empresa filial) {
        return filiales.add(filial);
    }
}
