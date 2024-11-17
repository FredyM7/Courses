public class EjemploMatricesSimetricas {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},
                          {2,1,0,5},
                          {3,0,1,6},
                          {4,5,6,7}};

        boolean simetrica = true;

        int i,j;

        i=0;
        salir: while (i< matrix.length) {
            j=0;
            while (j< i) {
                if(matrix[i][j] != matrix[j][i]) {
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }

        if(simetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica!");
        }

    }
}
