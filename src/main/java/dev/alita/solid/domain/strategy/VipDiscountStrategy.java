package dev.alita.solid.domain.strategy;

import java.math.BigDecimal;

import dev.alita.solid.domain.entity.enums.CustomerType;

public class VipDiscountStrategy implements DiscountStrategy {

    @Override
    public boolean supports(CustomerType type) {
        return type == CustomerType.VIP;
    }

    @Override
    public BigDecimal apply(BigDecimal total) {
        // Apply a 10% discount for VIP customers
        return total.multiply(BigDecimal.valueOf(0.9));
    }

    
}
