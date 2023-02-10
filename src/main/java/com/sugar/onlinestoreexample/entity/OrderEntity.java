package com.sugar.onlinestoreexample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "order_table")
@Entity
@Data
public class OrderEntity extends BaseEntity{

    @Column
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "purchase_item_id")
    private PurchaseItemEntity purchaseItemEntity;

}