package org.fmunera.java.jdbc.repository;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    List<T> list() throws SQLException;

    T searchById(Long id) throws SQLException;

    void save(T t) throws SQLException;

    void delete(Long id) throws SQLException;
}
