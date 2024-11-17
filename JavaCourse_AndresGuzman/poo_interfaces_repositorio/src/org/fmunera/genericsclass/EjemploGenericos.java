package org.fmunera.genericsclass;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camion){

        for(T a: camion){
            if(a instanceof Animal) System.out.println(((Animal) a).getNombre()+" tipo: "+((Animal) a).getTipo());
            if(a instanceof Automovil) System.out.println("Auto marca: "+((Automovil) a).getMarca());
            if(a instanceof Maquinaria) System.out.println("Máquina tipo: "+((Maquinaria) a).getTipo());
        }
    }
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino","Caballo"));
        transporteCaballos.add(new Animal("Grillo","Caballo"));
        transporteCaballos.add(new Animal("Tunquen","Caballo"));
        transporteCaballos.add(new Animal("Topocalma","Caballo"));
        transporteCaballos.add(new Animal("Longotoma","Caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transporteMaquinas = new Camion(3);
        transporteMaquinas.add(new Maquinaria("Bulldozer"));
        transporteMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transporteMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transporteMaquinas);

        Camion<Automovil> transporteAutomovil = new Camion(3);
        transporteAutomovil.add(new Automovil("Toyota"));
        transporteAutomovil.add(new Automovil("Mitsubishi"));
        transporteAutomovil.add(new Automovil("Chevrolet"));

        imprimirCamion(transporteAutomovil);

    }
}
