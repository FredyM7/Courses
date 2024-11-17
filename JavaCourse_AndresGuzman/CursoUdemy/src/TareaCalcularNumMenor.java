import java.util.Scanner;

public class TareaCalcularNumMenor {
    public static void main(String[] args) {

        //CALCULAR MENOR NÚMERO DE UN ARRAY

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números a comparar: ");
        int cantidadNum = sc.nextInt();

        int[] arrayNum = new int[cantidadNum];

        for (int i = 0; i < cantidadNum; i++){

            System.out.print("Ingresa el #"+(i+1)+": ");
            arrayNum[i] = sc.nextInt();
        }

        int menor = arrayNum[0];

        for (int i = 0; i < (cantidadNum-1); i++){

            if ( arrayNum[i] < menor ) {

                menor = arrayNum[i];
            }
        }

        if (menor < 10) {
            System.out.println("Número menor: ["+menor+"] \nEs menor que [10]");
        } else if (menor >= 10){
            System.out.println("Número menor: ["+menor+"] \nEs igual o mayor que [10]");
        }
    }
}
