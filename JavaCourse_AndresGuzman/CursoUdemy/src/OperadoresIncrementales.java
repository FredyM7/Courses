public class OperadoresIncrementales {
    public static void main(String[] args) {

        //PRE INCREMENTO
        int i = 1;
        int j = ++i; // i = i + 1 // ++i => [ int j = (i = i + 1) ] el paréntesis devuelve un int, pero también modifica la var i.
        //El paréntesis se puede escribir de forma abreviada como ++i; [suma primero y luego asigna]

        System.out.println("i = " + i);
        System.out.println("j = " + j +"\n");

        //POST INCREMENTO
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++; //La var [i] se incrementa pero, en la j sólo se asigna i = 2 sin incrementar.
        //Cuando es [post] primero se asigna a la variable y después se incrementa.
        //El valor de [i] se muestra incrementado siempre independientemente de usar Pre-Post, siempre se va a incrementar la variable.
        System.out.println("i = " + i);
        System.out.println("j = " + j +"\n");

        //PRE DECREMENTO
        i = 3;
        j = --i; // i = ( i - 1 ) = 2

        System.out.println("i = " + i);
        System.out.println("j = " + j+"\n");

        //POST DECREMENTO 
        i = 4;
        j = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);

    }
}
