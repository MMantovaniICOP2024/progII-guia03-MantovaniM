package resolMantovaniM;

import java.util.Scanner;

public class Ejercicio_07 {
    // Método que cuenta el número de palabras en una cadena de texto
    public int contarPalabras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        
        // Usar una expresión regular para dividir la cadena en palabras
        String[] palabras = texto.split("\\W+");
        
        // Contar el número de palabras no vacías en el arreglo
        int contador = 0;
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                contador++;
            }
        }
        
        return contador;
    }

    // Método para pedir la cadena de texto y mostrar el número de palabras
    public void ejecutarContarPalabras() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresar una cadena de texto: ");
        String texto = scanner.nextLine();
        
        int numeroDePalabras = contarPalabras(texto);
        System.out.println("El número total de palabras es: " + numeroDePalabras);
    }
}