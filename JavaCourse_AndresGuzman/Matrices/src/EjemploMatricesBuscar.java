public class EjemploMatricesBuscar {
    public static void main(String[] args) {


        int[][] numeros = {{5,15,20},
                           {14,2,7},
                           {17,8,9}};
        int desconocido = 0;
        boolean encontrado = false;

        int i;
        int j = 0;
        buscar: for (i=0; i< numeros.length; i++) {
            for (j=0; j< numeros[i].length; j++) {
                if (numeros[i][j] == desconocido) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(!encontrado){
            System.out.println("El número ["+desconocido+"] no está en la matriz");
        } else {
            System.out.println("Número ["+desconocido+"] encontrado en la posición ["+i+"]["+j+"] de la matriz numeros");

        }
    }
}