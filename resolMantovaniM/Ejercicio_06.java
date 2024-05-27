package resolMantovaniM;

import java.util.Scanner;

public class Ejercicio_06 {
	
    // Método que determina si un número es primo
    public void esPrimo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar un número: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println(num + " NO es primo.");
        } else if (num == 2) {
            System.out.println(num + " SI es primo.");
        } else {
            boolean primo = true;
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
                i++;
            }
            if (primo) {
                System.out.println(num + " NO es primo.");
            } else {
                System.out.println(num + " SI es primo.");
            }
        }
	}
	
}
