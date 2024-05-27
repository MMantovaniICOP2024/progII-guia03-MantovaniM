package resolMantovaniM;

import java.util.Scanner;

public class Ejercicio_08 {

    public void contarBilletes(Scanner scan) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresar un monto de dinero: ");
        int monto = scanner.nextInt();
        
        int[] denominaciones = {100, 50, 20, 10, 5, 2, 1};
        int[] cantidadBilletes = new int[denominaciones.length];
        
        for (int i = 0; i < denominaciones.length; i++) {
            if (monto >= denominaciones[i]) {
                cantidadBilletes[i] = monto / denominaciones[i];
                monto = monto % denominaciones[i];
            }
        }
        System.out.println("Cantidad de billetes:");
        for (int i = 0; i < denominaciones.length; i++) {
            if (cantidadBilletes[i] > 0) {
                System.out.println("$" + denominaciones[i] + ": " + cantidadBilletes[i]);
            }
        }
    }
}