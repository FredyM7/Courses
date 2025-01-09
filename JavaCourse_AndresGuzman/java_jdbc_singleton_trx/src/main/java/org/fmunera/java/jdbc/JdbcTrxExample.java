package org.fmunera.java.jdbc;

import org.fmunera.java.jdbc.model.Category;
import org.fmunera.java.jdbc.model.Product;
import org.fmunera.java.jdbc.repository.ProductRepository;
import org.fmunera.java.jdbc.repository.Repository;
import org.fmunera.java.jdbc.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class JdbcTrxExample {
    public static void main(String[] args) throws SQLException {


        try (Connection conn = DatabaseConnection.getInstance()){

            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }

            try {


                Repository<Product> repository = new ProductRepository();

                System.out.println("================ LISTAR ==================");
                repository.list().forEach(System.out::println);

                System.out.println("================ OBTENER POR ID ==================");
                System.out.println(repository.searchById(2L));

                System.out.println("================ INSERTAR NUEVO PRODUCTO ==================");
                Product p1 = new Product("Teclado IBM mecánico", 550, new Date());

                Category category = new Category();
                category.setId(3L);

                p1.setCategory(category);
                p1.setSku("abcde12345");
                repository.save(p1);
                repository.list().forEach(System.out::println);

                System.out.println("================ EDITAR PRODUCTO ==================");
                p1 = new Product(7L, "Teclado Corsair k95 mecánico", 1000);
                category = new Category();
                category.setId(2L);
                p1.setCategory(category);
                p1.setSku("abcd123456"); //La transacción falla, ya que este sku ya existe en un registro (sku es UNIQUE).

                repository.save(p1);
                repository.list().forEach(System.out::println);

                conn.commit();
            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }

        }
    }
}
