package org.fmunera.patterns.abstractfactory;

abstract public class PizzeriaAreaAbstractFactory {

    public PizzaProduct orderPizza(String type){

        PizzaProduct pizza = createPizza(type);

        System.out.println("******** Fabricando la pizza: "+pizza.getName() +" *********");
        pizza.prepare();
        pizza.cook();
        pizza.cut();
        pizza.pack();

        return pizza;
    }

    abstract PizzaProduct createPizza(String type);


}
