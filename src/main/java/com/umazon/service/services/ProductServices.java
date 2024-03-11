package com.umazon.service.services;

import com.umazon.service.entity.Product;
import com.umazon.service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
    	
        return productRepository.save(product);
    }

    public List<Product> createProductsList(List<Product> list) {
        return productRepository.saveAll(list);
    }

    public List<Product> getProductsList() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProductById(Product products) {
        Optional<Product> productsFound = productRepository.findById(products.getId());

        if (productsFound.isPresent()) {
            Product productsUpdate = productsFound.get();
            productsUpdate.setPname(products.getPname());
            productsUpdate.setPgroup(products.getPgroup());
            productsUpdate.setProdid(products.getProdid());

            return productRepository.save(products);
        } else {
            return null;
        }
    }

    public String deleteProductsById(int id) {
        productRepository.deleteById(id);
        return "Products "+ id +" deleted";
    }
}
