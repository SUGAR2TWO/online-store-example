package com.sugar.onlinestoreexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sugar.onlinestoreexample.entity.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {

}