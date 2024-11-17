public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];

        nombres[0][0] = "Pedro";
        nombres[0][1] = "Daniel";
        nombres[1][0] = "Alberto";
        nombres[1][1] = "Robert";
        nombres[2][0] = "Valentina";
        nombres[2][1] = "Salomé";

        //iterar matriz con for
        for(int i=0; i< nombres.length;i++){
            for(int j=0; j< nombres[i].length; j++){
                System.out.print("["+nombres[i][j]+"] ");
            }
            System.out.println();
        }
        System.out.println();

        //con for each
        for(String[] n : nombres) {
            for(String elemento : n) {
                System.out.print("["+elemento+"] ");
            }
            System.out.println();
        }

    }
}
