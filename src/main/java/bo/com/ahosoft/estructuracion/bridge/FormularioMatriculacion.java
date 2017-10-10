package bo.com.ahosoft.estructuracion.bridge;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 11:35 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.bridge
 **/
public abstract class FormularioMatriculacion {
    protected String contenido;
    protected FormularioImpl implementacion;

    public FormularioMatriculacion(FormularioImpl implementacion) {
        this.implementacion = implementacion;
    }

    public void visualiza() {
        implementacion.digujaTexto("Numero de matricula existente: ");
    }

    public void generaDocumento() {
        implementacion.digujaTexto("Solicitud de matriculacion");
        implementacion.digujaTexto("numero de matricula: " + contenido);
    }

    public boolean administraZona() {
        contenido = implementacion.administraZonaIndicada();
        return this.controlZona(contenido);
    }

    protected abstract boolean controlZona(String matricula);
}
