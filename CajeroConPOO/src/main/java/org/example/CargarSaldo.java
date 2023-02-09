package org.example;

import java.util.Scanner;

public class CargarSaldo extends Cajero_absc{
        @Override
        public void operaciones(){
            System.out.println("Ingrese monto a depositar");
            Scanner entrada = new Scanner(System.in);
            Integer saldoAIngresar = entrada.nextInt();
            Integer saldoActual = getSaldo();
            setSaldo( (saldoActual + saldoAIngresar));
            System.out.println("--------------------------------");
            System.out.println("Su saldo es: "+ getSaldo());
            System.out.println("--------------------------------");
        }
}
