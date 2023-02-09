package LICONEX_G15.Persona;

import java.time.LocalDate;

public class Persona {
    private Integer dni;
    private LocalDate fechaNacimiento;
    private String nombre;
    private String apellido;

    public Persona(Integer dni, LocalDate fechaNacimiento, String nombre, String apellido) {
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
