package com.du.folli.dio.controllers;

import com.du.folli.dio.dto.OrderDto;
import com.du.folli.dio.provider.api.StoreApi;
import org.springframework.http.ResponseEntity;

public class StoreController implements StoreApi {

    @Override
    public ResponseEntity<Void> deleteOrder(Long orderId) {
        return StoreApi.super.deleteOrder(orderId);
    }

    @Override
    public ResponseEntity<OrderDto> getOrderById(Long orderId) {
        return StoreApi.super.getOrderById(orderId);
    }

    @Override
    public ResponseEntity<OrderDto> placeOrder(OrderDto body) {
        return StoreApi.super.placeOrder(body);
    }
}
