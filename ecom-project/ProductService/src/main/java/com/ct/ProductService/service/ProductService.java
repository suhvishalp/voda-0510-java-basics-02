package com.ct.ProductService.service;

import com.ct.ProductService.model.ProductRequest;
import com.ct.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
