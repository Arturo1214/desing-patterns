package bo.com.ahosoft.comportamiento.visitor;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 03:25 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.visitor
 **/
public class VisitanteMailingComercial implements Visitante {
    public void visita(EmpresaSinFilial empresa) {
        System.out.println("Envia un email a " + empresa.getNombre() + " direccion: " + empresa.getEmail() + " Propuesta comercial para su empresa");
    }

    public void visita(EmpresaMadre empresa) {
        System.out.println("Envía un email a " +
                empresa.getNombre() + " dirección: " + empresa.getEmail()
                + " Propuesta comercial para su grupo");
        System.out.println("Impresión de un correo para " +
                empresa.getNombre() + " dirección: " +
                empresa.getDireccion() +
                " Propuesta comercial para su grupo");
    }
}
