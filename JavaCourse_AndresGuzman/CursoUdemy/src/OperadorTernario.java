import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        // variable = condicion ? [LADO TRUE]si es verdadero : [LADO FALSE]si es falso;

        String variable = 7 == 5 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable +"\n");

        String estado = "";
        double promedio = 0.0;

        double matemáticas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota de matemáticas [entre 2.0-7.0]: ");
        matemáticas = sc.nextDouble();

        System.out.print("Ingrese la nota de ciencias [entre 2.0-7.0]: ");
        ciencias = sc.nextDouble();

        System.out.print("Ingrese la nota de historia [entre 2.0-7.0]: ");
        historia = sc.nextDouble();

        promedio = (matemáticas + ciencias + historia) /3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado"; //Equivale al 'if' //Puede devolver cualquier tipo de dato, no solo String.
        System.out.println("estado = " + estado);

        //ES LO EQUIVALENTE A [5 líneas vs 1 línea]:
        /* 1.     if (promedio >= 5.49) {
           2.       estado = "Aprobado";
           3.   }   else{
           4.       estado = "Rechazado";
           5.   }*/
        //Si tenemos una situación if else que asigne algún valor, lo podemos reemplazar por el operador ternario.



    }
}
