package org.fmunera.patterns.decorator;

public class Text implements Formatable {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


    @Override
    public String format() {
        return getText();
    }
}
