package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    Iterable<Product> findAll();

    Product findById(long id);

    void save(Product product);

    void remove(Long id);
}
