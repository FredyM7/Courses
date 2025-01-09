package org.fmunera.java.jdbc.repository;

import org.fmunera.java.jdbc.model.Category;
import org.fmunera.java.jdbc.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product> {


    private Connection conn;

    public ProductRepository() {
    }

    public ProductRepository(Connection conn) {
        this.conn = conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Product> list() throws SQLException {
        List<Product> products = new ArrayList<>();

        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select p.*, c.name as category from products as p " +
                    "inner join categories as c on(p.category_id=c.id)")){

            while(rs.next()){
                products.add(createProduct(rs));
            }

        }

        return products;
    }

    @Override
    public Product searchById(Long id) throws SQLException {
        Product product = null;

        try(PreparedStatement stmt = conn.prepareStatement("select p.*, c.name as category from products as p " +
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
    public Product save(Product product) throws SQLException {

        String sql;
        if (product.getId() != null && product.getId()>0) {
            sql = "update products set name=?, price=?, category_id=?, sku=? where id=?";
        } else {
            sql = "insert into products (name, price, category_id, sku, date_registered) values(?, ?, ?, ?, ?)";
        }

        try(PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){

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

            if (product.getId() == null){
                try (ResultSet rs = stmt.getGeneratedKeys()){
                    if (rs.next()){
                        product.setId(rs.getLong(1));
                    }
                }
            }

            System.out.println("Producto guardado con exito! -> id: "+product.getId()+"\n");
            return product;
        }

    }

    @Override
    public void delete(Long id) throws SQLException {

        try(PreparedStatement stmt = conn.prepareStatement("delete from products where id=?")){
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
