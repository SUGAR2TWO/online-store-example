package com.sugar.onlinestoreexample.controller.dto;

import java.util.Map;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FinishPurchaseRequest {

    @NotNull
    private Map<Integer, Integer> productIdProductCount;

    @NotEmpty
    private String userName;

    private String userSurname;

    @NotEmpty
    private String email;

    @NotEmpty
    private String phone;

    @NotEmpty
    private String address;
    
    private String comment;

}