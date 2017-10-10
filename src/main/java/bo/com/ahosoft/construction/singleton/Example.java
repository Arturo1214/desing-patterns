package bo.com.ahosoft.construction.singleton;

/**
 * Created by    : Arturo Herrera o.
 * Date          : 10-10-17 - 09:47 AM
 * Project       : desing-patterns
 * Package       : bo.com.ahosoft.construction.singleton
 **/
public class Example {
    protected String nombre, direccion, email;

    private static Example _instance = null;

    private Example() {}

    public static Example Instance() {
        if (_instance == null)
            _instance = new Example();
        return _instance;
    }

    public void visualiza()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Email: " + email);
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getDireccion()
    {
        return direccion;
    }
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
}
