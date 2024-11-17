import java.util.Scanner;

public class TareaProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Integrante #1: ");
        String integrante1 = sc.nextLine();

        System.out.print("Integrante #2: ");
        String integrante2 = sc.nextLine();

        System.out.print("Integrante #3: ");
        String integrante3 = sc.nextLine();

        String int1 = (String.valueOf(integrante1.charAt(1))).toUpperCase() +"."+ integrante1.substring(integrante1.length() - 2);
        String int2 = (String.valueOf(integrante2.charAt(1))).toUpperCase() +"."+ integrante2.substring(integrante2.length() - 2);
        String int3 = (String.valueOf(integrante3.charAt(1))).toUpperCase() +"."+ integrante3.substring(integrante3.length() - 2);

        StringBuilder union = new StringBuilder();
        union.append(int1).append("_").append(int2).append("_").append(int3);

        System.out.println("union = " + union);


    }
}
