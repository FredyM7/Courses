package org.fmunera.patterns.composite.example;

import org.fmunera.patterns.composite.File;
import org.fmunera.patterns.composite.Folder;

import javax.annotation.processing.FilerException;

public class CompositeExample {
    public static void main(String[] args) {


        Folder doc = new Folder("Documentos");

        Folder java = new Folder("Java");
        java.addComponent(new File("patron-composite.docx"));

        Folder stream = new Folder("Api Stream");
        stream.addComponent(new File("stream-map.docx"));

        java.addComponent(stream);

        doc.addComponent(java);
        doc.addComponent(new File("cv.docx"));
        doc.addComponent(new File("Logo.jpeg"));

        System.out.println(doc.show(0));

        boolean found = doc.search("cv.docx");
        System.out.println("is \"patron-composite.docx\" found in Documentos? : "+found);
    }
}
