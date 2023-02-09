package Guia1.Ejercicio4;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        System.out.println("Ingrese tamaño del array");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        Password [] arr = new Password[n];

        int contador=0;

        while (contador < n) {

                System.out.println("Ingrese una contraseña de minimo 8 caracteres");
                String contraseña = entrada.next();

                while(!tamañoMinimo(contraseña)){
                    System.out.println("contraseña invalida");
                    System.out.println("Ingrese una contraseña de minimo 8 caracteres");
                    contraseña = entrada.next();
                }
            Password contra = new Password(contraseña);
            arr[contador] = contra;
            if (contra.esFuerte()){
                System.out.println("Es fuerte");
            }
            else{
                System.out.println("no es fuerte");
            }
            contador++;
        }
    }
    public static boolean tamañoMinimo(String contraseña){
        return contraseña.length() >= 8 ? true : false;
    }

}
