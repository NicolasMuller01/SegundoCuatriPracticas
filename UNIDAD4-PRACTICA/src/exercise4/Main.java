package exercise4;

import java.util.*;

//ejercicio 4

public class Main {
    public static void main(String[] args) {
        LinkedList<Jugador>seleccion= new LinkedList<>();
        Jugador messi = new Jugador("messi", "V", 300, 100);
        Jugador aguero= new Jugador("aguero", "V", 200, 150);
        seleccion.add(messi);
        seleccion.add(aguero);

        LinkedList<Jugador>titulares= new LinkedList<>();
        LinkedList<Jugador>suplentes = new LinkedList<>();

        Iterator <Jugador> it =seleccion.iterator();

        while(it.hasNext()) {
            Jugador j = it.next();
            if(j.getGoals()/j.getGamesPlayed() >= 2.5){
                titulares.add(j);
            }
            else{
                suplentes.add(j);
            }
        }

        System.out.println(titulares);
        System.out.println(suplentes);
    }

}