import java.util.Scanner;

public class TareaCalcularAreaCirculo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio de un círculo para calcular su área: ");
        double radio = sc.nextDouble();
        
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("El área del círculo con radio ["+radio+"] es de: "+area);

    }
}
