public class Alumno extends Cliente{

    String numeroLegajo;

    public Alumno(Integer dni, String apellido, String nombre, String numeroLegajo) {
        super(dni, apellido, nombre);
        this.numeroLegajo = numeroLegajo;
    }

    public String getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(String numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }
}
