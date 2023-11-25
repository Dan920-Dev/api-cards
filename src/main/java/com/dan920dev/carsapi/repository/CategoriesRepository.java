package com.dan920dev.carsapi.repository;

import com.dan920dev.carsapi.models.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriesRepository extends JpaRepository<Categories, Long> {
    // To use all methods of JPARepository
}
