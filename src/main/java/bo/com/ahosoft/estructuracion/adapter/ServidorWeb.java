package bo.com.ahosoft.estructuracion.adapter;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 11:00 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.adapter
 **/
public class ServidorWeb {
    public static void main(String[] args) {
        Documento documento1, documento2;
        documento1 = new DocumentoHtml();
        documento1.setContenido("Hello");
        documento1.dibuja();
        System.out.println();
        documento2 = new DocumentoPdf();
        documento2.setContenido("Hola");
        documento2.dibuja();
    }
}
