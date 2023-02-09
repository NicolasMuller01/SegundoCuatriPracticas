package LICONEX_G15.examen;
import java.time.*;

public abstract class Examen {
    protected LocalDate fecha;


    protected Boolean aprobado;
            
    public Examen(LocalDate fecha) {
        this.fecha = fecha;
    }

//    @Override
//    public String toString() {
////        return "Examen{" + "fecha=" + fecha + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", apellido=" + apellido + ", tiempo=" + tiempo + ", faltas=" + faltas + ", aprobado=" + aprobado + '}';
//    }
    
    public abstract boolean realizoCircuitos();

    public LocalDate getFecha() {
        return fecha;
    }
    public Boolean getAprobado() {
        return aprobado;
    }


}
