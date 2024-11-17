import javax.swing.*;
import java.sql.SQLOutput;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroString= JOptionPane.showInputDialog(null, "INGRESE UN NÚMERO");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        } catch (Exception e){

            JOptionPane.showMessageDialog(null, "Ingresa un número porfavor");
            main(args);
            System.exit(0);
        }


        System.out.println("[ numeroDecimal = " + numeroDecimal+" ]");

        String resultadoBinario = "[ Número binario de "+numeroDecimal+" = "+ Integer.toBinaryString(numeroDecimal)+" ]\n";
        System.out.println(resultadoBinario);

        String resultadoOctal = "[ Número octal de "+numeroDecimal+" = "+Integer.toOctalString(numeroDecimal)+" ]\n";
        System.out.println(resultadoOctal);

        String resultadoHexadecimal = "[ Número hexadecimal de "+numeroDecimal+" = "+Integer.toHexString(numeroDecimal)+" ]";
        System.out.println(resultadoHexadecimal);

        String mensaje = resultadoBinario+ resultadoOctal+ resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);


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
