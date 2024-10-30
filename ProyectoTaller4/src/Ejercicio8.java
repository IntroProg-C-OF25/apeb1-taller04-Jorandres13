import java. util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double netflix, youtube, dropbox, spotify, total;
        int edad;
                
        
        System.out.print("Pago mensual de netflix:");
        netflix = entrada.nextDouble();
        
        System.out.print("Pago mensual de youtube:");
        youtube = entrada.nextDouble();
        
        System.out.print("Pago mensual de dropbox:");
        dropbox = entrada.nextDouble();
        
        System.out.print("Pago mensual de spotify:");
        spotify = entrada.nextDouble();
        
        System.out.print("Ingrese su edad:");
        edad = entrada.nextInt();
        
        total = (netflix + youtube + dropbox + spotify);
        
        if (edad < 30){
            double total_descuento, total_pago;
            total_descuento = total * 0.2;
            total_pago = total - total_descuento;
            System.out.println("total pago = " + total_pago);
        }else {
            System.out.println("total pago = " + total);
            
        }
        
    }
    
}
