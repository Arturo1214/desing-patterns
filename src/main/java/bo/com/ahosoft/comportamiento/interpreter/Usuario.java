package bo.com.ahosoft.comportamiento.interpreter;

import java.util.Scanner;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 03:34 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.interpreter
 **/
public class Usuario {
    public static void main(String[] args) {
        Expresion expresionConsulta = null;
        Scanner reader = new Scanner(System.in);
        System.out.print("Introduzca su consulta: ");

        String consulta = reader.nextLine();
        try
        {
            expresionConsulta = Expresion.analiza(consulta);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            expresionConsulta = null;
        }
        if (expresionConsulta != null)
        {
            System.out.print(
                    "Introduzca la descripción de un vehículo: ");
            String descripcion = reader.nextLine();
            if (expresionConsulta.evalua(descripcion))
                System.out.print(
                        "La descripción responde a la consulta");
            else
                System.out.print(
                        "La descripción no responde a la consulta");
        }
    }
}
