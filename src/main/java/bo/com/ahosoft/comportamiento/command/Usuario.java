package bo.com.ahosoft.comportamiento.command;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 11-10-17 - 11:05 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.command
 **/
public class Usuario {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("A01", 1L, 1000.0);
        Vehiculo vehiculo2 = new Vehiculo("A11", 6L, 2000.);
        Vehiculo vehiculo3 = new Vehiculo("Z03", 2L, 3000.0);
        Catalogo catalogo = new Catalogo();
        catalogo.agrega(vehiculo1);
        catalogo.agrega(vehiculo2);
        catalogo.agrega(vehiculo3);
        System.out.println("Visualizacion inicial del catalogo");
        catalogo.visualiza();
        System.out.println();

        SolicitudRebaja solicitudRebaja = new SolicitudRebaja(10L, 5L, 0.1);
        catalogo.ejecutaSolicitudRebaja(solicitudRebaja);
        System.out.println("Visualizacion del catalogo tras ejecutar la primera solicitud");
        catalogo.visualiza();
        System.out.println();

        SolicitudRebaja solicitudRebaja1 = new SolicitudRebaja(10L, 5L, 0.5);
        catalogo.ejecutaSolicitudRebaja(solicitudRebaja1);
        System.out.println("Visualizacion del catalogo tras ejecutar la segunda solicitud");
        catalogo.visualiza();
        System.out.println();

        catalogo.anulaSolicitudRebaja(1);
        System.out.println("Visualizacion del catalogo tras " +
                "anular la primera solicitud");
        catalogo.visualiza();
        System.out.println();
        catalogo.restableceSolicutudRebaja(1);
        System.out.println("Visualizacion del catalogo tras " +
                "restablecer la primera solicitud");
        catalogo.visualiza();
        System.out.println();
    }
}
