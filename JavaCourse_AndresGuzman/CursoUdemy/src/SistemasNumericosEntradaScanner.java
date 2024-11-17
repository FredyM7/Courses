import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("INGRESE UN NÚMERO ENTERO: ");

        int numeroDecimal = 0;
        try {
            numeroDecimal = sc.nextInt();
        } catch (Exception e){

            System.out.println("Ingresa un número entero porfavor\n");
            main(args);
            System.exit(0);
        }

        System.out.println("[ numeroDecimal = " + numeroDecimal+" ]");

        String resultadoBinario = "[ Número binario de "+numeroDecimal+" = "+ Integer.toBinaryString(numeroDecimal)+" ]\n";
        String resultadoOctal = "[ Número octal de "+numeroDecimal+" = "+Integer.toOctalString(numeroDecimal)+" ]\n";
        String resultadoHexadecimal = "[ Número hexadecimal de "+numeroDecimal+" = "+Integer.toHexString(numeroDecimal)+" ]";

        String mensaje = resultadoBinario+ resultadoOctal+ resultadoHexadecimal;
        System.out.println(mensaje);


        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        int numeroBinario = 0b111110100; /*Al anteponer 0b al inicio del número, el compilador de java asume que esa combinación de 0's-1's
        corresponde a un sistema binario. Al imprimirlo, se mostrará en la consola el número en forma decimal que representa.*/
        System.out.println("numeroBinario = " + numeroBinario);

        int numeroOctal = 0764; /*Al anteponer un 0 al inicio del número, el compilador de java asume que ese valor corresponde
        al sistema octal. Al imprimirlo, se mostrará en la consola el número en forma decimal que representa.*/
        System.out.println("numeroOctal = " + numeroOctal);

        int numeroHexadecimal = 0x1f4; /*Al anteponer 0x al inicio del número, el compilador de java asume que ese valor corresponde
        al sistema hexadecimal. Al imprimirlo, se mostrará en la consola el número en forma decimal que representa.*/
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);


    }
}
