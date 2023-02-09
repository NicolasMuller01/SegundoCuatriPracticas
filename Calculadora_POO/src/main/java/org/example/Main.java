package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Calculadora cal = new Calculadora();
//        cal.add(133,32);
//        Integer suma = Calcular.sumar(133,233);
//        System.out.println(suma);

        Scanner entrada = new Scanner(System.in);

        List<Persona> people = new ArrayList<>(5);
        int id;
        String name;
        int age;

        for (int i = 0; i < 2; i++) {
            id = entrada.nextInt();
            name = entrada.next();
            age = entrada.nextInt();
            Persona p = new Persona(id, name, age);
            people.add(p);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(people.get(i));
        }
    }
}