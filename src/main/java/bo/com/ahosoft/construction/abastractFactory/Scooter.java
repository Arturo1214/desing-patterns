package bo.com.ahosoft.construction.abastractFactory;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 06-10-17 - 10:39 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.abastractFactory
 **/
public abstract class Scooter {
    protected String modelo;
    protected String color;
    protected Integer potencia;

    public Scooter(String modelo, String color, Integer potencia) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }

    public abstract void mostrarCaracteristicas() ;
}
