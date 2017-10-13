package bo.com.ahosoft.comportamiento.strategy;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 11:54 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.strategy
 **/
public class Usuario {
    public static void main(String[] args) {
        VistaCatalogo vistaCatalogo1 = new VistaCatalogo(new DibujaTresVehiculosPorLinea());
        vistaCatalogo1.dibuja();
        VistaCatalogo vistaCatalogo2 = new VistaCatalogo(new DibujaUnVehiculoPorLinea());
        vistaCatalogo2.dibuja();
    }
}
