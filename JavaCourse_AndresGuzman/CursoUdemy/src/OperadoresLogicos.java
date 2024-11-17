public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k > l || m == false; // se evalúan de izquierda a derecha estas condiciones, primero evalua las dos primeras, luego el resultado de esas dos lo evalúa con la tercera. Sería lo mismo que: [ (i == j && k > l) || m == false ]
        System.out.println("b3 = " + b3);

        /*boolean a = i < j & k > l; //Operador & [AND] con un solo simbolo, evaluará si uno y otro son verdaderos, pero evalúa siempre ambos operandos. Lo mismo con el operador | [OR] con un solo símbolo.
        System.out.println("a = " + a);*/

        boolean b3_02 = i == j && (k > l || m == false); //Cambiando la prioridad o precedencia[usando paréntesis]. (en este caso no se alcanzará a evaluar la segunda expresión completa, ya que la primera es false y no tiene sentido evaluar la que sigue.
        System.out.println("b3_02 = " + b3_02);

        //En algunos casos la precedencia de los operadores es de izq a der, pero esto no siempre se aplica porque también hay una precedencia entre el operado && y ||, siempre va a tener prioridad el && antes que el ||.

        boolean b4 = i == j || k < l && m == true; //Se supone que el resultado en esta operación debería ser false, ya que suponemos que se evalua de izq a der. Pero no, ya que existe una precedenca del && por encima del ||, en este caso se van a evaluar dos expresiones con el && y luego el resultado con el ||. Sería lo mismo que: [ i == j || (k < l && m == true) ]
        System.out.println("b4 = " + b4); //Esta prioridad se podría cambiar usando paréntesis.

        boolean b5 =  true || true && false; //De forma un poco más explícita se vería así. Es lo mismo que en [b4].
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false; //Da prioridad al && => [ true || (false && false) || false ]
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false; //Dando prioridades [con paréntesis]
        System.out.println("b7 = " + b7);





    }
}
