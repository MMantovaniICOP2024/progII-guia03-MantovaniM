package resolMantovaniM;

import java.util.Scanner;

public class Ejercicio_02 {


	public void arreglandoPromedios(Scanner scan) {

        int[] arreglo = {1, 2, 3, 4, 5, 6, 7} ;

        int sumatoria = 0;

        for(int i = 0; i < arreglo.length; i++) {
            sumatoria += arreglo[i];
        }

        double promedio = (double) sumatoria / arreglo.length;

        int[] mayoresQuePromedio = new int[arreglo.length];
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio) {
                mayoresQuePromedio[contador] = arreglo[i];
                contador++;
            }
        }
        System.out.println("Promedio: " + promedio);

        System.out.print("Números mayores que el promedio: [");
        for(int i = 0; i < contador; i++) {
            System.out.print(mayoresQuePromedio[i]);
            if(i < contador - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

}
}