package exercise4;

public class Jugador {
    String name;
    String prosition;
    Integer goals;
    Integer gamesPlayed;

    public Jugador(String name, String prosition, Integer goals, Integer gamesPlayed) {
        this.name = name;
        this.prosition = prosition;
        this.goals = goals;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProsition() {
        return prosition;
    }

    public void setProsition(String prosition) {
        this.prosition = prosition;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "name='" + name + '\'' +
                ", prosition='" + prosition + '\'' +
                ", goals=" + goals +
                ", gamesPlayed=" + gamesPlayed +
                '}';
    }
}
