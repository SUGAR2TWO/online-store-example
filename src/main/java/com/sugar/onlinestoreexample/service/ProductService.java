package com.sugar.onlinestoreexample.service;

import java.util.List;

import com.sugar.onlinestoreexample.entity.ProductEntity;

public interface ProductService {
    List<ProductEntity> findAll();

    ProductEntity findById(Integer id);
}