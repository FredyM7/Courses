package org.fmunera.optional.example.models;

import java.util.Optional;

public class Processor {

    private String name;
    private Manufacturer manufacturer;

    public Processor(String name, Manufacturer manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Manufacturer> getManufacturer() {
        return Optional.ofNullable(this.manufacturer);
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
