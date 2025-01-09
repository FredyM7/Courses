package org.fmunera.java.jdbc.repository;

import org.fmunera.java.jdbc.model.Category;
import org.fmunera.java.jdbc.model.Product;
import org.fmunera.java.jdbc.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product> {


    private Connection getConnection() throws SQLException {
        return DatabaseConnection.getInstance();
    }

    @Override
    public List<Product> list() throws SQLException {
        List<Product> products = new ArrayList<>();

        try(Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select p.*, c.name as category from products as p " +
                    "inner join categories as c on(p.category_id=c.id)")){

            while(rs.next()){
                Product product = createProduct(rs);

                products.add(product);
            }

        }

        return products;
    }

    @Override
    public Product searchById(Long id) throws SQLException {
        Product product = new Product();

        try(PreparedStatement stmt = getConnection().prepareStatement("select p.*, c.name as category from products as p " +
                "inner join categories as c on(p.category_id=c.id) where p.id=?")){

            stmt.setLong(1, id);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    product = createProduct(rs);
                }
            }

        }

        return product;
    }

    @Override
    public void save(Product product) throws SQLException {

        String sql;
        if (product.getId() != null && product.getId()>0) {
            sql = "update products set name=?, price=?, category_id=?, sku=? where id=?";
        } else {
            sql = "insert into products (name, price, category_id, sku, date_registered) values(?, ?, ?, ?, ?)";
        }

        try(PreparedStatement stmt = getConnection().prepareStatement(sql)){

            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getPrice());
            stmt.setLong(3, product.getCategory().getId());
            stmt.setString(4, product.getSku());

            if (product.getId() != null && product.getId()>0) {
                stmt.setLong(5, product.getId());
            } else {
                stmt.setDate(5, new Date(product.getDateRegistered().getTime()));

            }

            stmt.executeUpdate();

            System.out.println("Registro exitoso!\n");
        }
    }

    @Override
    public void delete(Long id) throws SQLException {

        try(PreparedStatement stmt = getConnection().prepareStatement("delete from products where id=?")){
            stmt.setLong(1, id);

            stmt.executeUpdate();

            System.out.println("Registro eliminado exitosamente!");
        }
    }

    private static Product createProduct(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setId(rs.getLong("id"));
        product.setName(rs.getString("name"));
        product.setPrice(rs.getInt("price"));
        product.setDateRegistered(rs.getDate("date_registered"));
        product.setSku(rs.getString("sku"));

        Category category = new Category();
        category.setId(rs.getLong("category_id"));
        category.setName(rs.getString("category"));

        product.setCategory(category);

        return product;
    }
}
