package resolMantovaniM;

import java.util.Scanner;

public class Ejercicio_05 {

    // Método recursivo para calcular el enésimo número de Fibonacci
	
    public int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El índice debe ser un número entero positivo.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Método para interactuar con el usuario y obtener el enésimo número de Fibonacci
    
    public void obtenerFibonacci(Scanner scan) {
        System.out.print("Ingrese el número de término de Fibonacci que desea obtener: ");
        int n = scan.nextInt();
        int resultado = fibonacci(n);
        System.out.println("El " + n + "° número de Fibonacci es: " + resultado);
    }
}