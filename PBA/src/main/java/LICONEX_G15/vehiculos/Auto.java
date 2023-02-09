
package LICONEX_G15.vehiculos;


public class Auto extends Vehiculo {
    private Integer cantidadPuertas;
    public Auto( String patente, String marca, String cilindrada,Integer cantidadPuertas) {
        super(patente, marca, cilindrada);
        this.cantidadPuertas = cantidadPuertas;
        
    }
    @Override
    public String toString() {
        return "Auto{" + "cantidadPuertas=" + cantidadPuertas + "patente: "+patente+"marca: "+marca+"cilindrada: "+cilindrada+'}';
    }
    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }
}
