package bo.com.ahosoft.composicion.reflectiveVisitor;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 07:02 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.reflectiveVisitor
 **/
public abstract class Empresa implements Visitable{
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
}
