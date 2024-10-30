
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double costo, n_kilomes, total, total_descuento;
        int edad;

        System.out.print("Ingrese su edad:");
        edad = entrada.nextInt();

        System.out.print("Ingrese su costo de kilovatio/hora:");
        costo = entrada.nextDouble();

        System.out.print("Ingrese su numero de kilovatio por mes:");
        n_kilomes = entrada.nextDouble();

        if (edad >= 65) {
            total = (costo * n_kilomes);
            total_descuento = total - (total * 0.1);
            System.out.println("total = " + total_descuento);
        } else {
            total = (costo * n_kilomes);
            System.out.println("total = " + total);
        }

    }

}

}
