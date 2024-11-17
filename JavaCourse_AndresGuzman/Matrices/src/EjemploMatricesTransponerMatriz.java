public class EjemploMatricesTransponerMatriz {
    public static void main(String[] args) {


        int[][] a = new int[8][4];
        int[][] b = new int[4][8];

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                a[i][j] = i+j*3;
            }
        }

        System.out.println("Matriz a: ");
        for (int[] x : a) {
            for (int y : x) {
                System.out.print(y+"\t ");
            }
            System.out.println();
        }

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }

        System.out.println("Matriz a transpuesta en b: ");
        for (int[] x : b) {
            for (int y : x) {
                System.out.print(y+"\t ");
            }
            System.out.println();
        }
    }
}
