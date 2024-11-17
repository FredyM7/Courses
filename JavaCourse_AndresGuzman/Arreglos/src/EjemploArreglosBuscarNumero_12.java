import java.util.Scanner;

public class EjemploArreglosBuscarNumero_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[7];

        System.out.println("Llena arreglo: ");
        for (int i=0; i<array.length; i++) {
            System.out.print("("+(i)+"): ");
            array[i] = sc.nextInt();
        }

        int aBuscar;
        System.out.print("Número entero a buscar en array: ");
        aBuscar = sc.nextInt();

        int i = 0;
        while (i< array.length && array[i] != aBuscar){
            i++;
        }

        if(i == array.length) {
            System.out.println("Número no encontrado");
        } else if(array[i] == aBuscar) {
            System.out.println("Número ["+aBuscar+"] encontrado en la posición ["+i+"]");
        }






    }
}
