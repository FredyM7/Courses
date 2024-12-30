package org.fmunera.patterns.decorator2.decorators;

import org.fmunera.patterns.decorator2.Configurable;

abstract public class CoffeeDecorator implements Configurable {

    protected Configurable configurable;

    public CoffeeDecorator(Configurable configurable) {
        this.configurable = configurable;
    }
}
