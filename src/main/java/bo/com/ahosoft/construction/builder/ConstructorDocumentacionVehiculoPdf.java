package bo.com.ahosoft.construction.builder;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 11:53 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.builder
 **/
public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoPdf() {
        documentacion = new DocumentacionPdf();
    }

    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<PDF>Solicitud de pedido Cliente: " +
                nombreCliente + "</PDF>";
        documentacion.agregarDocumento(documento);
    }

    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento =
                "<PDF>Solicitud de matriculacion Solicitante: " +
                        nombreSolicitante + "</PDF>";
        documentacion.agregarDocumento(documento);
    }
}
