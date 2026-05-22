package dev.alita.solid.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import dev.alita.solid.entity.Order;

@Service
public class DiscountService {

    public BigDecimal applyDiscount(Order order) {

        if(order.getCustomer().isVip()) {
            return order.getTotal().multiply(new BigDecimal("0.20")); // 20% discount for VIP customers
        }

        return order.getTotal();
    }
}
