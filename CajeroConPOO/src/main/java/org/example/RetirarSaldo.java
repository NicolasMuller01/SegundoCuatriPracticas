package org.example;

import java.util.Scanner;

public class RetirarSaldo extends Cajero_absc{
    @Override
    public void operaciones(){
        System.out.println("Ingrese saldo a retirar");
        Scanner entrada = new Scanner(System.in);
        Integer saldoRetirar = entrada.nextInt();
        Integer saldoActual = getSaldo();
        if(saldoRetirar < saldoActual){
            setSaldo(saldoActual - saldoRetirar);
            System.out.println("--------------------------------");
            System.out.println("Su saldo es: "+ getSaldo());
            System.out.println("--------------------------------");
        }
        else{
            System.out.println("--------------------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("--------------------------------");
        }
    };
}
