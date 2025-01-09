package org.fmunera.java.jdbc;

import org.fmunera.java.jdbc.model.Category;
import org.fmunera.java.jdbc.model.Product;
import org.fmunera.java.jdbc.repository.ProductRepository;
import org.fmunera.java.jdbc.repository.Repository;

import java.util.Date;

public class JdbcExample {
    public static void main(String[] args) {


        Repository<Product> repository = new ProductRepository();

        System.out.println("================ LISTAR ==================");
        repository.list().forEach(System.out::println);

        System.out.println("================ OBTENER POR ID ==================");
        System.out.println(repository.searchById(2L));

        System.out.println("================ INSERTAR NUEVO PRODUCTO ==================");
        Product p1 = new Product("Teclado Razer mecánico", 550, new Date());

        Category category = new Category();
        category.setId(3L);

        p1.setCategory(category);
        //repository.save(p1);
        repository.list().forEach(System.out::println);

    }
}
