package bo.com.ahosoft.comportamiento.interpreter;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 03:16 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.interpreter
 **/
public abstract class OperadorBinario extends Expresion{
    protected Expresion operandoIzquierdo, operandoDerecho;

    public OperadorBinario(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        this.operandoIzquierdo = operandoIzquierdo;
        this.operandoDerecho = operandoDerecho;
    }
}
