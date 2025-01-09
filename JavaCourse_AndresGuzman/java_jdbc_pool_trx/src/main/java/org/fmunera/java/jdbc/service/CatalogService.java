package org.fmunera.java.jdbc.service;

import org.fmunera.java.jdbc.model.Category;
import org.fmunera.java.jdbc.model.Product;
import org.fmunera.java.jdbc.repository.CategoryRepository;
import org.fmunera.java.jdbc.repository.ProductRepository;
import org.fmunera.java.jdbc.repository.Repository;
import org.fmunera.java.jdbc.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CatalogService implements Service{

    private Repository<Product> productRepository;
    private Repository<Category> categoryRepository;

    public CatalogService() {
        this.productRepository = new ProductRepository();
        this.categoryRepository = new CategoryRepository();
    }

    @Override
    public List<Product> listProducts() throws SQLException {

        try (Connection conn = DatabaseConnection.getConnection()){
            productRepository.setConn(conn);

            return productRepository.list();
        }

    }

    @Override
    public Product searchProductById(Long id) throws SQLException {

        try (Connection conn = DatabaseConnection.getConnection()){
            productRepository.setConn(conn);

            return productRepository.searchById(id);
        }

    }

    @Override
    public Product saveProduct(Product product) throws SQLException {

        try (Connection conn = DatabaseConnection.getConnection()){
            productRepository.setConn(conn);

            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }

            Product newProduct = null;
            try {

                newProduct = productRepository.save(product);
                conn.commit();
            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }

            return newProduct;
        }

    }

    @Override
    public void deleteProduct(Long id) throws SQLException {

        try (Connection conn = DatabaseConnection.getConnection()){
            productRepository.setConn(conn);

            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }

            try {

                productRepository.delete(id);
                conn.commit();
            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }

        }
    }

    @Override
    public List<Category> listCategories() throws SQLException {

        try (Connection conn = DatabaseConnection.getConnection()){
            categoryRepository.setConn(conn);
            return categoryRepository.list();
        }

    }

    @Override
    public Category searchCategoryById(Long id) throws SQLException {

        try (Connection conn = DatabaseConnection.getConnection()){
            categoryRepository.setConn(conn);

            return categoryRepository.searchById(id);
        }


    }

    @Override
    public Category saveCategory(Category category) throws SQLException {

        try (Connection conn = DatabaseConnection.getConnection()){
            categoryRepository.setConn(conn);

            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }

            Category newCategory = null;
            try {

                newCategory = categoryRepository.save(category);
                conn.commit();

            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }

            return newCategory;
        }


    }

    @Override
    public void deleteCategory(Long id) throws SQLException {

        try (Connection conn = DatabaseConnection.getConnection()){
            categoryRepository.setConn(conn);

            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }

            try {

                categoryRepository.delete(id);
                conn.commit();
            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void saveProductWithCategory(Product product, Category category) throws SQLException {

        try (Connection conn = DatabaseConnection.getConnection()){
            productRepository.setConn(conn);
            categoryRepository.setConn(conn);

            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }

            try {
                Category newCategory = categoryRepository.save(category);
                product.setCategory(newCategory);
                productRepository.save(product);

                conn.commit();
            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }
    }
}
