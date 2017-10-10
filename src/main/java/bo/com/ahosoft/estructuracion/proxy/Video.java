package bo.com.ahosoft.estructuracion.proxy;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 05:03 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.proxy
 **/
public class Video implements Animacion {

    public void dibuja() {
        System.out.println("Mostrar el video");
    }

    public void clic() {

    }

    public void carga() {
        System.out.println("Cargar el video");
    }

    public void reproduce() {
        System.out.println("Reproduce el video");
    }
}
