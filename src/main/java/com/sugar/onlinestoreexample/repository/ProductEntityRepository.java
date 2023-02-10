package com.sugar.onlinestoreexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sugar.onlinestoreexample.entity.ProductEntity;

public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer>{
    
}