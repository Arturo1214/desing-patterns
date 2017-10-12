package bo.com.ahosoft.comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 01:54 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.mediator
 **/
public class PopupMenu extends Control {

    private List<String> opciones = new ArrayList<String>();
    protected Scanner reader = new Scanner(System.in);

    public PopupMenu(String nombre) {
        super(nombre);
    }

    public void informa() {
        System.out.println("Informacion de: " + nombre);
        System.out.println("Valor actual: " + getValor());
        for (Integer indice = 0; indice < opciones.size(); indice++)
            System.out.println("- " + indice + " )" + opciones.get(indice));

        Integer eleccion = reader.nextInt();
        if((eleccion > 0) && (eleccion < opciones.size())) {
            Boolean cambia = !(getValor().equals(opciones.get(eleccion)));
            if (cambia) {
                setValor(opciones.get(eleccion));
                this.modifica();
            }
        }
    }

    public void agregaOpcion(String opcion) {
        opciones.add(opcion);
    }
}
