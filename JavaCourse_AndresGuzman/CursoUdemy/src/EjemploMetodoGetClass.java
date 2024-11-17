import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        /*Todos los objetos en java tiene el método .getClass(), recordemos
        que cada objeto en java hereda y es tipo de la clase object, por lo tanto
        todos tienen métodos en común. getClass es un método que nos permite
        obtener información sobre la reflexión del objeto, es decir, sobre toda su
        estructura interna(reflexión o metadata), por ejemplo, el nombre de la clase
        completa incluyendo el package, el package al cual pertenece, sus métodos,
        sus atributos, sus constructores, clase padre a la cual hereda o extienda, etc.
        Es como el esquema o la estructura interna del objeto y de la clase.
        Este método lo que retorna es una instancia del tipo Class.
         */

        String texto = "Hola, que tal";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for (Method metodo: strClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        Integer num = 37;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getName() = " + intClass.getSuperclass());
        System.out.println("intClass.getName() = " + objClass);

        System.out.println();
        for (Method metodo: objClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }


    }
}
