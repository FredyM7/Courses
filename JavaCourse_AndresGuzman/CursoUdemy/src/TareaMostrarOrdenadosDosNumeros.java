import java.util.Scanner;

public class TareaMostrarOrdenadosDosNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar un número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresar otro número entero: ");
        int num2 = sc.nextInt();

        String resultado = (num1 >= num2)? num1+" y "+num2 : num2+" y "+num1;

        System.out.println("\n"+"RESULTADO = "+resultado);

    }
}
