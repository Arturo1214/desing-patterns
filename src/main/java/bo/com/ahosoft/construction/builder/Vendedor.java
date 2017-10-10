package bo.com.ahosoft.construction.builder;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 11:57 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.builder
 **/
public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;

    public Vendedor(ConstructorDocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }

    public Documentacion construye(String nombreCliente) {
        constructor.construyeSolicitudPedido(nombreCliente);
        constructor.construyeSolicitudMatriculacion(nombreCliente);
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }
}
