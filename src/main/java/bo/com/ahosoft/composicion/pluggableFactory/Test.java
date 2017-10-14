package bo.com.ahosoft.composicion.pluggableFactory;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 06:20 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.pluggableFactory
 **/
public class Test {
    public static void main(String[] args) {
        Automovil protoAutomovilEstandarAzul = new AutomovilElectricidad();
        protoAutomovilEstandarAzul.setModelo("estandar");
        protoAutomovilEstandarAzul.setColor("rojo");

        Scooter protoScooterClasicoRojo = new ScooterGasolina();
        protoScooterClasicoRojo.setModelo("clasico");
        protoScooterClasicoRojo.setColor("rojo");

        FabricaVehiculo fabrica = new FabricaVehiculo();
        fabrica.setPrototypeAutomovil(protoAutomovilEstandarAzul);
        fabrica.setPrototypeScooter(protoScooterClasicoRojo);

        Automovil auto = fabrica.creaAutomovil();
        auto.visualizaCaracteristicas();
        Scooter scooter = fabrica.creaScooter();
        scooter.visualizaCaracteristicas();
    }
}
