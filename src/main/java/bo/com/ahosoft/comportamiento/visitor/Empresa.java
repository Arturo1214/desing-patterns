package bo.com.ahosoft.comportamiento.visitor;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 18-10-17 - 03:17 PM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.comportamiento.visitor
 **/
public abstract class Empresa {
    protected String nombre, email, direccion;

    public Empresa(String nombre, String email, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public abstract Boolean agregaFilial(Empresa filial);

    public abstract void aceptaVisitante(Visitante visitante);
}
