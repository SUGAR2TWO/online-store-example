package com.sugar.onlinestoreexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sugar.onlinestoreexample.entity.PurchaseItemEntity;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItemEntity, Integer>{
    
}