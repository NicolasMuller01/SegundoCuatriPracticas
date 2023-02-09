package TestExersice1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Biblioteca {
    LinkedList<Libro>ColeccionDeLibros = new LinkedList<Libro>();
    LinkedList<Cliente>ColeccionDeClientes = new LinkedList<Cliente>();

    public Biblioteca(LinkedList<Libro> coleccionDeLibros, LinkedList<Cliente> coleccionDeClientes) {
        ColeccionDeLibros = coleccionDeLibros;
        ColeccionDeClientes = coleccionDeClientes;
    }
    public Biblioteca() {}

    public Libro prestarLibro(Integer ISBN){
        Iterator <Libro> coleccionDeLibrosIterator = ColeccionDeLibros.iterator();
        while(coleccionDeLibrosIterator.hasNext()){
            Libro libroAPrestar = coleccionDeLibrosIterator.next();
            if(libroAPrestar.getISBN() == ISBN){
                libroAPrestar.setLibroPrestado(true);
                return libroAPrestar;
            }
        }
        System.out.println("error");
        return null;
    }

    public void devolverLibro(Integer ISBN){
        Iterator <Libro> coleccionDeLibrosIterator = ColeccionDeLibros.iterator();
        while(coleccionDeLibrosIterator.hasNext()){
            Libro libroDevuelto = coleccionDeLibrosIterator.next();
            if(libroDevuelto.getISBN() == ISBN){
                libroDevuelto.setLibroPrestado(false);
            }
        }
    }


    public LinkedList<Libro> getColeccionDeLibros() {
        return ColeccionDeLibros;
    }

    public void setColeccionDeLibros(Libro libro) {
        ColeccionDeLibros.add(libro);
    }


    public LinkedList<Cliente> getColeccionDeClientes() {
        return ColeccionDeClientes;
    }

    public void setColeccionDeClientes(Cliente cliente) {
        ColeccionDeClientes.add(cliente);
    }
}
