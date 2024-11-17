public class EjemploMatricesColumnasVariables {
    public static void main(String[] args) {

        int[][] matrix = new int[3][];

        matrix[0] = new int[2];
        matrix[1] = new int[3];
        matrix[2] = new int[4];

        System.out.println("Matriz length: " + matrix.length);
        System.out.println("fila 0 length: " + matrix[0].length);
        System.out.println("fila 1 length: " + matrix[1].length);
        System.out.println("fila 2 length: " + matrix[2].length + "\n");

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = i*j;
            }
        }

        for (int[] a : matrix) {
            for (int b : a) {
                System.out.print("["+b+"] ");
            }
            System.out.println();
        }
    }
}
