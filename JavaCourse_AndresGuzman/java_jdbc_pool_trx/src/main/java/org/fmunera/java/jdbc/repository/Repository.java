package org.fmunera.java.jdbc.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    void setConn(Connection conn);

    List<T> list() throws SQLException;

    T searchById(Long id) throws SQLException;

    T save(T t) throws SQLException;

    void delete(Long id) throws SQLException;
}
