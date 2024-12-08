package org.fmunera.optional.example;

import org.fmunera.optional.example.models.Computer;
import org.fmunera.optional.example.models.Manufacturer;
import org.fmunera.optional.example.models.Processor;
import org.fmunera.optional.example.repository.ComputerRepository;
import org.fmunera.optional.example.repository.Repository;


public class RepositoryExampleMapFilterMethods {
    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        String n = repository.filter("asus")
                .flatMap(Computer::getProcessor)
                .flatMap(Processor::getManufacturer)
                .filter(m -> "intel".equalsIgnoreCase(m.getName()))
                .map(Manufacturer::getName)
                .orElse("Desconocido");
        System.out.println(n);


    }
}
