package TestExersice1;

public class Docente extends Cliente{
    Integer legajo;

    public Docente(Integer dni, String apellido, String nombre, Integer legajo) {
        super(dni, apellido, nombre);
        this.legajo = legajo;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
}
