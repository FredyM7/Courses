
public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        System.out.println("subaru.getFabricante() = " + subaru.getFabricante());

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante()+"\n");

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("\nsubaru ==> tipo.getNombre() = " + tipo.getNombre());
        System.out.println("subaru ==> tipo.getDescripcion() = " + tipo.getDescripcion());
        System.out.println("subaru ==> tipo.getNumeroPuertas() = " + tipo.getNumeroPuertas());

        tipo = mazda.getTipo();

        switch (tipo) {
            case CONVERTIBLE -> System.out.println("\nEl automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("\nEs un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("\nEs un automovil utilitario de transporte, de empresas");
            case HATCHBACK -> System.out.println("\nEs un automovil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("\nEs un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("\nEs un automovil mediano");
            case STATION_WAGON -> System.out.println("\nEs un automovil más grande, con maleta grande...");
        }
        System.out.println();

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for(TipoAutomovil c : tipos) {
            System.out.print(c +" => "+ c.name() + ", "+c.getNombre() +", "+c.getDescripcion() +", " +c.getNumeroPuertas());
            System.out.println();
        }



    }
}
