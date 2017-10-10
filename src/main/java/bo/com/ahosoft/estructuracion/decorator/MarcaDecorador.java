package bo.com.ahosoft.estructuracion.decorator;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 03:41 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.decorator
 **/
public class MarcaDecorador extends Decorador {

    public MarcaDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    protected void visualizaLogo() {
        System.out.println("Logotipo de la marca");
    }

    @Override
    public void visualiza() {
        super.visualiza();
        this.visualizaLogo();
    }
}
