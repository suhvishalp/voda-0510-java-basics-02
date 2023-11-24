package com.ct.PaymentService.service;

import com.ct.PaymentService.model.PaymentRequest;
import com.ct.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
