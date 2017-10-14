package bo.com.ahosoft.composicion.reflectiveVisitor;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 07:39 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.reflectiveVisitor
 **/
public class VisitanteMailingComercial extends Visitante implements VisitanteEmpresa{

    public void visita(EmpresaSinFilial empresa) {
        System.out.println("Envía un correo a " +
                empresa.getNombre()
                + " dirección: " + empresa.getEmail()
                + " Propuesta comercial para su empresa");
    }

    public void visita(EmpresaMadre empresa) {
        System.out.println("Envía un correo a " +
                empresa.getNombre()
                + " dirección: " + empresa.getEmail()
                + " Propuesta comercial para su grupo");
        System.out.println("Impresión de un correo para "
                + empresa.getNombre() + " dirección: "
                + empresa.getDireccion()
                + " Propuesta comercial para su grupo");
        for (Empresa filial: empresa.getFiliales())
            this.iniciaVisita(filial);
    }
}
