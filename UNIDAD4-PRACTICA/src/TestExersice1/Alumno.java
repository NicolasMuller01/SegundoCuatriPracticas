package TestExersice1;

public class Alumno extends Cliente{
    String legajo;

    public Alumno(Integer dni, String apellido, String nombre, String legajo) {
        super(dni, apellido, nombre);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
}
