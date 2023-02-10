package com.sugar.onlinestoreexample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sugar.onlinestoreexample.entity.ProductEntity;
import com.sugar.onlinestoreexample.exception.NotFoundException;
import com.sugar.onlinestoreexample.repository.ProductEntityRepository;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductEntityRepository productEntityRepository;

    @Override
    public List<ProductEntity> findAll() {

        return productEntityRepository.findAll();
    }

    @Override
    @SneakyThrows
    public ProductEntity findById(Integer id) {

        return productEntityRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Product not found"));
    }

}