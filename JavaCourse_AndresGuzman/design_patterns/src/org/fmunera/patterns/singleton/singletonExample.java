package org.fmunera.patterns.singleton;

public class singletonExample {
    public static void main(String[] args) {

        BDConnectionSingleton connection = null;

        for(int i = 0; i < 10; i++){
            connection = BDConnectionSingleton.getInstance();
            System.out.println("connection = " + connection);
        }

        BDConnectionSingleton connection2 = BDConnectionSingleton.getInstance();
        BDConnectionSingleton connection3 = BDConnectionSingleton.getInstance();

        boolean b = (connection == connection2) && (connection==connection3);
        System.out.println("b = " + b);

    }
}
