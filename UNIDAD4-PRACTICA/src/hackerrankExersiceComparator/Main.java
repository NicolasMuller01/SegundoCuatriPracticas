package hackerrankExersiceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Player> lista = new ArrayList<>();
        Player p1 = new Player("juan",22);
        Player p2 = new Player("auan",22);
        Player p3 = new Player("buan",20);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (Player p : lista) {
            System.out.println(p);
        }

        Collections.sort(lista);

        for (Player p : lista) {
            System.out.println(p);
        }

    }
}

class Player implements Comparable<Player> {
    String name;
    Integer score;

    Player(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public int compareTo(Player o) {
        if((o.getScore() - this.score) == 0){
            return this.name.compareTo(o.getName());
       }else{
            return o.getScore() - this.score;
        }
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

