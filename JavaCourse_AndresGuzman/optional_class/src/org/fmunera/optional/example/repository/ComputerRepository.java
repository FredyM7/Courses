package org.fmunera.optional.example.repository;

import org.fmunera.optional.example.models.Computer;
import org.fmunera.optional.example.models.Manufacturer;
import org.fmunera.optional.example.models.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputerRepository implements Repository<Computer>{

    private List<Computer> dataSource;

    public ComputerRepository() {
        this.dataSource = new ArrayList<>();

        Processor p = new Processor("I9-9880H", new Manufacturer("Intel"));
        Computer asus = new Computer("Asus ROG", "Strix G512");
        asus.setProcessor(p);

        this.dataSource.add(asus);
        this.dataSource.add(new Computer("MacBook PRO", "MVVK2CI"));
    }


    @Override
    public Optional<Computer> filter(String brand) {

        return dataSource.stream()
                .filter(x -> x.getBrand().toLowerCase().contains(brand.toLowerCase()))
                .findFirst();

        /*for(Computer c: dataSource){
            if(c.getBrand().equals(brand)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
         */
    }
}
