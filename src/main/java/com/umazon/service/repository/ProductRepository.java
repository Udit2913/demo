package com.umazon.service.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.umazon.service.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
