
package LICONEX_G15.vehiculos;


public class Moto extends Vehiculo{
    private Boolean llevaTodosLosEspejos;
    public Moto(String patente, String marca, String cilindrada, Boolean llevaTodosLosEspejos) {
        super(patente, marca, cilindrada);
        this.llevaTodosLosEspejos = llevaTodosLosEspejos;
    }
    public Boolean getLlevaTodosLosEspejos() {
        return llevaTodosLosEspejos;
    }
}
