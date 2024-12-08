package org.fmunera.optional.example;

import org.fmunera.optional.example.models.Computer;
import org.fmunera.optional.example.repository.ComputerRepository;
import org.fmunera.optional.example.repository.Repository;


public class RepositoryExample {
    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        //Optional<Computer> pc = repository.filter("asus rog");

        repository.filter("asus").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));

        /*if(pc.isPresent()){
            System.out.println(pc.get().getBrand());
        } else {
            System.out.println("No está presente");
        }*/
    }
}
