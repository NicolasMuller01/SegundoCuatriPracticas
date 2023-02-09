package TestExersice1;

import java.util.LinkedList;

public abstract class Cliente {
    Integer dni;
    String apellido;
    String nombre;
    LinkedList<Libro> librosQueTomoPrestados = new LinkedList<Libro>();

    public Cliente(Integer dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Libro> getLibrosQueTomoPrestados() {
        return librosQueTomoPrestados;
    }

    public void setLibrosQueTomoPrestados(Libro libro) {
        librosQueTomoPrestados.add(libro);
    }
}
