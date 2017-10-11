package bo.com.ahosoft.comportamiento.interpreter;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 03:06 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.interpreter
 **/
public class PalabraClave extends Expresion {

    protected String palabraClave;

    public PalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public boolean evalua(String descripcion) {
        return descripcion.indexOf(palabraClave) != -1;
    }

    //Parte analisis sintactico
    public static Expresion parsea() throws Exception {
        Expresion resultado;
        resultado = new PalabraClave(pieza);
        siguientePieza();
        return resultado;
    }
}
