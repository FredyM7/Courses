import java.util.Scanner;

public class TareaArreglosMayorOcurrencia_23 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int input;

        System.out.println("Llenar arreglo de enteros en rango [1-9]: ");
        for (int i = 0; i<a.length; i++) {

            do {
                System.out.print("==> [1-9]("+i+"): ");
                input = sc.nextInt();

            } while (input < 1 || input > 9);

            a[i] = input;
        }

        int[] contador = new int[10];

        int maxOcurrencias = 0;
        int num = 0;

        for (int n : a){
            contador[n]++;
        }

        for (int i = 0; i<contador.length; i++) {

            if (contador[i] > maxOcurrencias) {
                maxOcurrencias = contador[i];
                num = i;
            }
        }

        System.out.println("El número ["+num+"] es el que más o de los que más se repite, con ["+maxOcurrencias+"] ocurrencias");

    }
}
