package bo.com.ahosoft.construction.builder;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 11:48 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.builder
 **/
public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo {

    public  ConstructorDocumentacionVehiculoHtml() {
        documentacion = new DocumentacionHtml();
    }

    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<HTML>Solicitud de pedido cliente: " + nombreCliente + "</HTML>";
        documentacion.agregarDocumento(documento);
    }

    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento =
                "<HTML>Solicitud de matriculacion Solicitante: " +
                        nombreSolicitante + "</HTML>";
        documentacion.agregarDocumento(documento);
    }
}
