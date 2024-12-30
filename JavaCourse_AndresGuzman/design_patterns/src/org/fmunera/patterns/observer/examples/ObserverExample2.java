package org.fmunera.patterns.observer.examples;

import org.fmunera.patterns.observer.UserRepository;

public class ObserverExample2 {
    public static void main(String[] args) {


        UserRepository repository = new UserRepository();

        repository.addObserver((o, u) -> System.out.println("Enviando un email al usuario \""+u+"\""));
        repository.addObserver((o, u) -> System.out.println("Enviando un email al administrador"));
        repository.addObserver((o, u) -> System.out.println("Guardando info del usuario \""+u+"\" en el logs"));

        repository.createUser("Fredy");

    }
}
