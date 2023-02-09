package ExersiceSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Persona> listaPersonas = new HashSet<Persona>();
        listaPersonas.add(new Persona("juan",11,123341));
        listaPersonas.add(new Persona("juan",11,123341));
        listaPersonas.add(new Persona("pedro",21,13333341));

        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

    }
}
