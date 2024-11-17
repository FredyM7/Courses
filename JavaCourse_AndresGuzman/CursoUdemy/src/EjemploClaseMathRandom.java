import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("randomRedondeadoAlPiso = " + random);

        System.out.println("colores[] = " + colores[(int) random]);

        Random randomObj = new Random();
        int randomInt = 15+randomObj.nextInt(25-15/* o .nextInt(10);*/);//Aleatorio entre 15 y 25, no incluyendo el 25. //Si quiero incluir el 25 simplemente sumo 1 más en el parámetro.
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
