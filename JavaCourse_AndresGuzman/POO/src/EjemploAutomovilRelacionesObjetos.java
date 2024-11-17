
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(new Persona("Luci", "Martínez"));
        //subaru.setRuedas(ruedasSubaru);

        //Rueda[] ruedasSubaru = new Rueda[5];
        for(int i=0; i< subaru.getRuedas().length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(new Persona("Pato", "Rodríguez"));
        //mazda.setRuedas(ruedasMazda);

        //Rueda[] ruedasMazda = new Rueda[10];
        for(int i=0; i<mazda.getRuedas().length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }


        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(new Persona("Bea", "González"));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.addRueda(new Rueda("Michelin", 18, 10.5))
              .addRueda(new Rueda("Michelin", 18, 10.5))
              .addRueda(new Rueda("Michelin", 18, 10.5))
              .addRueda(new Rueda("Michelin", 18, 10.5))
              .addRueda(new Rueda("Michelin", 18, 10.5));


        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50),
                new Persona("Lalo", "Mena"), ruedasNissan2);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil auto = new Automovil();

        //nissan2.colorPatente = "Rojo"; //No recomendado
        Automovil.setColorPatente(Color.AZUL);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*System.out.println("Conductor subaru: "+subaru.getConductor());
        System.out.println("Ruedas subaru: ");
        for(Rueda r: subaru.getRuedas()) {
            System.out.println(r.getFabricante()+", aro: "+r.getAro()+", ancho: "+ r.getAncho());
        }*/


    }
}
