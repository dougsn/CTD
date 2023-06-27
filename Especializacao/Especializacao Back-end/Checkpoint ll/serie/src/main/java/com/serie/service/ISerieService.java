package com.serie.service;

import java.util.List;
import java.util.Optional;

public interface ISerieService<T> {
    List<T> findAll();
    Optional<T> add(T t);

}
