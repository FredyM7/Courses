public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        //Este operador nos permite evaluar si una instancia, objeto, es del tipo de...

        Object texto = "Creando un objeto de la clase String... que tal!";

        /*IMPORTANTE! [AUTOBOXING]: Se coloca en la literal el valor primitivo del entero, y de forma automática se crea la instancia(referencia) según el tipo que coloquemos al definir.
        En el caso del tipo genérico Number(clase padre de todos los números), si colocamos un valor primitivo al definir, por ejemplo [7], el objeto será del tipo Integer.
        Del tipo concreto Integer... Aunque también sigue siendo un Number(tipo genérico - padre).
        Si colocamos un número con punto, ya será un objeto tipo Double... etc */

        /* Podemos crear un objeto Number(por ejemplo) también de tipo Integer, de forma explícita, pero sin utilizar el new (deprecated), esto usando el método estático de la clase Integer (valueOf). */
        /* Explicación detallada:
        En Java, el autoboxing es un mecanismo que convierte automáticamente un tipo primitivo en su correspondiente clase envolvente, y viceversa, cuando es necesario.
        El autoboxing y unboxing simplifican el código y mejoran la legibilidad.
        La forma más moderna y preferida de crear instancias de clases envolventes es mediante métodos estáticos de fábrica, como valueOf.
        Esto tiene ventajas de rendimiento y es más claro en cuanto a la intención del código.
        Aunque técnicamente aún puedes usar new para crear instancias de las clases envolventes, se considera menos eficiente y menos idiomático en el contexto de las clases envolventes para tipos primitivos.
        Además, algunos IDEs pueden advertir sobre su uso porque hay formas más preferibles y modernas de lograr lo mismo.
         */

        //Number num = 7; // por defecto tomará la literal como tipo int cuando no tiene punto. Al convertir este primitivo a Integer, lo que hace el compilador detrás de escena es: Integer.valueOf(7);
        Number num = Integer.valueOf(7); //Otra forma de hacerlo. [forma explícita] //En este caso lo definí con el tipo genérico, pero también se hace con el tipo concreto Integer(más común).

        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object ;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("num es del tipo Double = " + b1);

        //decimal de tipo Number con un valor float.
        //Autoboxing (de tipos primitivos a tipos Object[referencia])

        Number decimal = 45.54f; //por defecto, si tiene un punto en la literal, se asociará a un tipo double, a menos de que se le coloque 'f' de float.

        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);




    }
}
