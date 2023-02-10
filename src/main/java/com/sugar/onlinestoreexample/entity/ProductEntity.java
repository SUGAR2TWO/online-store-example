package com.sugar.onlinestoreexample.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "product_table")
@Entity
@Data
public class ProductEntity extends BaseEntity {

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String image;

    @Column
    private BigDecimal price;

}