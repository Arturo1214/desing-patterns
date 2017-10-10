package bo.com.ahosoft.estructuracion.facade;

import java.util.List;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 04:16 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.estructuracion.facade
 **/
public class UsuarioWebService {

    public static void main(String[] args) {
        WebServiceAuto webServiceAuto = new WebServiceAutoImpl();
        System.out.println(webServiceAuto.documento(0));
        System.out.println(webServiceAuto.documento(1));

        List<String> resultados = webServiceAuto.buscarVehiculos(6000, 1000);

        if(resultados.size() > 0) {
            System.out.println("Vehiculo(s) cuyo precio esta comprendido entre 5000 y 7000");

            for (String resultado : resultados)
                System.out.println("    " + resultado);
        }
    }
}
