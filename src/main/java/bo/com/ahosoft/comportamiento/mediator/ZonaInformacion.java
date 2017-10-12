package bo.com.ahosoft.comportamiento.mediator;

import java.util.Scanner;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 12:03 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.mediator
 **/
public class ZonaInformacion extends Control {
    Scanner reader = new Scanner(System.in);

    public ZonaInformacion(String nombre) {
        super(nombre);
    }

    public void informa() {
        System.out.println("Informacion de: " + nombre);
        setValor(reader.nextLine());
        this.modifica();
    }
}
