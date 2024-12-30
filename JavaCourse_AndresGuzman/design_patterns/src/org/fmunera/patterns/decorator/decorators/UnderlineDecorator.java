package org.fmunera.patterns.decorator.decorators;

import org.fmunera.patterns.decorator.Formatable;

public class UnderlineDecorator extends TextDecorator {

    public UnderlineDecorator(Formatable formatable) {
        super(formatable);
    }

    @Override
    public String format() {
        int length = formatable.format().length();
        StringBuilder sb = new StringBuilder(formatable.format());
        sb.append("\n");

        for(int i = 0; i < length; i++){
            sb.append("_");
        }

        return sb.toString();
    }
}
