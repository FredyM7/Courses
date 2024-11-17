public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"Pedro", "Daniel"},{"Alberto", "Robert"},{"Valentina","Salomé"}};

        for(String[] n : nombres) {
            for(String elementoN : n) {
                System.out.print("["+elementoN+"] ");
            }
            System.out.println();
        }

    }
}
