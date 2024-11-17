import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese un segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese un tercer número: ");
        int num3 = sc.nextInt();

        System.out.print("Ingrese un cuarto número: ");
        int num4 = sc.nextInt();

        max = (num1 > num2)? num1 : num2;
        max = (max > num3)? max : num3;
        max = (max > num4)? max : num4;

        System.out.println("\n[El número mayor es: "+max+"]");

    }
}
