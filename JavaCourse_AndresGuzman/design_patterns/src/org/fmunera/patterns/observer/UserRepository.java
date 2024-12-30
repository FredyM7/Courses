package org.fmunera.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class UserRepository extends Observable {

    private List<String> repository = new ArrayList<>();

    public void createUser(String user){
        this.repository.add(user);
        notifyObservers(user);

    }
}
