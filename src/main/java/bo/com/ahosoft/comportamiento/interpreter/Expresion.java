package bo.com.ahosoft.comportamiento.interpreter;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 01:44 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.interpreter
 **/
public abstract class Expresion {

    protected static String fuente;
    protected static Integer indice;
    protected static String pieza;

    public abstract boolean evalua(String descripcion);

    protected static void siguientePieza() {
        while ((indice < fuente.length()) && (fuente.charAt(indice) == ' '))
            indice ++;
        if( indice == fuente.length() )
            pieza = null;
        else if ((fuente.charAt(indice) == '(') ||
                (fuente.charAt(indice) == ')')){
            pieza = fuente.substring(indice, indice +1);
            indice ++;
        } else  {
            Integer inicio = indice;
            while ((indice < fuente.length()) && (fuente.charAt(indice) != ' ') && (fuente.charAt(indice) != ')'))
                indice ++;

            pieza = fuente.substring(inicio, indice);
        }

    }

    public static Expresion analiza(String fuente) throws Exception {
        Expresion.fuente = fuente;
        indice = 0;
        siguientePieza();
        return OperadorO.parsea();
    }

    public static Expresion parsea() throws Exception {
        Expresion resultado;
        if (pieza.equals("(")) {
            siguientePieza();
            resultado = OperadorO.parsea();
            if( pieza == null )
                throw new Exception("Error de sintaxis");
            if( !pieza.equals(")"))
                throw new Exception("Error de sintaxis");
            siguientePieza();
        } else
            resultado = PalabraClave.parsea();
        return resultado;
    }

}
