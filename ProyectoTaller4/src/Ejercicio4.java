
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double costo_minuto, minutos_mes;
        
        System.out.print("Ingrese el costo por minuto:");
        costo_minuto = entrada.nextDouble();
        
        System.out.print("Ingrese los minutos por mes:");
        minutos_mes = entrada.nextDouble();
        
        double costo_mes;
        
        costo_mes = costo_minuto * minutos_mes;
        System.out.println("costo_mes = " + costo_mes);
        
    }
    
}
