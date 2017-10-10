package bo.com.ahosoft.estructuracion.decorator;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 03:38 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.decorator
 **/
public class ModeloDecorador extends Decorador {

    public ModeloDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    protected  void visualizaInformacionTecnica() {
        System.out.println("Informacion tecnica del modelo");
    }

    @Override
    public void visualiza() {
        super.visualiza();
        this.visualizaInformacionTecnica();
    }
}
