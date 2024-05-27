package resolMantovaniM;

import java.util.Scanner;

public class Ejercicio_03 {
	
	 public boolean esCapicua(Scanner scan) {

	        boolean esCapicua;

	        System.out.print("Ingrese el numero a evaluar: ");
	        int num = scan.nextInt();

	        // Invertir el número
	        
	        int originalNum = num;
	        int invertido = 0;

	        while (num != 0) {
	            int digito = num % 10;
	            invertido = invertido * 10 + digito;
	            num /= 10;
	        }
	        
	        // Verificar si el número original es igual al invertido
	        
	        if (originalNum == invertido) {
	            esCapicua = true;
	        System.out.println("Es capicúa");
	        } else {
	            esCapicua= false;
	        System.out.println("No es capicúa");
	            
	        }
	        return  esCapicua;
	        
}
}
