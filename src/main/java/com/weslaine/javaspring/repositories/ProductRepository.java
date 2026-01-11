package com.weslaine.javaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslaine.javaspring.models.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
    
}
