package com.dan920dev.carsapi.services;

import com.dan920dev.carsapi.models.entities.Products;

import java.util.List;

public interface ProductsService {
    List<Products> getAll();
    Products findById(Long id);

    List<Products> findAllById(Long id);
}
