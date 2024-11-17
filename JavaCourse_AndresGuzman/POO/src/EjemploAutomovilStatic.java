
public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        //Con atributos private usando setters:
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        //Imprimir atributo privado usando getters:
        System.out.println("subaru.getFabricante() = " + subaru.getFabricante());

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        //Imprimir atributo privado usando getters:
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante()+"\n");


        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil auto = new Automovil();

        //nissan2.colorPatente = "Rojo"; //No recomendado
        Automovil.setColorPatente(Color.AZUL);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());

        Automovil.setCapacidadEstanqueEstatico(45);
        //Como es un método static no es correcto invocar con el nombre de una instancia, sino con el nombre de la clase.
        System.out.println("Kilometros por litro (Automovil): "+Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Kilometros por litro (subaru): "+subaru.calcularConsumoEstatico(300, 60));
        System.out.println("Kilometros por litro (mazda): "+mazda.calcularConsumoEstatico(300, 60));
        System.out.println("Kilometros por litro (nissan): "+nissan.calcularConsumoEstatico(300, 60));

        System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);

        System.out.println("Color.GRIS = " + Color.GRIS);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("\ntipoSubaru.getNombre() = " + tipoSubaru.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipoSubaru.getDescripcion());
        System.out.println("tipoSubaru.getNumeroPuertas() = " + tipoSubaru.getNumeroPuertas());



    }
}
