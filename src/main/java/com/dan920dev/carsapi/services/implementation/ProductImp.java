package com.dan920dev.carsapi.services.implementation;

import com.dan920dev.carsapi.models.entities.Products;
import com.dan920dev.carsapi.repository.CategoriesRepository;
import com.dan920dev.carsapi.repository.ProductsRepository;
import com.dan920dev.carsapi.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImp implements ProductsService {

    @Autowired
    ProductsRepository productRp;

    @Override
    public List<Products> getAll() {
        return productRp.findAll();
    }

    @Override
    public Products findById(Long id) {
        Products product = productRp.findById(id).orElse(null);
        return product;
    }

    @Override
    public List<Products> findAllById(Long id) {
        List<Products> products = productRp.findAllByCategory(id);
        return  products;
    }
}
