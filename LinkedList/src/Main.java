import java.util.*;

/* PRACTICA SET(HASH) Y LIST(ARR)
public class Main {
    public static void main(String[] args) {
        LinkedList<String> paises = new LinkedList<String>();
        paises.add("españa");
        paises.add("Argentina");
        paises.add("Brasil");
        paises.add("chile");
        paises.add("chile");

        System.out.println(paises);

        eliminarRepes(paises);
    }
    private static void eliminarRepes(LinkedList e) {

        Set <String> conjunto = new HashSet<String>(e);
        System.out.println(conjunto);
    }
}*/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stack<Character> stack = new Stack<Character>();
        String cad = "abb";
        System.out.println("ingrese letras a o b; c para finalizar");
        String letriña = scanner.next();
        while (letriña.charAt(0) != 'c') {

            stack.push(letriña.charAt(0));

            System.out.println("ingrese letras a o b; c para finalizar");
            letriña = scanner.next();

        }

        int i = 0;

        if (stack.size() > cad.length() || stack.size() < cad.length()) {
            System.out.println("Nao son iguales");
        } else {
            while (cad.charAt(i)-1 == stack.pop()) {
                i++;
            }
        }
        System.out.println(cad +" "+stack);
    }
    }
