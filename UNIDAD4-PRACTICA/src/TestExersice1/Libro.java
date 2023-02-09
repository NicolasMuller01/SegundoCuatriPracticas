package TestExersice1;

public class Libro {
    Integer ISBN;
    String titulo;
    Boolean libroPrestado;
    Integer capitulos;

    public Libro(Integer ISBN, String titulo, Integer capitulos) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.libroPrestado = false;
        this.capitulos = capitulos;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Boolean libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public Integer getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Integer capitulos) {
        this.capitulos = capitulos;
    }
}
