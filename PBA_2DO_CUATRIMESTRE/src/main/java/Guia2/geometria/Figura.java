package Guia2.geometria;


public abstract class Figura {
    private String color;
    private Integer grosorLinea;
    public abstract double calcularArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getGrosorLinea() {
        return grosorLinea;
    }

    public void setGrosorLinea(Integer grosorLinea) {
        this.grosorLinea = grosorLinea;
    }
}
