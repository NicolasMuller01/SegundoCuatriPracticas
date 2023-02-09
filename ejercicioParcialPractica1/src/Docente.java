public class Docente extends Cliente{
    String numeroLegajo;

    public Docente(Integer dni, String apellido, String nombre, String numeroLegajo) {
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
