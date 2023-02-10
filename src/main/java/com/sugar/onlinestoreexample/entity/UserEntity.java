package com.sugar.onlinestoreexample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Table(name = "user_table")
@Entity
@Data
@ToString(exclude = "password")
public class UserEntity extends BaseEntity {

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String password;

    @Column
    private String role;

    @Column
    private String address;

}