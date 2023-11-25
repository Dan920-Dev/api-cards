package com.dan920dev.carsapi.services.implementation;

import com.dan920dev.carsapi.models.entities.Products;
import com.dan920dev.carsapi.services.ProductsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImp implements ProductsService {

    @Override
    public List<Products> getAll() {
        return null;
    }

    @Override
    public Products findById() {
        return null;
    }
}
