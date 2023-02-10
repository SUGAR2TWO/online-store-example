package com.sugar.onlinestoreexample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "purchase_item_table")
@Entity
@Data
public class PurchaseItemEntity extends BaseEntity{
    
    @Column
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;
}