package org.fmunera.java8.lambda;

import org.fmunera.java8.lambda.models.User;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {


        Predicate<Integer> f1 = num -> num%2 == 0;
        System.out.println("f1.test(10) = " + f1.test(10));

        Predicate<String> f2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("f2.test(\"ROLE_USER\") = " + f2.test("ROLE_USER"));
        
        BiPredicate<String, String> f3 = String::equals; //(a, b) -> a.equals(b);
        System.out.println("f3.test(\"hola\", \"hola\") = " + f3.test("hola", "hola"));

        BiPredicate<Integer, Integer> f4 = (i,j) -> j > i;
        System.out.println("f4.test(5,10) = " + f4.test(5,10));

        User a = new User();
        User b = new User();
        a.setName("maria");
        b.setName("carlos");

        BiPredicate<User, User> f5 = (ua, ub) -> ua.getName().equals(ub.getName());
        System.out.println("f5.test(a,b) = " + f5.test(a,b));



    }
}
