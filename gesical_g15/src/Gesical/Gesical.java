package Gesical;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import Musico.*;
import jdk.swing.interop.SwingInterOpUtils;

public class Gesical {

    public static ArrayList<Musico> listaMusicos = new ArrayList<>();
    private static ArrayList<Disco> listaDiscos = new ArrayList<>();
    private static ArrayList<Cancion> listaCanciones = new ArrayList<>();
    public static void main(String[] args) {

    //LLENADO DE DATOS CASERO
    listaCanciones.add(new Cancion("tu turrito",100));
    listaCanciones.add(new Cancion("BZRP Duki",200));
    listaCanciones.add(new Cancion("Modo Diablo 2023",300));
    listaMusicos.add(new Solista("kpop",LocalDate.of(1111,11,11),"Leon mate","Leon","Agustin","Villaguayense",true));
    listaMusicos.add(new Solista("rock",LocalDate.of(2222,11,11),"Miche Aluminio","Micheloud","Santi","Entrerriano",true));
    listaMusicos.add(new Solista("cumbia",LocalDate.of(3333,11,11),"Bes Entretamer","Bes","Nicolas","Argentino",true));
    listaMusicos.add(new Solista("reggae",LocalDate.of(4444,11,11),"Morales YPF","Morales","Valen","Gamer",true));
    listaMusicos.add(new Solista("pop",LocalDate.of(5555,11,11),"Nico 2","Muller","Nico","Santafesino",true));
    listaDiscos.add(new Disco(listaMusicos.get(0),"moscas",LocalDate.of(1111,11,11),listaCanciones));
    listaDiscos.add(new Disco(listaMusicos.get(1),"mosquitos",LocalDate.of(2222,11,11),listaCanciones));
    listaDiscos.add(new Disco(listaMusicos.get(2),"quales",LocalDate.of(3333,11,11),listaCanciones));
    listaDiscos.add(new Disco(listaMusicos.get(3),"mercado libre",LocalDate.of(4444,11,11),listaCanciones));
    listaDiscos.add(new Disco(listaMusicos.get(4),"ahi vengo",LocalDate.of(5555,11,11),listaCanciones));
    
    // Empieza el menu principal
    mostrarMenuPrincipal();
    
    Scanner entrada = new Scanner(System.in);
    
    Integer opcion = entrada.nextInt();
    while (opcion != 9){
        switch (opcion) {
              case 1: listaMusicos.add(registrarSolista()); break;
              case 2: listaMusicos.add(registrarBandan()); break;
              case 3: listaCanciones.add(registrarCancion()); break;
              case 4: listaDiscos.add(registrarDisco()); break;
              case 5: registroMasivo();break;
              case 6: consultas(); break;
              default: System.out.println("Valor invalido, vuelva a ingresar un valor!"); break;
            }
            mostrarMenuPrincipal();
            opcion = entrada.nextInt();
        }
      System.out.println("Cerrando Aplicacion");
      System.out.println("Aplicacion cerrada");
    }

