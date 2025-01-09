package org.fmunera.java.jdbc.repository;

import org.fmunera.java.jdbc.model.Category;
import org.fmunera.java.jdbc.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements Repository<Category> {

    private Connection conn;

    public CategoryRepository() {
    }

    public CategoryRepository(Connection conn) {
        this.conn = conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Category> list() throws SQLException {

        List<Category> categories = new ArrayList<>();

        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from categories")){

            while(rs.next()){
                categories.add(createCategory(rs));

            }
        }

        return categories ;
    }

    @Override
    public Category searchById(Long id) throws SQLException {

        Category category = null;

        try (PreparedStatement stmt = conn.prepareStatement("select * from categories where id=?")){

            stmt.setLong(1, id);

            try(ResultSet rs = stmt.executeQuery()){

                if(rs.next()){
                    category = createCategory(rs);
                }
            }

        }
        return category;
    }

    @Override
    public Category save(Category category) throws SQLException {

        String sql = null;
        if (category.getId() != null && category.getId()>0){
            sql = "update categories set name=? where id=?";
        } else {
            sql = "insert into categories (name) values (?)";
        }

        try(PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){

            stmt.setString(1, category.getName());

            if (category.getId() != null && category.getId()>0){
                stmt.setLong(2, category.getId());
            }

            stmt.executeUpdate();

            if (category.getId() == null){
                try(ResultSet rs = stmt.getGeneratedKeys()){
                    if (rs.next()){
                        category.setId(rs.getLong(1));
                    }
                }
            }

            System.out.println("Categoría guardada con exito! -> id: "+category.getId()+"\n");
            return category;
        }
    }

    @Override
    public void delete(Long id) throws SQLException {

        try (PreparedStatement stmt = conn.prepareStatement("delete from categories where id=?")){

            stmt.setLong(1, id);
            stmt.executeUpdate();

            System.out.println("Registro eliminado exitosamente!");
        }
    }

    public Category createCategory(ResultSet rs) throws SQLException {
        Category category = new Category();
        category.setId(rs.getLong("id"));
        category.setName(rs.getString("name"));

        return category;
    }
}
