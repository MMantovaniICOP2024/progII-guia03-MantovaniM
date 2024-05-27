package resolMantovaniM;

public class Ejercicio_11 {
    
    public void operando() {

        int N = 5;
        double A = 4.56;
        char C = 'a';
        

        System.out.println("Variable N = " + N);
        System.out.println("Variable A = " + A);
        System.out.println("Variable C = " + C);

        double sumaNA = N + A;
        System.out.println(N + " + " + A + " = " + sumaNA);
        
        double diferenciaAN = A - N;
        System.out.println(A + " - " + N + " = " + diferenciaAN);

        int valorNumericoC = (int) C;
        System.out.println("Valor numérico del carácter " + C + " = " + valorNumericoC);

        double sumaTotal = N + A + valorNumericoC;
        System.out.println("Suma de " + N + " + " + A + " + " + C + " = " + sumaTotal);
    }
}
