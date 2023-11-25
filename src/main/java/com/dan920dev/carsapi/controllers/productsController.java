package com.dan920dev.carsapi.controllers;

import com.dan920dev.carsapi.models.dtos.CategoryDTO;
import com.dan920dev.carsapi.models.dtos.ProductDTO;
import com.dan920dev.carsapi.models.entities.Categories;
import com.dan920dev.carsapi.models.entities.Products;
import com.dan920dev.carsapi.services.CategoryService;
import com.dan920dev.carsapi.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/MARKET/cars/")
public class productsController {

    @Autowired
    ProductsService productsSv;

    @GetMapping("all")
    public ResponseEntity<?> getAllProducts(){
        try{
            List<Products> products = productsSv.getAll();

            List<ProductDTO> response = products.stream()
                    .map(product -> new ProductDTO(product.getId(), product.getProNombre(), product.getProDescripcion(), product.getProPrecio(), product.getEstado(), product.getCategoria().getNombre()))
                    .toList();
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }catch (Exception e){

            e.printStackTrace();
            return new ResponseEntity<>("Error processing products data", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("detail/{id}")
    public ResponseEntity<?> getProductDetail(){
        try{
            List<Products> response = new ArrayList<>();


            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }catch (Exception e){

            e.printStackTrace();
            return new ResponseEntity<>("Error processing product data", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("products/category/{id}")
    public ResponseEntity<?> getAllProductsByCategory(){
        try{
            List<Products> response = new ArrayList<>();


            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }catch (Exception e){

            e.printStackTrace();
            return new ResponseEntity<>("Error processing products data", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
