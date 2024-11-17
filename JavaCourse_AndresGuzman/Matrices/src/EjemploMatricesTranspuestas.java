public class EjemploMatricesTranspuestas {
    public static void main(String[] args) {


        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        System.out.println("Matriz original: ");
        for (int[] numeros: matrix) {
            for (int num : numeros) {
                System.out.print(num+"\t ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz transpuesta: ");

        int aux;
        for (int i=1; i< matrix.length; i++) {
            for (int j=0; j< i; j++) {
                aux = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = aux;
            }
        }

        for (int[] numeros: matrix) {
            for (int num : numeros) {
                System.out.print(num+"\t ");
            }
            System.out.println();
        }
    }
}
