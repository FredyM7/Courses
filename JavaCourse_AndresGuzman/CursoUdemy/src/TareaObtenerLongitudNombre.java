import javax.swing.*;

public class TareaObtenerLongitudNombre {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog(null, "Nombre y apellido miembro 1");
        String nombre2 = JOptionPane.showInputDialog(null, "Nombre y apellido miembro 2");
        String nombre3 = JOptionPane.showInputDialog(null, "Nombre y apellido miembro 3");

        String[] arrayN1 = nombre1.split(" ");
        String[] arrayN2 = nombre2.split(" ");
        String[] arrayN3 = nombre3.split(" ");

        int largoNombre1 = arrayN1[0].length();
        int largoNombre2 = arrayN2[0].length();
        int largoNombre3 = arrayN3[0].length();

        String max = (largoNombre1 > largoNombre2)? nombre1 : nombre2;
        max = (max.split(" ")[0].length() > largoNombre3)? max : nombre3;

        System.out.println(max+" tiene el nombre más largo");

    }
}
