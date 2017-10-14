package bo.com.ahosoft.composicion.reflectiveVisitor;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 07:08 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.reflectiveVisitor
 **/
public class EmpresaSinFilial extends Empresa {

    public EmpresaSinFilial(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }

    public Boolean agregaFilial(Empresa filial) {
        return false;
    }
}
