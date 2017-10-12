package bo.com.ahosoft.comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 12-10-17 - 11:56 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.mediator
 **/
public class Formulario {
    protected List<Control> controles = new ArrayList<Control>();
    protected List<Control> controlesCoprestatario = new ArrayList<Control>();
    protected PopupMenu menuCoprestatario;
    protected Boton botonOk;
    protected Boolean enCurso = true;

    public void agregaControl(Control control) {
        controles.add(control);
        control.setDirector(this);
    }

    public void agregaControlCoprestatario(Control control) {
        controlesCoprestatario.add(control);
        control.setDirector(this);
    }


    public void setMenuCoprestatario(PopupMenu menuCoprestatario) {
        this.menuCoprestatario = menuCoprestatario;
    }

    public void setBotonOK(Boton botonOk) {
        this.botonOk = botonOk;
    }

    public void controlModificado(Control control) {
        if (control == menuCoprestatario)
            if(control.getValor().equals("con coprestatario")) {
                for (Control elementoCoprestatario: controlesCoprestatario)
                    elementoCoprestatario.informa();
            }
        if( control == botonOk)
            enCurso = false;
    }

    public void informa() {
        while (true) {
            for (Control control: controles) {
                control.informa();
                if(!enCurso)
                    return;
            }
        }
    }
}
