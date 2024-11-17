import java.util.Scanner;

public class TareaMultiplicacionSinOperador {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        long resultado = 0;

        System.out.print("Ingresar un número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresar otro número entero: ");
        int num2 = sc.nextInt();

        int signo = (num1 < 0) ^ (num2 < 0) ? -1 : 1;

        num1 = num1 < 0 ? -num1 : num1;
        num2 = num2 < 0 ? -num2 : num2;

        int i = 0;
        while (i < num2) {

            resultado += num1;
            i++;
        }

        if (signo == -1) {
            System.out.println("Resultado de la multiplicación de ambos números: "+(-resultado));

        } else {
            System.out.println("Resultado de la multiplicación de ambos números: "+ resultado);

        }
    }
}
