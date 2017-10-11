package bo.com.ahosoft.comportamiento.interpreter;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 03:22 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.interpreter
 **/
public class OperadorY extends OperadorBinario{

    public OperadorY(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    public boolean evalua(String descripcion) {
        return operandoIzquierdo.evalua(descripcion) && operandoDerecho.evalua(descripcion);
    }

    //Parte analisis sintactico
    public static  Expresion parsea() throws Exception {
        Expresion resultadoIzquierdo, resultadoDerecho;
        resultadoIzquierdo = Expresion.parsea();
        while ((pieza != null) && (pieza.equals("y"))){
            siguientePieza();
            resultadoDerecho = Expresion.parsea();
            resultadoIzquierdo = new OperadorY(resultadoIzquierdo, resultadoDerecho);
        }
        return resultadoIzquierdo;
    }
}
