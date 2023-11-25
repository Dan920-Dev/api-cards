package com.dan920dev.carsapi.repository;

import com.dan920dev.carsapi.models.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
