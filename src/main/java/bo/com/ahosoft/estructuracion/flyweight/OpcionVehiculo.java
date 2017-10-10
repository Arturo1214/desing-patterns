package bo.com.ahosoft.estructuracion.flyweight;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 04:32 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.flyweight
 **/
public class OpcionVehiculo {
    protected String nombre, descripcion;
    protected Integer precioEstandar;

    public OpcionVehiculo(String nombre) {
        this.nombre = nombre;
        this.descripcion = "Descripcion de " + nombre;
        this.precioEstandar = 100;
    }

    public void visualiza (Integer precioDeVenta) {
        System.out.println("Opcion");
        System.out.println("Nombre: " + nombre);
        System.out.println(descripcion);
        System.out.println("Precio estandar: " + precioEstandar);
        System.out.println("Precio de venta: " + precioDeVenta);
    }
}
