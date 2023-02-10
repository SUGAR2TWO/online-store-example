package com.sugar.onlinestoreexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sugar.onlinestoreexample.entity.OrderEntity;

public interface OrderEntityRepository extends JpaRepository<OrderEntity, Integer>{
    
}