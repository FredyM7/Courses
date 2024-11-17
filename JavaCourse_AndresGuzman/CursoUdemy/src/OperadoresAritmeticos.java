import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i+j;

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j); //De esta forma se concatena primero el string con la primera variable numérica y luego se concatena con la segunda variable, de forma que no se realiza la suma.
        System.out.println("(i + j) = " + (i + j)); //De esta forma se da prioridad a la suma, y luego se concatena con el String de la izquierda.

        int resta = i - j;

        //System.out.println("i - j = " + i - j); /*De esta forma dará error, ya que como se evalúa la expresión de izquierda a derecha,
        //el String se concatena a la variable i y luego el String resultante quedaría ("i - j = i" - j), la cual es una operación que no existe con el operador [-]*/

        System.out.println("i - j = " + (i - j)); //Forma correcta, se da prioridad a la operación aritmética con (), y luego se concatena con el String.
        
        int multi = i*j;
        System.out.println("i * j = " + i * j);
        
        int div = i/j;
        float div2 = (float)i / j;
        
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i%j;
        System.out.println("resto = " + resto);

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número: "));
        if (num % 2 == 0){
            System.out.println("número par = " + num);
        } else {
            System.out.println("número im par = " + num);
        }
    }
}
