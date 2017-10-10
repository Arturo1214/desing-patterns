package bo.com.ahosoft.estructuracion.proxy;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 05:05 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.proxy
 **/
public class AnimacionProxy implements Animacion {

    protected Video video = null;
    protected String foto = "mostrar la foto";

    public void dibuja() {
        if (video != null)
            video.dibuja();
        else
            dibuja(foto);
    }

    public void clic() {
        if(video == null) {
            video = new Video();
            video.carga();
        }

        video.reproduce();
    }

    public void dibuja(String foto) {
        System.out.println(foto);
    }
}
