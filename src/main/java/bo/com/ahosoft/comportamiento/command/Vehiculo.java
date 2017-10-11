package bo.com.ahosoft.comportamiento.command;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 10:34 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.command
 **/
public class Vehiculo {
    protected String nombre;
    protected Long fechaEntradaStock;
    protected Double precioVenta;

    public Vehiculo(String nombre, Long fechaEntradaStock, Double precioVenta) {
        this.nombre = nombre;
        this.fechaEntradaStock = fechaEntradaStock;
        this.precioVenta = precioVenta;
    }

    public Long getTiempoEnStock(Long hoy) {
        return hoy - fechaEntradaStock;
    }

    public void modificaPrecio(Double coeficiente) {
        this.precioVenta = 0.01 * Math.round(coeficiente * this.precioVenta * 100);
    }

    public void visualiza() {
        System.out.println(nombre + " precio: " + precioVenta + " fecha entrada stock " + fechaEntradaStock);
    }
}
