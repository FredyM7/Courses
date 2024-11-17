import java.util.Scanner;

public class TareaNotasAlumnos {

    public static void main(String[] args) {


        double[] totalNotas = new double[20];

        int contNotasMayor5 = 0;
        double sumaNotasMayor5 = 0;

        int contNotasMenor4 = 0;
        double sumaNotasMenor4 = 0;

        int contNotas1 = 0;
        double sumaTotalNotas = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa 20 notas finales [escala de 1-7] \n");

        for (int i = 0; i<totalNotas.length ; i++) {

            do {
                System.out.print("NOTA "+(i+1)+" [1-7]: ");
                totalNotas[i] = sc.nextDouble();
                if (totalNotas[i] == 0) {
                    System.out.println("[¡ERROR!] No pueden haber notas con valor [0]");
                    System.exit(0);
                }

            } while (totalNotas[i] < 1 || totalNotas[i] > 7);

            sumaTotalNotas += totalNotas[i];

            if (totalNotas[i] > 5){
                contNotasMayor5++;
                sumaNotasMayor5 += totalNotas[i];

            } else if (totalNotas[i] < 4){
                contNotasMenor4++;
                sumaNotasMenor4 += totalNotas[i];

            } else if (totalNotas[i] == 1) {
                contNotas1++;
            }
        }

        double promedioNotasMayor5 = 0;
        double promedioNotasMenor4 = 0;
        double promedioTotalNotas = (sumaTotalNotas/totalNotas.length);

        if (contNotasMayor5 == 0) {
            System.out.println("\nNO HAY NOTAS MAYORES A 5");
        } else {
            promedioNotasMayor5 = (sumaNotasMayor5/contNotasMayor5);
            System.out.println("\nPROMEDIO DE NOTAS MAYORES A 5: ["+promedioNotasMayor5+"]");
        }

        if (contNotasMenor4 == 0){
            System.out.println("NO HAY NOTAS MENORES A 4");
        } else {
            promedioNotasMenor4 = (sumaNotasMenor4/contNotasMenor4);
            System.out.println("PROMEDIO DE NOTAS INFERIORES A 4: ["+promedioNotasMenor4+"]");
        }

        System.out.println("PROMEDIO TOTAL DE LAS NOTAS INGRESADAS: ["+promedioTotalNotas+"]");
        System.out.println("CANTIDAD DE NOTAS IGUALES A 1: ["+contNotas1+"]");


    }
}
