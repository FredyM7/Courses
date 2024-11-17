public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {


        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? "+(num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? "+(num1 == num2)); //A pesar de que sean instancias, cuando comparamos con ==, automáticamente hace el [AUTO UNBOXING] con el .inValue por debajo, los convierte a primitivos y los compara, pero solamente en el rango (-128) a (127) --> Integer.valueOf(-128 a 127). Si se sale de este rango comparará por instancia cuando usamos [==].

        System.out.println("Tienen el mismo valor? "+ (num1.equals(num2)));//Usando el método equals comparamos por valor, o de otra forma, convirtiéndolos a primitivos usando el método .intValue en el caso de los enteros.
        System.out.println("Tienen el mismo valor? "+ (num1.intValue() == num2.intValue()));

        boolean condicion = num1 > num2; //Cuando usamos >, >=, <, <=, igual que los operadores aritméticos +, -, *, /, %, al hacer cualquier operación aritmética y relacional, excepto [ == ], se puede trabajar de forma automática con tipos de referencia, ya que se realiza el [AUTO UNBOXING].
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() > num2.intValue(); //Lo que hace por debajo --> [AUTO UNBOXING], en este caso [UNBOXING]
        System.out.println("condicion = " + condicion);


    }
}
