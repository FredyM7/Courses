package org.fmunera.java.jdbc.service;

import org.fmunera.java.jdbc.model.Category;
import org.fmunera.java.jdbc.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface Service {

    List<Product> listProducts() throws SQLException;

    Product searchProductById(Long id) throws SQLException;

    Product saveProduct(Product product) throws SQLException;

    void deleteProduct(Long id) throws SQLException;

    List<Category> listCategories() throws SQLException;

    Category searchCategoryById(Long id) throws SQLException;

    Category saveCategory(Category category) throws SQLException;

    void deleteCategory(Long id) throws SQLException;

    void saveProductWithCategory(Product product, Category category) throws SQLException;

}
