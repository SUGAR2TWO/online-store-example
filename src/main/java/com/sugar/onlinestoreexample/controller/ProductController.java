package com.sugar.onlinestoreexample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sugar.onlinestoreexample.entity.ProductEntity;
import com.sugar.onlinestoreexample.service.ProductService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductEntity> getAllProducts(){
        log.info("handling get all products request");
        return productService.findAll();
    }

    @GetMapping("/product/{id}")
    public ProductEntity findById(@PathVariable Integer id){
        log.info("handling get product by id");
        return productService.findById(id);
    }
}