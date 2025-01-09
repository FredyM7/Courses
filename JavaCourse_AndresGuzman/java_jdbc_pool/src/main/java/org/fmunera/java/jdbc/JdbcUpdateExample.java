package org.fmunera.java.jdbc;

import org.fmunera.java.jdbc.model.Category;
import org.fmunera.java.jdbc.model.Product;
import org.fmunera.java.jdbc.repository.ProductRepository;
import org.fmunera.java.jdbc.repository.Repository;


public class JdbcUpdateExample {
    public static void main(String[] args) {


        Repository<Product> repository = new ProductRepository();

        System.out.println("================ LISTAR ==================");
        repository.list().forEach(System.out::println);

        System.out.println("================ OBTENER POR ID ==================");
        System.out.println(repository.searchById(2L));

        System.out.println("================ EDITAR PRODUCTO ==================");
        Product p1 = new Product(7L, "Teclado Corsair k95 mecánico", 700);
        Category category = new Category();
        category.setId(2L);
        p1.setCategory(category);

        repository.save(p1);
        repository.list().forEach(System.out::println);


    }
}
