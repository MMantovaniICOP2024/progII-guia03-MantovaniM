package resolMantovaniM;

import java.util.Scanner;

public class Ejercicio_13 {

    public int sumaRecursiva(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumaRecursiva(n - 1);
    }

    public int sumaIterativa(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public void ejecutar(Scanner scanner) {
        System.out.print("Introduce el número N: ");
        int n = scanner.nextInt();

        // Suma recursiva
        int resultadoRecursivo = sumaRecursiva(n);
        System.out.println("Suma recursiva de los primeros " + n + " números naturales: " + resultadoRecursivo);

        // Suma iterativa
        int resultadoIterativo = sumaIterativa(n);
        System.out.println("Suma iterativa de los primeros " + n + " números naturales: " + resultadoIterativo);

        
    }
}
