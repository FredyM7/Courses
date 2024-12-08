package org.fmunera.optional.example;

import org.fmunera.optional.example.models.Computer;
import org.fmunera.optional.example.repository.ComputerRepository;
import org.fmunera.optional.example.repository.Repository;

import java.util.Optional;


public class RepositoryExampleOrElseThrowMethods {
    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        Computer pc = repository.filter("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        String archive = "Documento.pdf";

        String extension = Optional.of(archive)
                .filter(x -> x.contains("."))
                .map(x -> x.substring(archive.lastIndexOf(".")+1))
                .orElseThrow();

        System.out.println(extension);


    }

}
