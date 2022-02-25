package com.tutorial.simplerest.controller;

import com.tutorial.simplerest.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private List<Product> products = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){
        products.add(product);
        return ResponseEntity.ok(product);
    }
}
