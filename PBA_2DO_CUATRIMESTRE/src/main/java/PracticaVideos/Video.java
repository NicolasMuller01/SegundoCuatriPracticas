package PracticaVideos;

import java.util.Objects;

public abstract class Video {
    protected String titulo;
    protected String genero;
    protected Integer duracion;
    protected Boolean visto;

    public Video(){};

    public Video(String titulo, String genero, Integer duracion, Boolean visto) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.visto = visto;
    }


    //    public abstract Video mayorDuracion();
}
