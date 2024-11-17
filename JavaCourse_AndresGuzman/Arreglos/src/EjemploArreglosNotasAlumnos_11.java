import java.util.Scanner;

public class EjemploArreglosNotasAlumnos_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] claseMatematicas, claseProgramacion, claseIngles;

        claseMatematicas =  new double[7];
        claseProgramacion = new double[7];
        claseIngles = new double[7];

        double sumaNotasMatematicas = 0;
        System.out.println("Ingrese 7 notas de estudiantes de la clase de Matemáticas: ");
        for (int i=0; i<claseMatematicas.length; i++) {
            System.out.print("("+(i+1)+"): ");
            claseMatematicas[i] = sc.nextDouble();
            sumaNotasMatematicas += claseMatematicas[i];
        }

        double sumaNotasProgramacion = 0;
        System.out.println("Ingrese 7 notas de estudiantes de la clase de Programación: ");
        for (int i=0; i<claseProgramacion.length; i++) {
            System.out.print("("+(i+1)+"): ");
            claseProgramacion[i] = sc.nextDouble();
            sumaNotasProgramacion += claseProgramacion[i];

        }

        double sumaNotasIngles = 0;
        System.out.println("Ingrese 7 notas de estudiantes de la clase de Inglés: ");
        for (int i=0; i<claseIngles.length; i++) {
            System.out.print("("+(i+1)+"): ");
            claseIngles[i] = sc.nextDouble();
            sumaNotasIngles += claseIngles[i];
        }

        double promedioClaseMatematicas = (sumaNotasMatematicas/claseMatematicas.length);
        double promedioClaseProgramacion = (sumaNotasProgramacion/claseProgramacion.length);
        double promedioClaseIngles = (sumaNotasIngles/claseIngles.length);

        int numeroDeClases = 3;
        double promedioGeneral = ((sumaNotasMatematicas+sumaNotasProgramacion+sumaNotasIngles)/numeroDeClases);

        System.out.println("Promedio de notas de la clase de Matemáticas: ["+ promedioClaseMatematicas+"]");
        System.out.println("Promedio de notas de la clase de Programación: ["+ promedioClaseProgramacion+"]");
        System.out.println("Promedio de notas de la clase de Inglés: ["+ promedioClaseIngles +"]");
        System.out.println("Promedio de notas general de todas las clases: ["+ promedioGeneral+"]\n");

        System.out.print("Para saber el promedio general de un alumno ingrese su posición [1-7]: ");
        int posicion = sc.nextInt();

        double promedioGeneralEstudiante = ((claseMatematicas[posicion-1]+claseProgramacion[posicion-1]+claseIngles[posicion-1])/numeroDeClases);
        System.out.println("Promedio de notas general del estudiante ["+posicion+"]: ["+promedioGeneralEstudiante+"]");

    }
}
