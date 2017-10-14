package bo.com.ahosoft.composicion.reflectiveVisitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 07:18 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.reflectiveVisitor
 **/
public abstract class Visitante {

    public void iniciaVisita(Visitable visitable) {
        int numMetodosEncontrados;
        Method metodoAInvocar;
        List<Class<?>> visitableClases = new ArrayList<Class<?>>();
        List<Class<?>> visitableSuperClases;
        visitableClases.add(visitable.getClass());
        numMetodosEncontrados = 0;
        metodoAInvocar = null;
        do {
            visitableSuperClases = new ArrayList<Class<?>>();
            for (Class<?> visitableClase : visitableClases) {
                Method metodo = null;
                Class<?> visitadorClase = this.getClass();
                while ((metodo == null) && (visitadorClase != Object.class)) {
                    try {
                        metodo = visitableClase.getDeclaredMethod("visita", new Class[] {visitableClase});
                    } catch (SecurityException e) {

                    } catch (NoSuchMethodException e) {}
                    if(metodo == null)
                        visitadorClase = visitadorClase.getSuperclass();
                }

                if (metodo == null) {
                    Class<?> superClase = visitableClase.getSuperclass();
                    if ((superClase != null) && (!visitableSuperClases.contains(superClase)))
                        visitableSuperClases.add(superClase);
                    for (Class<?> unaInterfaz : visitableClase.getInterfaces())
                        if(!visitableSuperClases.contains(unaInterfaz))
                            visitableSuperClases.add(unaInterfaz);
                } else {
                    numMetodosEncontrados ++;
                    metodoAInvocar = metodo;
                }
            }

            visitableClases = visitableSuperClases;
        } while (visitableClases.size() > 0);

        if (numMetodosEncontrados == 0)
            System.out
                    .println("¡La llamada al método visita para la clase \""
                            + visitable.getClass().getSimpleName()
                            + "\" resulta imposible!");
        else if (numMetodosEncontrados > 1)
            System.out
                    .println("¡La llamada al método visita para la clase \""
                            + visitable.getClass().getSimpleName()
                            + "\" resulta ambigua!");
        else
            try {
                metodoAInvocar.invoke(this, new Object[] {visitable});
            } catch (IllegalArgumentException e) {

            } catch (IllegalAccessException e) {

            } catch (InvocationTargetException e) {

            }

    }
}
