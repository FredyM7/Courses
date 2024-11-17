import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        //Sin atributos como private:
        /*Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "blanco";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";*/

        //Con atributos private usando setters:
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());

        subaru.setColor(Color.BLANCO);
        //Imprimir atributo privado usando getters:
        System.out.println("subaru.getFabricante() = " + subaru.getFabricante());

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        //Imprimir atributo privado usando getters:
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante()+"\n");

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));

        System.out.println("Son iguales?(con ==) ==> "+ (nissan == nissan2));
        //or (son lo mismo las dos formas de comparación)(el método equals se puede customizar sobreescribiéndolo en la clase con @Override)
        System.out.println("Son iguales?(con equals)(modificado con @Override) ==> "+ (nissan.equals(nissan2))+"\n");

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println((auto.equals(nissan2)) +"\n");
        System.out.println((auto.equals(fecha)) +"\n");


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());


        System.out.println(subaru.acelerar(3700));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerar(3770));
        System.out.println(mazda.frenar());

        System.out.println(nissan.acelerar(3770));
        System.out.println(nissan.frenar());

        System.out.println(subaru.acelerarFrenar(2000));
        System.out.println(mazda.acelerarFrenar(3000));
        System.out.println(nissan.acelerarFrenar(3900));


        //Sobrecarga:
        System.out.println("Kilómetros por litros de gasolina (subaru): "+subaru.calcularConsumo(300, 0.75f));
        System.out.println("Kilómetros por litros de gasolina (mazda): "+mazda.calcularConsumo(280, 0.75f));
        System.out.println("Kilómetros por litros de gasolina (nissan): "+nissan.calcularConsumo(280, 0.75f)+"\n");

        System.out.println("Kilómetros por litros de gasolina (subaru): "+subaru.calcularConsumo(300, 75));
        System.out.println("Kilómetros por litros de gasolina (mazda): "+mazda.calcularConsumo(280, 75));
        System.out.println("Kilómetros por litros de gasolina (nissan): "+nissan.calcularConsumo(280, 75));


        System.out.println("\n"+nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.getMotor());

    }
}
