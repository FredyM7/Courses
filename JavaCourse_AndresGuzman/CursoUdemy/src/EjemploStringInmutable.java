public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(" "+profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);

        System.out.println(curso == resultado);

        String prueba = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado); //al imprimirla vemos que no cambió nada, ya que no se 'cambia' el string existente, solo se crea otro objeto con la modificación.

        System.out.println(prueba); //Al imprimir esta línea, efectivamente vemos el cambio, ya que estamos imprimiendo la variable a la cual se le asignó el nuevo objeto.
    }
}
