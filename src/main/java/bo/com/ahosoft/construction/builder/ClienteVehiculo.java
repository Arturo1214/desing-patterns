package bo.com.ahosoft.construction.builder;

import java.util.Scanner;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 12:01 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.builder
 **/
public class ClienteVehiculo {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ConstructorDocumentacionVehiculo constructor;
        System.out.print("Desea generar " +
                "documentacion HTML (1) o PDF (2):");
        String seleccion = reader.next();
        if (seleccion.equals("1"))
        {
            constructor = new
                    ConstructorDocumentacionVehiculoHtml();
        }
        else
        {
            constructor =
                    new ConstructorDocumentacionVehiculoPdf();
        }
        Vendedor vendedor = new Vendedor(constructor);
        Documentacion documentacion =
                vendedor.construye("Martin");
        documentacion.imprime();
    }
}
