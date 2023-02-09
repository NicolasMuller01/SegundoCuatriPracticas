package Guia2.geometria;

public class GestionFigurasGeometricas {

    public static void main(String[] args) {
        
        //Alternativa 1
        Circulo c = new Circulo(44.55);
        Rectangulo r = new Rectangulo(30,40);
        Triangulo t = new Triangulo(50,70);
        
        System.out.println(c.toString() + " - Area: " + c.calcularArea());
        System.out.println(r.toString() + " - Area: " + r.calcularArea());
        System.out.println(t.toString() + " - Area: " + t.calcularArea());
        
        //Alternativa 2
        Figura figuras[] = new Figura[3];
        
        figuras[0] = new Circulo(12.45); //figuras[0] = c;
        figuras[1] = new Triangulo(9,7);
        figuras[2] = new Triangulo(10,15);
        
        mostrarFiguras(figuras);
        /*for(int i=0; i<figuras.length; i++)
            System.out.println(figuras[i].toString() + " - Area: " + figuras[i].calcularArea());
        */
    }
    
    public static void mostrarFiguras(Figura figuras[]) {
        for(int i=0; i<figuras.length; i++)
            System.out.println(figuras[i].toString() + " - Area: " + figuras[i].calcularArea());
    }
    
}
