package bo.com.ahosoft.comportamiento.memento;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 03:56 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.memento
 **/
public class Usuario {
    public static void main(String[] args) {
        Memento memento;
        OpcionVehiculo opcion1 = new OpcionVehiculo(
                "Asientos en cuero");
        OpcionVehiculo opcion2 = new OpcionVehiculo(
                "Reclinables");
        OpcionVehiculo opcion3 = new OpcionVehiculo(
                "Asientos deportivos");
        opcion1.agregaOpcionIncompatible(opcion3);
        opcion2.agregaOpcionIncompatible(opcion3);
        CarritoOpciones carritoOpciones = new CarritoOpciones();
        carritoOpciones.agregaOpcion(opcion1);
        carritoOpciones.agregaOpcion(opcion2);
        carritoOpciones.visualiza();
        memento = carritoOpciones.agregaOpcion(opcion3);
        carritoOpciones.visualiza();
        carritoOpciones.anula(memento);
        carritoOpciones.visualiza();
    }
}
