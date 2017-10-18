package bo.com.ahosoft.composicion.multicast;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 04:17 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.composicion.multicast
 **/
public class Consesionario {
    public static void main(String[] args) {
        DireccionGeneral direccionGeneral = new
                DireccionGeneral();
        DireccionComercial direccionComercial = new
                DireccionComercial();
        Comercial comercial1 = new Comercial("Pablo");
        Comercial comercial2 = new Comercial("Enrique");
        Administrativo administrativo = new Administrativo(
                "Juan");
        direccionGeneral.agregaReceptorGeneral(comercial1);
        direccionGeneral.agregaReceptorGeneral(comercial2);
        direccionGeneral.agregaReceptorGeneral
                (administrativo);
        direccionGeneral.enviaMensajes();

        direccionComercial.agregaReceptorComercial
                (comercial1.getReceptorComercial());
        direccionComercial.agregaReceptorComercial
                (comercial2.getReceptorComercial());
        direccionComercial.enviaMensajes();
    }
}
