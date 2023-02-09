
package LICONEX_G15.vehiculos;

public abstract class Vehiculo {
    protected String patente;
    protected String marca;
    protected String cilindrada;

    public Vehiculo(String patente, String marca, String cilindrada) {
        this.patente = patente;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }
    public String getPatente() {
        return patente;
    }
    public String getMarca() {
        return marca;
    }
    public String getCilindrada() {
        return cilindrada;
    }
}
