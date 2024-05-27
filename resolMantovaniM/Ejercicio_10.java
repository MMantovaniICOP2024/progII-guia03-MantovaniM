package resolMantovaniM;

import java.util.Scanner;

public class Ejercicio_10 {
    
    
    public String calcularISBN(String isbnSinVerificador) {
 
        String isbnNumeros = isbnSinVerificador.replaceAll("-", "");
        

        if (isbnNumeros.length() != 9) {
            throw new IllegalArgumentException("El ISBN sin dígito verificador debe tener 9 dígitos.");
        }


        int suma = 0;
        for (int i = 0; i < 9; i++) {
            int numero = Character.getNumericValue(isbnNumeros.charAt(i));
            suma += numero * (i + 1);
        }

        int digitoVerificador = suma % 11;
        String isbnCompleto;
        if (digitoVerificador == 10) {
            isbnCompleto = isbnSinVerificador + "-X";
        } else {
            isbnCompleto = isbnSinVerificador + "-" + digitoVerificador;
        }

        return isbnCompleto;
    }


    public boolean verificarISBN(String isbnCompleto) {

        String isbnNumeros = isbnCompleto.replaceAll("-", "");
        

        if (isbnNumeros.length() != 10) {
            throw new IllegalArgumentException("El ISBN completo debe tener 10 dígitos.");
        }


        int suma = 0;
        for (int i = 0; i < 9; i++) {
            int numero = Character.getNumericValue(isbnNumeros.charAt(i));
            suma += numero * (i + 1);
        }

        int digitoVerificador = suma % 11;
        char digitoVerificadorChar = digitoVerificador == 10 ? 'X' : Character.forDigit(digitoVerificador, 10);

        return digitoVerificadorChar == isbnNumeros.charAt(9);
    }

        public void ejecutarISBN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ISBN sin el dígito verificador (formato: 9-999-99999): ");
        String isbnSinVerificador = scanner.nextLine();
        try {
            String isbnCompleto = calcularISBN(isbnSinVerificador);
            System.out.println("El ISBN completo es: " + isbnCompleto);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.print("Ingrese un ISBN completo para verificar (formato: 9-999-99999-X): ");
        String isbnAverificar = scanner.nextLine();
        try {
            boolean esValido = verificarISBN(isbnAverificar);
            if (esValido) {
                System.out.println("El ISBN " + isbnAverificar + " es correcto.");
            } else {
                System.out.println("El ISBN " + isbnAverificar + " es incorrecto.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
