package org.fmunera.patterns.singleton;

public class BDConnectionSingleton {

    private static BDConnectionSingleton instance;

    private BDConnectionSingleton() {
        System.out.println("***Conexión a algún motor de base de datos");
    }

    public static BDConnectionSingleton getInstance(){

        if(instance == null){
            instance = new BDConnectionSingleton();
        }
        return instance;
    }
}
