package com.sugar.onlinestoreexample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sugar.onlinestoreexample.controller.dto.FinishPurchaseRequest;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PurchaseController {
    
    @PostMapping("/finishPurchase")
    public ResponseEntity finishPurchase(@Valid @RequestBody FinishPurchaseRequest request){
        log.info("handling finish purchase request: {}", request);
        return ResponseEntity.ok().build();
    }
}