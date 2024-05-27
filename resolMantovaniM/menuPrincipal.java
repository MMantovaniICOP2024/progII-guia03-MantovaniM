package resolMantovaniM;

import java.util.Scanner;

public class menuPrincipal {

	 private static String eleccion="";

	    private static void mostrarMenu() {
	        System.out.println("Menu: ");
	        System.out.println("1: Programa saludador");
	        System.out.println("2: Arreglando promedios");
	        System.out.println("3: Escapicúa?");
	        System.out.println("4: Contraseña segura");
	        System.out.println("5: Fibonacci");
	        System.out.println("6: Es primo?");
	        System.out.println("7: Cuenta palabras");
	        System.out.println("8: Cuenta billetes");
	        System.out.println("9: Ordenación por selección");
	        System.out.println("10: ISBN");
	        System.out.println("11: Operando");
	        System.out.println("12: Utilización del operador condicional '?'");
	        System.out.println("13: Función recursiva y/o iterativa?");
	        System.out.println("14: Cargar y mostrar array");
	        System.out.println("15: Array de vocales");
	        System.out.println("16: Array de calificaciones");
	        System.out.println("17: Contraseña Segura con ArrayList");
	        System.out.println("q: Salir");
	        System.out.println("");
	    }
	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        while (!eleccion.equals("q")) {
	            System.out.println("");
	            System.out.println("-----------------------------------------------");
	            mostrarMenu();
	            System.out.print("Opción: ");
	            eleccion = scanner.nextLine();
	            switch (eleccion) {
	            case "1":
	                System.out.println("Elegiste la opción 1: Programa Saludador");
	                //Aqui invocar lo necesario para la opcion 1
	                
	                Ejercicio_01 ejercicio1 = new Ejercicio_01();
	                ejercicio1.programaSaludador(scanner);
	                System.out.print("");
	                break;
	            case "2":
	                System.out.println("Elegiste la opción 2: Arreglando Promedios");
	                Ejercicio_02 ejercicio2 = new Ejercicio_02();
	                ejercicio2.arreglandoPromedios(scanner);
	                System.out.print("");
	                break;
	            case "3":
	            	System.out.println("Elegiste la opcion 3: Es capicúa?");
	            	Ejercicio_03 ejercicio3 = new Ejercicio_03();
	            	ejercicio3.esCapicua(scanner);
	            	System.out.print("");
	            	break;
	            case "4":
	            	System.out.println("Elegisye la opción 4: Contraseña segura");
	            	Ejercicio_04 ejercicio4 = new Ejercicio_04();
	            	ejercicio4.esSegura();
	            	System.out.print("");
	            	break;
	            case "5":
	            	System.out.println("Elegiste la opción 5: Fibonacci");
	            	Ejercicio_05 ejercicio5 = new Ejercicio_05();
	            	ejercicio5.obtenerFibonacci(scanner);
	            	System.out.print("");
	            	break;
	            case "6":
	            	System.out.println("Elegiste la opción 6: Es primo?");
	            	Ejercicio_06 ejercicio6 = new Ejercicio_06();
	            	ejercicio6.esPrimo();
	            	System.out.print("");
	            	break;
	            case "7":
	            	 System.out.println("Elegiste la opción 7: Cuenta palabras");
	                 Ejercicio_07 ejercicio7 = new Ejercicio_07();
	                 ejercicio7.ejecutarContarPalabras();
	                 System.out.print("");
	                 break;
	            case "8":
	            	System.out.println("Elegiste la opción 8: Cuenta billetes");
	            	Ejercicio_08 ejercicio8 = new Ejercicio_08();
	            	ejercicio8.contarBilletes(scanner);
                    System.out.print("");
	            	break;
	            case "9":
	            	System.out.println("Elegiste la opcion 9: Ordenación por selección");
	            	Ejercicio_09 ejercicio9 = new Ejercicio_09();
	            	ejercicio9.ejecutarOrdenarPorSeleccion();
	            	System.out.print("");
	            	break;
	            case "10":
	            	System.out.println("Elegiste la opcion 10: ISBN");
	            	Ejercicio_10 ejercicio10 = new Ejercicio_10();
	            	ejercicio10.ejecutarISBN();
	            	System.out.print("");
	            	break;
	            case "11":
	            	System.out.print("Elegiste la opción 11: operando");
	            	Ejercicio_11 ejercicio11 = new Ejercicio_11();
	            	ejercicio11.operando();
	            	System.out.print("");
	            	break;
	            case "12":
	            	System.out.print("Elegiste la opción 12: Utilización del operador condicional");
	            	Ejercicio_12 ejercicio12 = new Ejercicio_12();
	            	ejercicio12.verificarPropiedades();
	            	System.out.print("");
	            	break;
	            case "13":
	            	System.out.print("Elegiste la opción 13: Función recursiva y/o iterativa?");
	            	Ejercicio_13 ejercicio13 = new Ejercicio_13();
	            	ejercicio13.ejecutar(scanner);
	            	System.out.print("");
	            	break;
	            case "14":
	            	System.out.print("Elegiste la opción 14: Cargar y mostrar arrays");
	            	Ejercicio_14 ejercicio14 = new Ejercicio_14();
	            	ejercicio14.ejecutar(scanner);
	            	System.out.print("");
	            	break;
	            case "q":
	            	
	                //Salimos del sistema
	            	
	                System.out.println("Saliendo del sistema...");
	                break;
	            }
	        }
	        scanner.close();
	    }
	

}
