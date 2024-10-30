import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double L, cateto, area;
        
        System.out.print("Escriba el lado del cuadrado:");
        L = entrada.nextDouble();
        
        System.out.print("Escriba el cateto del triangulo:");
        cateto = entrada.nextDouble();
        
        area = (((L*cateto)/2)*3) + (L*L) + (L*cateto);
        
        System.out.println("area = " + area);
        
        
    }
    
}
