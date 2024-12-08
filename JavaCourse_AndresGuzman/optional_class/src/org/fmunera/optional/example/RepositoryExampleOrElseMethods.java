package org.fmunera.optional.example;

import org.fmunera.optional.example.models.Computer;
import org.fmunera.optional.example.repository.ComputerRepository;
import org.fmunera.optional.example.repository.Repository;


public class RepositoryExampleOrElseMethods {
    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        //Computer default = new Computer("HP Omen", "LA0001");

        //Usando orElse: El valor por defecto se evalúa **siempre**, incluso si el Optional tiene un valor.
        Computer pc = repository.filter("rog").orElse(defaultValue());
        System.out.println(pc);

        // Usando orElseGet: El valor por defecto se evalúa **solo si el Optional está vacío**.
        pc = repository.filter("pro").
                orElseGet(RepositoryExampleOrElseMethods::defaultValue);

        System.out.println(pc);

    }

    public static Computer defaultValue(){
        System.out.println("Obteniendo valor por defecto!");
        return new Computer("HP Omen", "LA0001");
    }
}
