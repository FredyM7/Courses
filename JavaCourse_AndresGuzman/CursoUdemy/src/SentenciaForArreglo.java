import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        //El corchete para definir el arreglo puede ir después del tipo o después de el identificador(nombre de variable).
        String[] nombres/*[]*/ = {"Andres",
                            "Pepe",
                            "Maria",
                            "Paco",
                            "Lalo",
                            "Bea",
                            "Pato",
                            "Pepa"};

        int count = nombres.length;

        for(int i = 0; i<count; i++) {

            if (nombres[i].equalsIgnoreCase("andres") ||
                nombres[i].equalsIgnoreCase("Pepa")) {

                continue;
            }
            /* [***********************OTRA FORMA******************************]

            if (nombres[i].toLowerCase().contains("andres".toLowerCase()) ||    //otro método que se puede utilizar para esto: contains
                nombres[i].toLowerCase().contains("Pepa".toLowerCase())) {

                continue;
            }
             */
            System.out.println("Nombre ["+i+"]"+" = "+nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"María\": ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;

        for (int i = 0; i<count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }

        if(encontrado) {
            JOptionPane.showMessageDialog(null, buscar+" fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar+" no existe en el sistema!");

        }



    }
}
