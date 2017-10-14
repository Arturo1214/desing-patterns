package bo.com.ahosoft.composicion.pluggableFactory;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 06:14 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.pluggableFactory
 **/
public class FabricaVehiculo {
    protected Automovil prototypeAutomovil;
    protected Scooter prototypeScooter;

    public FabricaVehiculo() {
        prototypeAutomovil = null;
        prototypeScooter = null;
    }

    public FabricaVehiculo(Automovil prototypeAutomovil, Scooter prototypeScooter) {
        this.prototypeAutomovil = prototypeAutomovil;
        this.prototypeScooter = prototypeScooter;
    }

    public Automovil getPrototypeAutomovil() {
        return prototypeAutomovil;
    }

    public void setPrototypeAutomovil(Automovil prototypeAutomovil) {
        this.prototypeAutomovil = prototypeAutomovil;
    }

    public Scooter getPrototypeScooter() {
        return prototypeScooter;
    }

    public void setPrototypeScooter(Scooter prototypeScooter) {
        this.prototypeScooter = prototypeScooter;
    }

    public Automovil creaAutomovil() {
        if(prototypeAutomovil == null)
            return null;
        return prototypeAutomovil.dublica();
    }

    public Scooter creaScooter() {
        if(prototypeScooter == null)
            return null;
        return prototypeScooter.duplica();
    }
}
