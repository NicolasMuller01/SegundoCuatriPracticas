import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public Biblioteca() {
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void prestarLibros(Integer ISBN,String numeroLegajo){
        Libro libroARetornar;
        for(Cliente clientess : listaClientes){
               for(Libro libros : clientess.getListaLibrosTomoPrestados()){
                   if(libros.getCodigoISBN().equals(ISBN)){
                       libros.setEstado(false);
                       listaLibros.add(libros);
               }
            }
        }
    }
}
