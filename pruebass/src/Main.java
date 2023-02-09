import java.util.ArrayList;
import java.util.*;
import java.util.List;

//EJE1
//public class Main {
//    public static void main(String[] args) {
//        List <Integer> list = new ArrayList<Integer>();
//        list.add(10);
//        list.add(20);
//        System.out.println("la lista es" + list);
//    }
//}


//eje2
//public class Main {
//   public static void main(String[] args) {
//       Deque<Integer> cola = new ArrayDeque<Integer>();
//       cola.push(1);
//       cola.push(2);
//       cola.push(3);
//       cola.poll();
//       System.out.println(cola);
//   }
//}

//class Color{
//    int red, green, blue;
//    void Color(){
//        red = 10;
//        green = 10;
//        blue = 10;
//    }
//    void printColor(){
//        System.out.println("red: " + red + " green: " + green + " blue: "+blue );
//    }
//}
//
//public class Main {
//   public static void main(String[] args) {
//     Color color = new Color();
//     color.printColor();
//   }
//}

//eje4
class Base{
    public Base() {
        System.out.println("Base");
    }
}

class Derived extends Base{
    public Derived() {
        System.out.println("Derived");
    }
}

class deriDerived extends Derived{
    public deriDerived() {
        System.out.println("deriDerived");
    }
}

public class Main {
   public static void main(String[] args) {
        Derived b = new deriDerived();
   }
}