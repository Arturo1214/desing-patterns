package bo.com.ahosoft.composicion.pluggableFactory;

/**
 * Created by: Arturo Herrera
 * Date : 14-10-17 - 06:04 PM
 * Project: bo.com.ahosoft
 * Package: bo.com.ahosoft.composicion.pluggableFactory
 **/
public abstract class Scooter implements Cloneable {

    protected String modelo;
    protected String color;
    protected Integer potencia;

    public Scooter duplica() {
        Scooter resultado;
        try {
            resultado = (Scooter) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
        return resultado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public abstract void visualizaCaracteristicas();
}
