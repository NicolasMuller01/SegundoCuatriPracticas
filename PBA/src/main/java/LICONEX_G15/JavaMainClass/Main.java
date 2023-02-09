package LICONEX_G15.JavaMainClass;
import java.util.Arrays;

import LICONEX_G15.Persona.Persona;
import LICONEX_G15.examen.Examen;
import LICONEX_G15.examen.ExamenAuto;
import LICONEX_G15.examen.ExamenMoto;
import LICONEX_G15.vehiculos.Auto;
import LICONEX_G15.vehiculos.Moto;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
        Scanner entrada = new Scanner(System.in);
        Integer opcion = entrada.nextInt();
        Examen[] examenArr = new Examen[100];
        Integer contador = 0;
        while (opcion !=9) {
            switch (opcion) {
                case 1:
                    examenArr[contador] = registrarExamenMoto();
                    contador++;
                    break;
                case 2:
                    examenArr[contador] = registrarExamenAuto();
                    System.out.println(examenArr[contador].getClass());
                    contador++;
                    break;
                case 3:
                    Consultas(examenArr, contador);
                    break;
            }
            menuPrincipal();
            opcion = entrada.nextInt();
        }
        System.out.println("Cerrando programa...");
        System.out.println("....................");
        System.out.println("Cerrado");
    }

    private static Examen registrarExamenMoto() {
        //datos del conductor
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar año, mes, dia del examen: (Primero año, luego enter, luego mes, luego enter, luego dia, luego enter) ");
        LocalDate fecha = LocalDate.of(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
        entrada.nextLine();
        System.out.println("Ingrese DNI (Ejemplo: 43378154)");
        Integer dni = entrada.nextInt();
        System.out.println("Ingresar fecha de nacimiento, año, mes, dia: (Primero año, luego enter, luego mes, luego enter, luego dia, luego enter) ");
        LocalDate fechaNacimiento = LocalDate.of(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
        entrada.nextLine();
        System.out.println("Ingrese nombre (Ejemplo: Juan)");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese apellido (Ejemplo: Muller)");
        String apellido = entrada.nextLine();
        //datos de la moto
        System.out.println("Ingrese patente (Ejemplo: ABC123)");
        String patente = entrada.nextLine();
        System.out.println("Ingrese marca (Ejemplo: Toyota)");
        String marca = entrada.nextLine();
        System.out.println("Ingrese Cilindrada (Ejemplo: 250cc)");
        String cilindrada = entrada.nextLine();
        System.out.println("¿llevaTodosLosEspejos? (True o false)");
        Boolean llevaTodosLosEspejos = entrada.nextBoolean();
        System.out.println("");
        Moto moto = new Moto(patente,marca,cilindrada,llevaTodosLosEspejos);
        Persona persona = new Persona(dni,fechaNacimiento,nombre,apellido);
        ExamenMoto examenMoto = new ExamenMoto(moto,persona,fecha);
        examenMoto.realizoCircuitos();
        return examenMoto;
    }

    private static Examen registrarExamenAuto(){
        //datos del conductor
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar año, mes, dia del examen: (Primero año, luego enter, luego mes, luego enter, luego dia, luego enter) ");
        LocalDate fecha = LocalDate.of(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
        entrada.nextLine();
        System.out.println("Ingrese DNI (Ejemplo: 43378154)");
        Integer dni = entrada.nextInt();
        System.out.println("Ingresar fecha de nacimiento, año, mes, dia: (Primero año, luego enter, luego mes, luego enter, luego dia, luego enter) ");
        LocalDate fechaNacimiento = LocalDate.of(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
        entrada.nextLine();
        System.out.println("Ingrese nombre (Ejemplo: Juan)");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese apellido (Ejemplo: Muller)");
        String apellido = entrada.nextLine();
        //datos del auto
        System.out.println("Ingrese patente (Ejemplo: ABC123)");
        String patente = entrada.nextLine();
        System.out.println("Ingrese marca (Ejemplo: Toyota)");
        String marca = entrada.nextLine();
        System.out.println("Ingrese Cilindrada (Ejemplo: 250cc)");
        String cilindrada = entrada.nextLine();
        System.out.println("ingrese cantidad Puertas (Ejemplo: 4)");
        Integer cantidadPuertas = entrada.nextInt();
        System.out.println("");
        Persona persona = new Persona(dni,fechaNacimiento,nombre,apellido);
        Auto auto = new Auto(patente, marca, cilindrada, cantidadPuertas);
        ExamenAuto examenAuto = new ExamenAuto(auto,persona,fecha);
        examenAuto.realizoCircuitos();
        return examenAuto;
    }

    private static void Consultas(Examen[] examenArr, Integer contador) {
            consultasMenu();
            Scanner entrada = new Scanner(System.in);
            Integer opcion = entrada.nextInt();
            while(opcion != 9) {
                switch (opcion) {
                    case 1:
                        visualizarPorDNI(examenArr,contador);
                        break;
                    case 2:
                        visualizarPorFechaMoto(examenArr,contador);
                        break;
                    case 3:
                        visualizarPorFechaAuto(examenArr,contador);
                        break;
                    case 4:
                        topMenosFaltas(examenArr,contador);
                        break;
                }
                consultasMenu();
                opcion =  entrada.nextInt();
            }
    }

    private static void topMenosFaltas(Examen[] examenArr, Integer contador) {
        Integer [] top = new Integer[contador];
        Integer [] topDni = new Integer[contador];

        for (int i = 0; i < contador; i++) {
            if(examenArr[i].getClass().equals(ExamenAuto.class)){
                ExamenAuto examenAuto = (ExamenAuto)examenArr[i];
                top[i] =  examenAuto.getCircuito().getFaltas();
                topDni[i] = examenAuto.getPersona().getDni();
            }
            else{
                ExamenMoto examenMoto= (ExamenMoto)examenArr[i];
                top[i] =  examenMoto.getArrCircuitoMoto()[0].getFaltas() + examenMoto.getArrCircuitoMoto()[1].getFaltas();
                topDni[i] = examenMoto.getPersona().getDni();
            }
        }

        Arrays.sort(top);
        for(Integer i = 0; i<contador; i++) {
            System.out.println("TOP " + (i+1));
            System.out.println("DNI: " + topDni[i] + "Cantidad de faltas: " + top[i]);
            System.out.println("======================================================");
        }
         System.out.println(" ");
        }

    private static void visualizarPorFechaAuto(Examen[] examenArr, Integer contador) {
        System.out.println("Ingrese fecha de examen: (año, mes,dia)");
        Scanner entrada = new Scanner(System.in);
        LocalDate fechaExamen = LocalDate.of(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
        for(int i = 0; i < contador; i++) {
            if(examenArr[i].getFecha().equals(fechaExamen) && examenArr[i].getClass().equals(ExamenAuto.class)){
                System.out.println("Examen encontrado");
                System.out.println(" ");
                ExamenAuto dni = (ExamenAuto) examenArr[i];
                System.out.println("DNI" + dni.getPersona().getDni());
                System.out.println("¿Aprobo el examen?: " + examenArr[i].getAprobado());
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
    private static void visualizarPorFechaMoto(Examen[] examenArr, Integer contador) {
        System.out.println("Ingrese fecha de examen: (año, mes,dia)");
        Scanner entrada = new Scanner(System.in);
        LocalDate fechaExamen = LocalDate.of(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
        for(int i = 0; i < contador; i++) {
            if(examenArr[i].getFecha().equals(fechaExamen) && examenArr[i].getClass().equals(ExamenMoto.class)){
                System.out.println("Examen encontrado");
                System.out.println(" ");
                ExamenMoto moto = (ExamenMoto)examenArr[i];
                System.out.println("DNI" + moto.getPersona().getDni());
                System.out.println("¿Aprobo el examen?: " + examenArr[i].getAprobado());
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
    private static void visualizarPorDNI(Examen[] examenArr, Integer contador) {
        System.out.println("ingrese DNI");
        Scanner entrada = new Scanner(System.in);
        Integer DNI = entrada.nextInt();
        Boolean noEncontrado = true;

        for(int i = 0; i < contador; i++) {

            if(examenArr[i].getClass().equals(ExamenMoto.class)){
                ExamenMoto dniClaseMoto = (ExamenMoto)examenArr[i];
                if(dniClaseMoto.getPersona().getDni().equals(DNI)){
                    System.out.println("Examen por DNI de moto encontrado:" +'\n'+"Nombre:" + dniClaseMoto.getPersona().getNombre() +'\n'+ "Apellido:" + dniClaseMoto.getPersona().getApellido() +'\n'+"DNI:" + dniClaseMoto.getPersona().getDni() +'\n'+"Tiempo primer circuito: "+dniClaseMoto.getArrCircuitoMoto()[0].getTiempo()+'\n'+ "Faltas primer circuito: "+dniClaseMoto.getArrCircuitoMoto()[0].getFaltas()+'\n'+"Tiempo segundo circuito: "+dniClaseMoto.getArrCircuitoMoto()[1].getTiempo()+'\n'+ "Faltas segundo circuito: "+dniClaseMoto.getArrCircuitoMoto()[1].getFaltas()+'\n'+"Aprobo: "+ examenArr[i].getAprobado());
                    System.out.println(" ");
                    noEncontrado = false;
                }
            } 
            if(examenArr[i].getClass().equals(ExamenAuto.class)){
                ExamenAuto dniClaseAuto = (ExamenAuto)examenArr[i];
                if(dniClaseAuto.getPersona().getDni().equals(DNI)){
                    System.out.println("Examen por DNI de moto encontrado:" +'\n'+"Nombre:" + dniClaseAuto.getPersona().getNombre() +'\n'+ "Apellido:" + dniClaseAuto.getPersona().getApellido() +'\n'+"DNI:" + dniClaseAuto.getPersona().getDni() +'\n'+"Tiempo primer circuito: "+dniClaseAuto.getCircuito().getTiempo()+'\n'+ "Faltas primer circuito: "+dniClaseAuto.getCircuito().getFaltas()+'\n'+"Aprobo: "+ examenArr[i].getAprobado());
                    System.out.println(" ");
                    noEncontrado = false;
                }
            }
            if(noEncontrado){
                System.out.println("Ninguna persona con el DNI ingresado ha rendido examen alguno en Villa Pehuenia");
            }
        }
        System.out.println(" ");
    }

    
    //Interfaces graficas (MENUS)
    //Menu principal
    private static void menuPrincipal(){
        System.out.println("LICENCIAS DE CONDUCIR");
        System.out.println("Menu Principal");
        System.out.println("===============================");
        System.out.println("1_ Registrar examen moto");
        System.out.println("2_ Registrar examen Auto");
        System.out.println("3_ Consultas");
        System.out.println(" ");
        System.out.println("9_ Cerrar aplicacion");
        System.out.println(" ");
        System.out.println("===============================");
        System.out.print("Ingrese una opcion: ");
        System.out.println(" ");
    }
    //menu consultas
    private static void consultasMenu(){
        System.out.println("LICENCIAS DE CONDUCIR");
        System.out.println("Menu Consultas");
        System.out.println("===============================");
        System.out.println("1_ Examen de conducir por DNI");
        System.out.println("2_ Examenes de moto por fecha");
        System.out.println("3_ Examenes de auto por fecha");
        System.out.println("4_ Top faltas por DNI");
        System.out.println(" ");
        System.out.println("9_ volver al menu principal");
        System.out.println("===============================");
        System.out.print("Ingrese una opcion: ");
        System.out.println(" ");
    }
}

