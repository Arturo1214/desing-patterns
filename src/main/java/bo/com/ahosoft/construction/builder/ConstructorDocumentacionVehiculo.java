package bo.com.ahosoft.construction.builder;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 11:45 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.constuction.builder
 **/
public abstract class ConstructorDocumentacionVehiculo {

    protected Documentacion documentacion;

    public abstract void construyeSolicitudPedido(String nombreCliente);
    public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);

    public Documentacion resultado() {
        return documentacion;
    }
}
