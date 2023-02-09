package PracticaVideos;

import java.util.Objects;

public class Peliculas extends Video {

    private Integer anio;

    public Peliculas(String titulo, String genero, Integer duracion, Boolean visto, Integer anio) {
        super(titulo, genero, duracion, visto);
        this.anio = anio;
    }

//    @Override
//    public Video mayorDuracion(){};

    @Override
    public int hashCode() {
        return Objects.hash(anio);
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "anio=" + anio +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", visto=" + visto +
                '}';
    }
}
