package com.ct.OrderService.service;

import com.ct.OrderService.model.OrderRequest;
import com.ct.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
