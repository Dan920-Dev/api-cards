package com.dan920dev.carsapi.repository;

import com.dan920dev.carsapi.models.entities.Categories;
import com.dan920dev.carsapi.models.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductsRepository extends JpaRepository<Products, Long>{
    // To use all methods of JPARepository
}
