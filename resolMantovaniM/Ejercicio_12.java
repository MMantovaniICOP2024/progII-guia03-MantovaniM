package resolMantovaniM;

public class Ejercicio_12 {
    
    public void verificarParidad() {
        int A = 14; 
 
        String resultado = (A % 2 == 0) ? A + " es par" : A + " es impar";
        
        System.out.println(resultado);
    }

    public void verificarPropiedades() {
        int C = 55;
        
        String esPositivo = (C >= 0) ? C + " es positivo" : C + " es negativo";
        
        String esPar = (C % 2 == 0) ? C + " es par" : C + " es impar";
       
        String esMultiploDe5 = (C % 5 == 0) ? C + " es múltiplo de 5" : C + " no es múltiplo de 5";
        
        String esMultiploDe10 = (C % 10 == 0) ? C + " es múltiplo de 10" : C + " no es múltiplo de 10";
        
        String esMayorMenorQue100 = (C > 100) ? C + " es mayor que 100" : C + " es menor que 100";
        
        System.out.println(esPositivo);
        System.out.println(esPar);
        System.out.println(esMultiploDe5);
        System.out.println(esMultiploDe10);
        System.out.println(esMayorMenorQue100);
    }
}
