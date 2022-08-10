package com.sha.springbootproductstore.service;

import com.sha.springbootproductstore.model.Purchase;
import com.sha.springbootproductstore.model.User;
import com.sha.springbootproductstore.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseOfUser(Long id);
}
