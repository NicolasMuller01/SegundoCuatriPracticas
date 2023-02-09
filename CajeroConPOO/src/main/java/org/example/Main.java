package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        interfaz();
        Integer valor = entrada.nextInt();
        while(valor >=1 && valor <=3){
            switch (valor){
                case 1: Cajero_absc retirar = new RetirarSaldo();
                        retirar.operaciones(); ;
                        break;
                case 2: Cajero_absc depositar = new CargarSaldo();
                        depositar.operaciones(); ;
                        break;
                case 3: ;
                        break;
            }

            interfaz();
            valor = entrada.nextInt();
        }
    }

    public static void interfaz(){
        System.out.println("--------------------------------");
        System.out.println("OPERACIONES");
        System.out.println("1 - Retirar Dinero");
        System.out.println("2 - Ingresar Dinero");
        System.out.println("3 - Salir");
        System.out.println("--------------------------------");
    }
}

