package PracticaVideos;

public class Series extends Video{
    private Integer temporadas;

    public Series(String titulo, String genero, Integer duracion, Boolean visto, Integer temporadas) {
        super(titulo, genero, duracion, visto);
        this.temporadas = temporadas;
    }

//    @Override
//    public Video mayorDuracion(){};


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return temporadas.equals(series.temporadas);
    }


    @Override
    public String toString() {
        return "Series{" +
                "temporadas=" + temporadas +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", visto=" + visto +
                '}';
    }
}
