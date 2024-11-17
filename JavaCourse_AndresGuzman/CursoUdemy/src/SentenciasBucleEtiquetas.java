public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        etiquetaBucle: for (int i = 1; i <= 7; i++) {

            System.out.println();
            for (int j = 1; j <= 8; j++) {

                if (i == 6 || i == 7) {
                    System.out.print("Día "+i+": descanso de fin de semana!");
                    continue etiquetaBucle;
                }

                System.out.println("Día "+i+", trabajando a las "+j+" hrs.");

            }
        }
        System.out.println("\n\n======================================================================");

        etiquetaBucle1: for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    continue etiquetaBucle1;
                }

                System.out.print("[i = "+i+", j = "+j+"]");

            }
        }
        System.out.println("\n\n======================================================================");

        etiquetaBucle2:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    break etiquetaBucle2;
                }

                System.out.print("[i = "+i+", j = "+j+"]");

            }
        }
        System.out.println("\n\n======================================================================");

        //Con while:

        etiquetaBucle3:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;
            while ( j < 5 ) {

                if (i == 2) {
                    continue etiquetaBucle3;
                }

                System.out.print("[i = "+i+", j = "+j+"]");

                j++;
            }
        }
    }
}
