package bo.com.ahosoft.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 13-10-17 - 09:35 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.observer
 **/
public abstract class Sujeto {
    protected List<Observador> observadores = new ArrayList<Observador>();

    public void agrega(Observador observador) {
        observadores.add(observador);
    }

    public void suprime(Observador observador) {
        observadores.remove(observador);
    }

    public void notifica() {
        for (Observador observador: observadores)
            observador.actualiza();
    }
}
