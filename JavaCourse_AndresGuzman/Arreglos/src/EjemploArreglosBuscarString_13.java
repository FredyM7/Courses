import java.util.Scanner;

public class EjemploArreglosBuscarString_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] array = new String[4];

        System.out.println("Llena arreglo de Strings: ");
        for (int i=0; i<array.length; i++) {
            System.out.print("("+(i)+"): ");
            array[i] = sc.nextLine();
        }

        String aBuscar;
        System.out.print("String a buscar en array: ");
        aBuscar = sc.nextLine();

        int i = 0;
        while (i< array.length && !array[i].equalsIgnoreCase(aBuscar)){
            i++;
        }

        if(i == array.length) {
            System.out.println("\n[STRING NO ENCONTRADO]");
        } else if(array[i].toLowerCase().compareTo(aBuscar.toLowerCase()) == 0) {
            System.out.println("String ["+aBuscar+"] encontrado en la posición ["+i+"] ==> ["+array[i]+"]");
        }






    }
}
