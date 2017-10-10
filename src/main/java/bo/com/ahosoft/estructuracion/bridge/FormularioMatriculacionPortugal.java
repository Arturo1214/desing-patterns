package bo.com.ahosoft.estructuracion.bridge;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 11:44 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.bridge
 **/
public class FormularioMatriculacionPortugal extends FormularioMatriculacion {

    public FormularioMatriculacionPortugal(FormularioImpl implementacion) {
        super(implementacion);
    }

    protected boolean controlZona(String matricula) {
        return matricula.length() == 6;
    }
}
