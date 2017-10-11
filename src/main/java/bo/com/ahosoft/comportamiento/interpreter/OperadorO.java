package bo.com.ahosoft.comportamiento.interpreter;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 03:18 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.interpreter
 **/
public class OperadorO extends  OperadorBinario{

    public OperadorO(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    public boolean evalua(String descripcion) {
        return operandoIzquierdo.evalua(descripcion) || operandoDerecho.evalua(descripcion);
    }

    // parte nalisis sintactico
    public static Expresion parsea() throws Exception {
        Expresion resultadoIzquierdo, resultadoDerecho;
        resultadoIzquierdo = OperadorY.parsea();
        while ((pieza != null) && (pieza.equals("o"))) {
            siguientePieza();
            resultadoDerecho = OperadorY.parsea();
            resultadoIzquierdo = new OperadorO(resultadoIzquierdo, resultadoDerecho);
        }
        return resultadoIzquierdo;
    }
}
