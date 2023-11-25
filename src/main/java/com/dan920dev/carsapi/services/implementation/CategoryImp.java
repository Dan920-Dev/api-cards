package com.dan920dev.carsapi.services.implementation;

import com.dan920dev.carsapi.models.entities.Categories;
import com.dan920dev.carsapi.repository.CategoriesRepository;
import com.dan920dev.carsapi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImp implements CategoryService{
    @Autowired
    CategoriesRepository categoryRp;

    @Override
    public List<Categories> getAll() {
        return categoryRp.findAll();
    }



}