    //Opcion 5: Registor masivo
    private static void registroMasivo() {
        Scanner scanner = new Scanner(System.in);

        //coleccion de 10 SOLISTAS
        ArrayList<Solista> listaSolistaTemporales = new ArrayList<>();
        System.out.println("Ingrese 10 solistas: ");

        //bucle for que va llenando la lista de solistas
        for(int i=0; i<2;i++){
            System.out.println("Ingrese solista numero "+ (i+1) +" : ");
            listaSolistaTemporales.add(registrarSolista());
        }
        //bucle for que compara valores que ya integran la listas para que NO haya valores duplicados en el array
        for (Solista solista : listaSolistaTemporales){
            listaMusicos.add(solista);
        }
        //1 de 2 ingresos para la lista de bandas, con 2 integrantes de la lista solistas
        System.out.println("Para la banda 1 ingrese: ");
        listaMusicos.add(registroMasivoBandas(listaSolistaTemporales, 1));

        System.out.println(listaMusicos);
        
        //2 de 2 ingresos para la lista de bandas, con 3 integrantes de la lista solistas (diferentes a los del primer agregado de bandas)
        System.out.println("Para la banda 2 ingrese: ");
        listaMusicos.add(registroMasivoBandas(listaSolistaTemporales, 2));

        //bucle for que pide 10 canciones para ser ingresadas
        for (int i = 0; i <20;i++){
            System.out.println("Ingrese cancion numero "+(i+1)+": ");
            listaCanciones.add(registrarCancion());
        }
        //bucle for que pide 3 discos
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese disco numero" + (i+1) +  ": ");
            listaDiscos.add(registrarDisco());
        }
    }

    //Metodo para la opcion 5 que pide y agrega las canciones para definir a quien pertenece el disco
    private static Banda registroMasivoBandas(ArrayList<Solista> listaSolistaTemporales, Integer count){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese genero: ");
        String genero = scanner.nextLine();

        System.out.println("Ingrese el año, mes y dia de la fecha de lanzamiento: ");
        LocalDate anioLanzamiento = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

        System.out.println("Ingrese la discografia: ");
        String discografia = scanner.nextLine();

        System.out.println("Ingrese el titulo (Nombre de la banda): ");
        String titulo = scanner.nextLine();

        //Listas creada para validad la condicion de: "los solistas ingresados deben ser diferentes para cada banda."
        ArrayList<Solista> listaSolista = new ArrayList<Solista>();
        ArrayList<Solista> listaSolista2 = new ArrayList<Solista>();
        //condicionante para la banda 1 de 2
        if(count == 1) {
            Integer contador = 0;
            System.out.println("Seleccione 2 solistas de la Lista de solistas");
            for (Solista soli : listaSolistaTemporales) {
                System.out.println(soli);
            }
            do {
            System.out.println("Ingrese el nombre de algun solista de la lista: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido de algun solista de la lista: ");
            String apellido = scanner.nextLine();
                for (Solista solista : listaSolistaTemporales){
                    if(solista.getNombre().equals(nombre) && solista.getApellido().equals(apellido)){
                        listaSolista.add(solista);
                        contador++;
                    }
                }
                listaSolistaTemporales.remove(listaSolista.get(contador-1));
            }while (contador!=2);
            for (int i=0; i<8;i++){
                listaSolista.add(registrarSolista());
            }
        }
        //condicionante para la banda 2 de 2
        else if (count == 2){
            Integer contador = 0;
            System.out.println("Seleccione 3 solistas de la Lista de solistas");
            for (Solista soli : listaSolistaTemporales) {
                System.out.println(soli);
            }
            do {
                System.out.println("Ingrese el nombre de algun solista de la lista: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el apellido de algun solista de la lista: ");
                String apellido = scanner.nextLine();
                for (Solista solista : listaSolistaTemporales){
                    if(solista.getNombre().equals(nombre) && solista.getApellido().equals(apellido)){
                        listaSolista2.add(solista);
                        listaSolistaTemporales.remove(solista);
                        contador++;;
                    }
                    else {
                        System.out.println("Ese Solista no existe! Intente con otro.");
                    }
                }
                listaSolistaTemporales.remove(listaSolista.get(contador-1));
            }while (contador!=3);
            for (int i=0; i<7;i++){
                listaSolista.add(registrarSolista());
            }
        }
        //Se ingresan las 2 bandas a la lista
        Banda banda = new Banda(genero,anioLanzamiento,discografia,titulo,listaSolista);
        return banda;
    }
    
    //Opcion 4: Registrar disco
    private static Disco registrarDisco() {
        Scanner scanner = new Scanner(System.in);
        //Valores necesario de la clase Disco
        System.out.println("Ingrese el año, mes y dia de la fecha de año de edicion: ");
        LocalDate anioEdicion = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        
        System.out.println("Ingrese el titulo (Nombre de la banda): ");
        String titulo = scanner.nextLine();
        
        ArrayList<Cancion> ListaCanciones = new ArrayList<Cancion>();

        System.out.println("Ingrese la cantidad de canciones a agregar: ");
        Integer cantidad = scanner.nextInt();
        for (int i = 0; i < cantidad;i++){
            ListaCanciones.add(registrarCancion());
        }

        System.out.println("El musico ingresado es una banda o un solista? (banda o solista): ");
        String tipoMusico = scanner.nextLine();

        if(tipoMusico.equals("banda")){
            Disco disco = new Disco(registrarBandan(),titulo,anioEdicion,ListaCanciones);
            return disco;
        }
        else {
            Disco disco = new Disco(registrarSolista(),titulo,anioEdicion,ListaCanciones);
            return disco;
        }
    }
    
    //Opcion 3: Registrar cancion
    private static Cancion registrarCancion() {
        Scanner scanner = new Scanner(System.in);
        //Valores necesario de la clase Cancion
        System.out.println("Ingrese el nombre de la cancion: ");
        String nombreCancion = scanner.nextLine();
        Integer duracion = scanner.nextInt();

        Cancion cancion = new Cancion(nombreCancion,duracion);

        return cancion;
    }
    
    //Opcion 2: Registra banda
    private static Banda registrarBandan() {
        Scanner scanner = new Scanner(System.in);
        //Valores necesario de la clase Banda
        System.out.println("Ingrese genero: ");
        String genero = scanner.nextLine();

        System.out.println("Ingrese el año, mes y dia del año de lanzamiento: ");
        LocalDate anioLanzamiento = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

        System.out.println("Ingrese la discografia: ");
        String discografia = scanner.nextLine();

        System.out.println("Ingrese el titulo (Nombre de la banda): ");
        String titulo = scanner.nextLine();

        ArrayList<Solista> listaSolista = new ArrayList<Solista>();

        System.out.println("Ingrese la cantidad de solistas a agregar: ");
        Integer cantidad = scanner.nextInt();
        for (int i = 0; i < cantidad;i++){
            listaSolista.add(registrarSolista());
        }

        Banda banda = new Banda(genero,anioLanzamiento, discografia,titulo,listaSolista);

        return banda;
    }

    //Opcion 1: Registrar solista
    private static Solista registrarSolista() {
        Scanner scanner = new Scanner(System.in);
        //Valores necesarios para la clase Solista
        System.out.println("Ingrese genero: ");
        String genero = scanner.nextLine();

        System.out.println("Ingrese el año, mes y dia del año de lanzamiento: ");
        LocalDate anioLanzamiento = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        scanner.nextLine();

        System.out.println("Ingrese la discografia: ");
        String discografia = scanner.nextLine();

        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.println("El solista toca algun instrumento? (true o false): ");
        Boolean tocaAlgunInstrumento = scanner.nextBoolean();

        //Guarda los valores de solista
        Solista solista = new Solista(genero, anioLanzamiento, discografia, apellido, nombre, nacionalidad, tocaAlgunInstrumento);

        return solista;
    }
    
    //Mostrar menu principal con las opciones
    public static void mostrarMenuPrincipal(){
        System.out.println("Menu Principal");
        System.out.println("================================================================");
        System.out.println("1) Registrar Solista");
        System.out.println("2) Registrar Banda");
        System.out.println("3) Registrar Cancion");
        System.out.println("4) Registrar Disco");
        System.out.println("5) Registro Masivos");
        System.out.println("6) Consultas");
        System.out.println(" ");
        System.out.println("9) Cerrar Aplicacion");
        System.out.println(" ");

        System.out.println("Selecciona una Opcion: ");
    }

    //Opcion 6: mostrar consultas
    private static void consultas() {
        mostrarConsultas();
        Scanner entrada = new Scanner(System.in);
        char opcion = entrada.next().charAt(0);
        while (opcion != 'i'){
            switch (opcion) {
                case 'a': duracionDeDiscos(); break;
                case 'b': generoMusicalPlaylist(); break;
                case 'c': borrarDiscoPorAnioEdicion(); break;
                case 'd': listarDiscoPorBanda(); break;
                case 'z': mostrarMenuPrincipal(); break;
                default: System.out.println("Valor invalido"); break;
            }
            mostrarConsultas();
            opcion = entrada.next().charAt(0);
        }
        System.out.println("Cerrando Aplicacion");
        System.out.println("Aplicacion cerrada");
    }

    //Mostrar mesnu secundario/consultas con las opciones
    private static void mostrarConsultas() {
        System.out.println("Consultas");
        System.out.println("================================================================");
        System.out.println("a) Discos que duran mas de X segundos");
        System.out.println("b) Playlist por genero musical");
        System.out.println("c) Borrar discos segun año de edicion");
        System.out.println("d) Listar discos por banda");
        System.out.println(" ");
        System.out.println("z) Volver al menu anterior");
        System.out.println(" ");
        System.out.println("Selecciona una Opcion: ");
    }

    //Opcion a: disco que duran mas de X segundos
    private static void duracionDeDiscos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la duracion en segundos que dura: ");
        Integer duracion = scanner.nextInt();
        for(Disco disco: listaDiscos){
           int duracionDisco = 0;
           for(Cancion cancion : disco.getListaCanciones()){
               duracionDisco = duracionDisco+cancion.getDuracion();
           }
           if(duracionDisco > duracion){
               System.out.println("Titulo: " + disco.getTitulo() +"\n"+ "Musico: " + disco.getMusico().toString());
           }
        }
    }

    //Opcion b: Playlist por genero musical 
    private static void generoMusicalPlaylist() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese o seleccione un genero: ");
        System.out.println("1) kpop");
        System.out.println("2) cumbia");
        System.out.println("3) rock");
        System.out.println("4) reggae");
        System.out.println("/n" + "5) Volver al menu principal ");
        int opcion = entrada.nextInt();
        while (opcion != 9){
            switch (opcion) {
                case 1: mostrarPlaylistPorGenero("kpop"); break;
                case 2: mostrarPlaylistPorGenero("cumbia"); break;
                case 3: mostrarPlaylistPorGenero("rock"); break;
                case 4: mostrarPlaylistPorGenero("reggae"); break;
                case 5: mostrarMenuPrincipal(); break;
                default: System.out.println("Valor invalido"); break;
            }
            mostrarConsultas();
            opcion = entrada.nextInt();
        }
    }
    private static void mostrarPlaylistPorGenero(String genero) {
        for(Disco disco: listaDiscos){
            if(disco.getMusico().getGenero()== genero){
                System.out.println("Disco: "+disco.getTitulo() +"\n"+ "Musico: " + disco.getMusico().toString());
                for(Cancion cancion : disco.getListaCanciones()) {
                    System.out.println("Canciones: " + cancion.getNombreCancion());
                }
            }
        }
    }

    //Opcion c: Borrar disco por año de edicion 
    private static void borrarDiscoPorAnioEdicion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el año del disco que quiere borrar: ");
        int anio = entrada.nextInt();
        listaDiscos.removeIf(disco -> disco.getAnioEdicion().getYear() == anio);
    }

    //Opcion d: Listar disco por banda
    private static void listarDiscoPorBanda() {
        Scanner entrada = new Scanner(System.in);
        listaMusicos.forEach((musico) -> {
            System.out.println(listaMusicos.indexOf(musico)+1 + " " + musico.getNombre());
        });
        System.out.println("Seleccione una banda de la lista: ");
        Musico musico = listaMusicos.get(entrada.nextInt()-1);
        for(Disco disco : listaDiscos) {
            if(disco.getMusico() == musico) {
                System.out.println(disco.toString());
            }
        }
    }
}