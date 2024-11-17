public class EjemploString {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String curso2 = new String("PrOgRaMaCiÓn JaVa");

        boolean comparacionReferencia = curso == curso2; //De esta forma se comparan las referencias de los Strings, no los valores
        System.out.println("comparacionReferencia = " + comparacionReferencia);
        
        boolean comparacionValor = curso.equals(curso2);
        System.out.println("comparacionValor = " + comparacionValor);
        
        boolean comparacionValorSinCase = curso.equalsIgnoreCase(curso2);
        System.out.println("comparacionValorSinCase = " + comparacionValorSinCase);

        String ej1 = "Hola"; //En el caso de las literales si no se coloca explicitamente 'new', y se crean dos variables con el mismo valor
        String ej2 = "Hola";//de string, ambas apuntarán a la misma instancia, con el fin de optimización.
        boolean ej1_2 = ej1 == ej2;
        System.out.println("ej1_2 = " + ej1_2); //Este valor será true.


    }
}
