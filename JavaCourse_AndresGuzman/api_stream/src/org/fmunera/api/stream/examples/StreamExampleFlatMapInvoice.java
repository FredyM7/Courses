package org.fmunera.api.stream.examples;

import org.fmunera.api.stream.examples.models.Invoice;
import org.fmunera.api.stream.examples.models.User;

import java.util.Arrays;
import java.util.List;

public class StreamExampleFlatMapInvoice {
    public static void main(String[] args) {

        User user1 = new User("Fredy","Munera");
        User user2 = new User("Daniel","Medina");

        user1.addInvoice(new Invoice("Compras tecnologicas"))
             .addInvoice(new Invoice("Compras muebles"));

        user2.addInvoice(new Invoice("Bicicleta"))
             .addInvoice(new Invoice("Notebook gamer"));

        List<User> users = Arrays.asList(user1, user2);

        users.stream().flatMap(u -> u.getInvoices().stream())
                .forEach(invoice -> System.out.println(invoice.getUser().toString().concat(" => ").concat(invoice.getDetails())));


        //Imperative Form
        /*System.out.println();
        for(User user: users){
            for(Invoice invoice: user.getInvoices()){
                System.out.println(user.getName()+" => "+invoice.getDetails());
            }
        }*/
    }
}
