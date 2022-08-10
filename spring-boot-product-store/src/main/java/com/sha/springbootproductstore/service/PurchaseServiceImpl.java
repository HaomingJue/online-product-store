package com.sha.springbootproductstore.service;

import com.sha.springbootproductstore.model.Purchase;
import com.sha.springbootproductstore.repository.PurchaseRepository;
import com.sha.springbootproductstore.repository.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseOfUser(Long userId) {
        return purchaseRepository.findAllByPurchaseOfUser(userId);
    }
}
