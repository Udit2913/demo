package com.umazon.service.controller;

import com.umazon.service.entity.Product;
import com.umazon.service.services.ProductServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")//this is the base url for api.but if you don't want to use this kind of url you can avoid this line
//so this api will be accessible from http://localhost:8080/

@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductServices services;

    @GetMapping("/products")//you can give this any name you want and after adding this string to the end of base url you can use this
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(services.getProductsList());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.services.getProductById(id));
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok(this.services.createProduct(product));
    }

    @PostMapping("/addProducts")
    public ResponseEntity<List<Product>> addProducts(@RequestBody List<Product> list) {
        return ResponseEntity.ok(this.services.createProductsList(list));
    }

    @PutMapping("/updateProduct/")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        return ResponseEntity.ok().body(this.services.updateProductById(product));
    }

    @DeleteMapping("/deleteProduct/{id}")
    public HttpStatus deleteProduct(@PathVariable int id) {
        this.services.deleteProductsById(id);
        return HttpStatus.OK;
    }
}
