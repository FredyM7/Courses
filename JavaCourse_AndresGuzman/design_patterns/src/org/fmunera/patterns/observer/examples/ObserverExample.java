package org.fmunera.patterns.observer.examples;

import org.fmunera.patterns.observer.Corporation;

public class ObserverExample {
    public static void main(String[] args) {

        Corporation google = new Corporation("Google", 1000);

        google.addObserver((observable, obj) -> {
            System.out.println("John: "+ observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Andrés: "+ observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("María: "+ observable);
        });

        google.modifyPrice(1200);

    }
}
