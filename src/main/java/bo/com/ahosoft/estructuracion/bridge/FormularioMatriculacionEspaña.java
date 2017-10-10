package bo.com.ahosoft.estructuracion.bridge;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 11:43 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.bridge
 **/
public class FormularioMatriculacionEspaña extends FormularioMatriculacion {

    public FormularioMatriculacionEspaña(FormularioImpl implementacion) {
        super(implementacion);
    }

    protected boolean controlZona(String matricula) {
        return matricula.length() == 7;
    }
}
