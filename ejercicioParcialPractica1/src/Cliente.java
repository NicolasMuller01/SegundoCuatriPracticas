import java.util.ArrayList;

public abstract class Cliente {
    Integer dni;
    String apellido;
    String nombre;
    ArrayList<Libro> listaLibrosTomoPrestados = new ArrayList<>();

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

    public ArrayList<Libro> getListaLibrosTomoPrestados() {
        return listaLibrosTomoPrestados;
    }

    public void setListaLibrosTomoPrestados(ArrayList<Libro> listaLibrosTomoPrestados) {
        this.listaLibrosTomoPrestados = listaLibrosTomoPrestados;
    }
}
