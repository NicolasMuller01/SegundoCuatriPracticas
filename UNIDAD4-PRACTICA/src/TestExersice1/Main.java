package TestExersice1;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Alumno alumno1 = new Alumno(4332221, "muller","nico", "das123");
        Libro libro1 = new Libro(1, "aarbol",121);
        Libro libro2 = new Libro(2, "espejo",12321);
        biblioteca.setColeccionDeLibros(libro1);
        biblioteca.setColeccionDeLibros(libro2);

        alumno1.setLibrosQueTomoPrestados(biblioteca.prestarLibro(1));
        biblioteca.devolverLibro(1);

        for (Libro l : biblioteca.getColeccionDeLibros()){
            System.out.println(l.getTitulo() + l.getLibroPrestado());
        }

    }
}
