package bo.com.ahosoft.construction.prototype;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 03:46 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.prototype
 **/
public class Usuario {
    public static void main(String[] args) {
        //inicializacion de la documentacion en blanco
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        documentacionEnBlanco.incluye(new OrdenDePedido());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());
// creacion de documentacion nueva para dos clientes
        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
    }
}
