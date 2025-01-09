package org.fmunera.java.jdbc;

import org.fmunera.java.jdbc.model.Category;
import org.fmunera.java.jdbc.model.Product;
import org.fmunera.java.jdbc.service.CatalogService;
import org.fmunera.java.jdbc.service.Service;

import java.sql.SQLException;
import java.util.Date;

public class JdbcExample {
    public static void main(String[] args) throws SQLException {

        Service service = new CatalogService();

        System.out.println("================ LISTAR PRODUCTOS ==================");
        service.listProducts().forEach(System.out::println);

        System.out.println("================ INSERTAR PRODUCTO CON CATEGORÍA ==================");
        Category category = new Category();
        category.setName("Iluminación");

        Product p1 = new Product("Lámpara led escritorio", 9900, new Date());
        p1.setSku("abcdx12345");

        service.saveProductWithCategory(p1, category);
        service.listProducts().forEach(System.out::println);



    }
}

