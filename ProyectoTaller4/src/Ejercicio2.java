
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double gasto1, gasto2, gasto3;
        
        System.out.print("Escriba el gasto del primer hijo:");
        gasto1 = entrada.nextDouble();
        
        System.out.print("Escriba el gasto del segundo hijo:");
        gasto2 = entrada.nextDouble();
        
        System.out.print("Escriba el gasto del tercer hijo:");
        gasto3 = entrada.nextDouble();
        
        double gt;
        
        gt = gasto1 + gasto2 + gasto3;
        
        System.out.println("gt = " + gt);
                
        

    }

}
