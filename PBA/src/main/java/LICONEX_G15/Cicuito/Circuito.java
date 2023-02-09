package LICONEX_G15.Cicuito;

public class Circuito {
    private Integer tiempo;
    private Integer faltas;

    public Circuito(Integer tiempo, Integer faltas) {
        this.tiempo = tiempo;
        this.faltas = faltas;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public Integer getFaltas() {
        return faltas;
    }
}
