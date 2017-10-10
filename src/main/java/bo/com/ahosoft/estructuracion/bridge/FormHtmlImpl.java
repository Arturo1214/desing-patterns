package bo.com.ahosoft.estructuracion.bridge;

import java.util.Scanner;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 11:22 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.bridge
 **/
public class FormHtmlImpl implements FormularioImpl {

    Scanner reader = new Scanner(System.in);

    public void digujaTexto(String texto) {
        System.out.println("HTML: " + texto);
    }

    public String administraZonaIndicada() {
        return reader.next();
    }
}
