package org.fmunera.patterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProduct {

    protected String name;
    protected String sauce;
    protected String dough;
    protected List<String> ingredients;

    public PizzaProduct() {
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void prepare(){
        System.out.println("Preparando: "+name);
        System.out.println("Seleccionando la masa: "+dough);
        System.out.println("Agregando la salsa: "+sauce);
        System.out.println("Agregando ingredientes: ");
        this.ingredients.forEach(System.out::println);
    }

    abstract public void cook();

    abstract public void cut();

    public void pack(){
        System.out.println("Poniendo la pizza en una caja de empaque ...");
    }

    @Override
    public String toString() {
        return "pizzaProduct{" +
                "name='" + name + '\'' +
                ", sauce='" + sauce + '\'' +
                ", dough='" + dough + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
