package org.fmunera.java.jdbc.repository;

import java.util.List;

public interface Repository<T> {

    List<T> list();

    T searchById(Long id);

    void save(T t);

    void delete(Long id);
}
