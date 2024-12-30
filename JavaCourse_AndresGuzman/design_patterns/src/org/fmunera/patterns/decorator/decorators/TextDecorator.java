package org.fmunera.patterns.decorator.decorators;

import org.fmunera.patterns.decorator.Formatable;
import org.fmunera.patterns.decorator.Text;

abstract public class TextDecorator implements Formatable {

    protected Formatable formatable;

    public TextDecorator(Formatable formatable) {
        this.formatable = formatable;
    }

}
