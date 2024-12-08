package org.fmunera.optional.example.models;

import java.util.Optional;

public class Computer {
    
    private String brand;
    private String model;
    private Processor processor;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Optional<Processor> getProcessor() {
        return Optional.ofNullable(this.processor);
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return brand + ", " + model;
    }
}
