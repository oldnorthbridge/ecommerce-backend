package com.zosh.service.impl;

import com.zosh.model.OrderItem;
import com.zosh.repository.OrderItemRepository;
import com.zosh.service.OrderItemService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Resource
    private OrderItemRepository orderItemRepository;

    @Override
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }
}
