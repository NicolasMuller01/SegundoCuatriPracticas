package Unidad3Ejercicio6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        Name n1 = new Name("buan",'b',"muller");
        Name n2 = new Name("auan",'b',"muller");
        Person p1 = new Person(n1, "abogacia");
        Person p2 = new Person(n2, "m,edica");
        persons.add(p1);
        persons.add(p2);

        for (Person p : persons) {
            System.out.println(p);
        }

        Collections.sort(persons);

        for (Person p : persons) {
            System.out.println(p);
        }

    }
}
