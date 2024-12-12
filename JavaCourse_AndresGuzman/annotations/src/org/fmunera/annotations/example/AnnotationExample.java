package org.fmunera.annotations.example;

import org.fmunera.annotations.example.models.Product;
import org.fmunera.annotations.example.processor.JsonSerializer;

import java.time.LocalDate;

public class AnnotationExample {
    public static void main(String[] args) {


        Product p = new Product();
        p.setName("mesa CENTRO roble");
        p.setDate(LocalDate.now());
        p.setPrice(1000L);

        System.out.println(JsonSerializer.convertToJson(p));


    }
}
