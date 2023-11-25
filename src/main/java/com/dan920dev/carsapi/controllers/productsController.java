package com.dan920dev.carsapi.controllers;

import com.dan920dev.carsapi.models.dtos.ProductDTO;
import com.dan920dev.carsapi.models.entities.Products;
import com.dan920dev.carsapi.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/MARKET/")
public class productsController {

    @Autowired
    ProductsService productsSv;

    @GetMapping("all")
    public ResponseEntity<?> getAllProducts(){
        try{
            List<Products> products = productsSv.getAll();

            List<ProductDTO> response = products.stream()
                    .map(product -> new ProductDTO(product.getId(), product.getProNombre(), product.getProDescripcion(), product.getProPrecio(), product.getImagen(), product.getEstado(), product.getCategoria().getNombre()))
                    .toList();
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }catch (Exception e){

            e.printStackTrace();
            return new ResponseEntity<>("Error processing products data", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("detail/{id}")
    public ResponseEntity<?> getProductDetail(@PathVariable Long id){
        try{
            Products product = productsSv.findById(id);
            ProductDTO response = new ProductDTO(product.getId(), product.getProNombre(), product.getProDescripcion(), product.getProPrecio(), product.getImagen(), product.getEstado(), product.getCategoria().getNombre() );

            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }catch (Exception e){

            e.printStackTrace();
            return new ResponseEntity<>("Error processing product data", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("products/category/{id}")
    public ResponseEntity<?> getAllProductsByCategory(@PathVariable Long id){
        try{
            List<Products> products = productsSv.findAllById(id);

            List<ProductDTO> response = products.stream()
                    .map(product -> new ProductDTO(product.getId(), product.getProNombre(), product.getProDescripcion(), product.getProPrecio(), product.getImagen(), product.getEstado(), product.getCategoria().getNombre()))
                    .toList();

            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }catch (Exception e){

            e.printStackTrace();
            return new ResponseEntity<>("Error processing products data", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
