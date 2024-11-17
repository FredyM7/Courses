public class WrapperBoolean {
    public static void main(String[] args) {


        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false
        Boolean objetoBoolean = primBoolean; //autoboxing [Boolean.valueOf(primBoolean)]
        Boolean objetoBoolean2 = Boolean.valueOf("false"); //El método .valueOf también permite como entrada un (String).
        Boolean objetoBoolean3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        //El tipo referencia [Boolean] no se comporta igual que los tipos numéricos ni cadena en cuanto a comparaciones [==]. Con boolean, independiente si es primitivo u objeto, se podrá comparar de las dos formas, con el operador [==] y el método equals.
        //Todos los Bboolean fueron creados de distintas formas o de distintas instancias, pero como son todos iguales, ya que son false;
        System.out.println("Comparando dos objetos boolean: "+(objetoBoolean == objetoBoolean2));
        System.out.println("Comparando dos objetos boolean: "+(objetoBoolean.equals(objetoBoolean2)));
        System.out.println("Comparando dos objetos boolean: "+(objetoBoolean2 == objetoBoolean3));
        System.out.println("Comparando dos objetos boolean: "+(objetoBoolean == objetoBoolean3));

        boolean primBoolean2 = objetoBoolean2; //AutoUnboxing [objetoBoolean2.booleanValue()]
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
