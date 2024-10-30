
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double b;
        double h;
        
        System.out.print("Escriba la base:");
        b = entrada.nextDouble();
        
        System.out.print("Escriba la altura:");
        h = entrada.nextDouble();
        
        double area;
        
        area = ( b * h )/2;
        
        System.out.println("area = " + area);
                
                
        
        
                
    }

}
