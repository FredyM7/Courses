package org.fmunera.optional.example.repository;

import java.util.Optional;

public interface Repository<T> {

    Optional<T> filter(String brand);
}
