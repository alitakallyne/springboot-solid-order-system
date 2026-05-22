package dev.alita.solid.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.alita.solid.entity.Order;
import dev.alita.solid.strategy.DiscountStrategy;

@Service
public class DiscountService {

    private final List<DiscountStrategy> discountStrategies;

    public DiscountService(List<DiscountStrategy> discountStrategies) {
        this.discountStrategies = discountStrategies;
    }

    public BigDecimal applyDiscount(Order order) {

        return discountStrategies.stream()
                .filter(strategy -> strategy.supports(order.getCustomer().getType()))
                .findFirst()
                .map(strategy -> strategy.apply(order.getTotal()))
                .orElse(order.getTotal());

        
    }
}
