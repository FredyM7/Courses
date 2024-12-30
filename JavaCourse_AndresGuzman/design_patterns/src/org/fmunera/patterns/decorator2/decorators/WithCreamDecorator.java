package org.fmunera.patterns.decorator2.decorators;

import org.fmunera.patterns.decorator2.Configurable;

public class WithCreamDecorator extends CoffeeDecorator {

    public WithCreamDecorator(Configurable configurable) {
        super(configurable);
    }

    @Override
    public float getBasePrice() {
        return configurable.getBasePrice() + 2.5f;
    }

    @Override
    public String getIngredients() {
        return configurable.getIngredients()+", Crema";
    }
}
