
package LICONEX_G15.examen;

import LICONEX_G15.Cicuito.Circuito;
import LICONEX_G15.Persona.Persona;
import LICONEX_G15.vehiculos.Auto;
import java.time.LocalDate;
import java.util.Scanner;

public class ExamenAuto extends Examen{
    private Auto auto;
    private Persona persona;
    private Circuito circuito;

    public ExamenAuto(Auto auto,Persona persona, LocalDate fecha) {
        super(fecha);
        this.auto = auto;
        this.persona = persona;
    }
    @Override
    public boolean realizoCircuitos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas faltas realizo en total: ");
        Integer faltas = entrada.nextInt();
        System.out.println("Cuanto fue el tiempo en la primera vuelta: ");
        Integer tiempo = entrada.nextInt();
        System.out.println(" ");

        circuito = new Circuito(faltas, tiempo);

        if (circuito.getTiempo() < 30 && circuito.getFaltas() < 3) {
            this.aprobado = true;
            return true;
        }
        this.aprobado = false;
        return false;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    @Override
    public String toString() {
        return "Examen Auto{" +  "Detalles del Auto " +"Marca: "+ auto.getMarca() +"Patente: "+ auto.getPatente() + "Cilindrada: "+ auto.getCilindrada()+ "Cantiad de puertas: "+ auto.getCantidadPuertas() + "fecha=" + fecha + "DNI:" + persona.getDni() + "fecha nacimiento:" + persona.getFechaNacimiento() + "nombre:" + persona.getNombre() + "apellido:" + persona.getApellido() + "faltas circuito 1: "+circuito.getFaltas()+"tiempo circuito 1: "+circuito.getTiempo()+"aprobo: "+aprobado+ " " + '}';
    }

    public Persona getPersona() {
        return persona;
    }
}
