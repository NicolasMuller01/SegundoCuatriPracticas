public class Libro {
    Integer codigoISBN;
    String titulo;
    Boolean estado;
    Integer cantidadCapitulos;

    public Libro(Integer codigoISBN, String titulo, Integer cantidadCapitulos) {
        this.codigoISBN = codigoISBN;
        this.titulo = titulo;
        this.estado = false;
        this.cantidadCapitulos = cantidadCapitulos;
    }

    public Integer getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(Integer codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getCantidadCapitulos() {
        return cantidadCapitulos;
    }

    public void setCantidadCapitulos(Integer cantidadCapitulos) {
        this.cantidadCapitulos = cantidadCapitulos;
    }

}
