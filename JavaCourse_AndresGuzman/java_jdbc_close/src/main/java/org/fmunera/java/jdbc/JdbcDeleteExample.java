package org.fmunera.java.jdbc;

import org.fmunera.java.jdbc.model.Product;
import org.fmunera.java.jdbc.repository.ProductRepository;
import org.fmunera.java.jdbc.repository.Repository;
import org.fmunera.java.jdbc.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcDeleteExample {
    public static void main(String[] args) {


        Repository<Product> repository = new ProductRepository();

        System.out.println("================ LISTAR ==================");
        repository.list().forEach(System.out::println);

        System.out.println("================ OBTENER POR ID ==================");
        System.out.println(repository.searchById(2L));

        System.out.println("================ ELIMINAR PRODUCTO ==================");
        repository.delete(5L);
        repository.list().forEach(System.out::println);

    }
}
