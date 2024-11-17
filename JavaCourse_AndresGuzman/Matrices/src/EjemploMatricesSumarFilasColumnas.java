public class EjemploMatricesSumarFilasColumnas {
    public static void main(String[] args) {

        int[][] a = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};

        int sumaFila;
        int sumaColumna;

        for (int i=0; i<a.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j=0; j<a[i].length; j++) {
                sumaFila += a[i][j];
                sumaColumna += a[j][i];
            }

            System.out.println("SUMA DE LA FILA ("+i+"): "+sumaFila);
            System.out.println("SUMA DE LA COLUMNA ("+i+"): "+sumaColumna+"\n");

        }
    }
}
