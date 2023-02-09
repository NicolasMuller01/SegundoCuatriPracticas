
package LICONEX_G15.examen;

import LICONEX_G15.Cicuito.Circuito;
import LICONEX_G15.Persona.Persona;
import LICONEX_G15.vehiculos.Moto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ExamenMoto extends Examen {
    private Moto moto;
    private Persona persona;
    private Circuito arrCircuitoMoto [] = new Circuito[2];


    public ExamenMoto(Moto moto,Persona persona, LocalDate fecha) {
        super(fecha);
        this.moto = moto;
        this.persona = persona;
    }
    @Override
     public String toString() {
        return "Examen Moto{" +'\n'+ "Detalles de la Moto: " +"Marca: "+ moto.getMarca() +"Patente: "+ moto.getPatente() + "Cilindrada: "+ moto.getCilindrada() + "Lleva todos los espejos: "+moto.getLlevaTodosLosEspejos() +'\n'+ "Datos del conductor:" + '\n' +"Fecha=" + fecha +'\n'+ "DNI:" + persona.getDni() +'\n'+ "Fecha nacimiento:" + persona.getFechaNacimiento() +'\n'+ "Nombre:" + persona.getNombre() +'\n'+ "Apellido:" + persona.getApellido() +'\n'+ "Faltas del circuito 1: "+arrCircuitoMoto[0].getFaltas()+'\n'+"Tiempo del circuito 1: "+arrCircuitoMoto[0].getTiempo()+ '\n'+ "Faltas del circuito 2: "+arrCircuitoMoto[1].getFaltas()+'\n'+"Tiempo del circuito 2: "+arrCircuitoMoto[1].getTiempo()+'\n'+"Aprobo: "+aprobado+ '}';
    }

    @Override
    public boolean realizoCircuitos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas faltas realizo en la 1ra vuelta: ");
        Integer faltas = entrada.nextInt();
        System.out.println("Cuanto fue el tiempo en la 1ra vuelta: ");
        Integer tiempo = entrada.nextInt();

        arrCircuitoMoto[0] = new Circuito(faltas, tiempo);

        System.out.println("Cuantas faltas realizo en la 2da vuelta: ");
        faltas = entrada.nextInt();
        System.out.println("Cuanto fue el tiempo en la 2da vuelta: ");
        tiempo = entrada.nextInt();

        arrCircuitoMoto[1] = new Circuito(faltas, tiempo);

        if (((arrCircuitoMoto[0].getTiempo() + arrCircuitoMoto[1].getTiempo())/2) <= 20 && ((arrCircuitoMoto[0].getFaltas() + arrCircuitoMoto[1].getFaltas())/2) < 5) {
            this.aprobado = true;
            return true;
        }
        this.aprobado = false;
        return false;
    }

    public Moto getMoto() {
        return moto;
    }

    public Circuito[] getArrCircuitoMoto() {
        return arrCircuitoMoto;
    }

    public Persona getPersona() {
        return persona;
    }
}
