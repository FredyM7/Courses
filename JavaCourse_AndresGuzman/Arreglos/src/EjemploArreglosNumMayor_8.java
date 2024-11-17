import java.util.Scanner;

public class EjemploArreglosNumMayor_8 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("[Ingresa 5 números enteros]");
        for (int i = 0; i< numbers.length; i++) {
            System.out.print("("+i+"): ");
            numbers[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 1; i< numbers.length; i++) {
            max = (numbers[max] > numbers[i]) ? max : i;
        }

        System.out.println("El número mayor ingresado es: "+numbers[max]);
    }
}
