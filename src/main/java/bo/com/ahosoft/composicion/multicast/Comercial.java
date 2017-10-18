package bo.com.ahosoft.composicion.multicast;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 04:15 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.composicion.multicast
 **/
public class Comercial extends Empleado {

    protected ReceptorComercial receptorComercial = new ReceptorComercial() {
        public void recibe(MensajeComercial mensajeComercial) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Mensaje: " +
                    mensajeComercial.getContenido());
        }
    };

    public Comercial(String nombre) {
        super(nombre);
    }

    public ReceptorComercial getReceptorComercial() {
        return receptorComercial;
    }
}
