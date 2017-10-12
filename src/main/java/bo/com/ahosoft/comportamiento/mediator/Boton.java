package bo.com.ahosoft.comportamiento.mediator;

import java.util.Scanner;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 01:50 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.mediator
 **/
public class Boton extends Control {

    Scanner reader = new Scanner(System.in);

    public Boton(String nombre) {
        super(nombre);
    }

    public void informa() {
        System.out.println("¿Desea activar el boton " + nombre + " ?");
        String respuesta = reader.nextLine();
        if(respuesta.equals("si"))
            this.modifica();
    }
}
