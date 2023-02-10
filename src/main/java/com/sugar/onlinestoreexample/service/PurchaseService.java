package com.sugar.onlinestoreexample.service;

import com.sugar.onlinestoreexample.controller.dto.FinishPurchaseRequest;

public interface PurchaseService {
    
    Integer finishPurchase(FinishPurchaseRequest request);
}