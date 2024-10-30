
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double CPU, teclado, raton, pantalla;
        
        System.out.print("Costo del CPU:");
        CPU = entrada.nextDouble();
        
        System.out.print("Costo del teclado:");
        teclado = entrada.nextDouble();
        
        System.out.print("Costo del raton:");
        raton = entrada.nextDouble();
        
        System.out.print("Costo de la pantalla:");
        pantalla = entrada.nextDouble();
        
        double total;
        total = CPU + teclado + raton + pantalla;
        
        System.out.println("total = " + total);
        
    }
    
}
