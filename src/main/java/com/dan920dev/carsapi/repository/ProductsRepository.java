package com.dan920dev.carsapi.repository;


import com.dan920dev.carsapi.models.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProductsRepository extends JpaRepository<Products, Long>{
    @Query("SELECT u FROM Products u WHERE u.categoria.cat_id = :categoriaId")
    List<Products> findAllByCategory(@Param("categoriaId") Long id);
}
