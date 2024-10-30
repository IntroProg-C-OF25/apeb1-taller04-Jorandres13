
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double monto_prestamo, interes;

        System.out.print("Escriba el monto del prestamo:");
        monto_prestamo = entrada.nextDouble();

        System.out.print("Escriba el interes:");
        interes = entrada.nextDouble();
        interes = interes / 100;

        double pago_mensual, pago_interes, pago_total_mensual;
        pago_mensual = (monto_prestamo / 12);
        pago_interes = pago_mensual * interes;
        pago_total_mensual = pago_mensual + pago_interes;

        System.out.println("pago total mensual = " + pago_total_mensual);

    }

}
