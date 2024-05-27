package resolMantovaniM;

import java.util.Scanner;

public class Ejercicio_14 {

    private int[] numeros = new int[10];

    public void rellenarValores(Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el valor para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }
    }
 
    public void mostrarValores() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + " -> Valor: " + numeros[i]);
        }
    }

    public void ejecutar(Scanner scanner) {
        rellenarValores(scanner);
        System.out.println("Valores del array:");
        mostrarValores();
    }
}
