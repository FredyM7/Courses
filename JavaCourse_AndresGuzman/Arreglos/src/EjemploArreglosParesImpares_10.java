import java.util.Scanner;

public class EjemploArreglosParesImpares_10 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        System.out.print("[numero entero] Tamaño del arreglo de enteros a llenar: ");
        int tamanioArray = sc.nextInt();
        
        int[] array, paresDeArray, imparesDeArray;
        array = new int[tamanioArray];

        int numPares = 0;
        int numImpares = 0;
        
        System.out.println("Ingresa "+tamanioArray+" números enteros");
        for (int i = 0; i<array.length; i++){
            System.out.print("("+i+"): ");
            array[i] = sc.nextInt();
            
            if(array[i] %2 == 0) {
                numPares++;
            } else {
                numImpares++;
            }
        }
        paresDeArray = new int[numPares];
        imparesDeArray = new int[numImpares];

        int j = 0;
        int k = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i]%2 == 0){
                paresDeArray[j++] = array[i];
            } else {
                imparesDeArray[k++] = array[i];
            }
        }

        System.out.println("[PARES]");
        for (int par : paresDeArray) {
            System.out.print("["+par+"]" + " ");
        }

        System.out.println("\n[IMPARES]");
        for (int impar : imparesDeArray) {
            System.out.print("["+impar+"]" + " ");
        }

    }
}
