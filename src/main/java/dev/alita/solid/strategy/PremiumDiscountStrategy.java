package dev.alita.solid.strategy;

import java.math.BigDecimal;

import dev.alita.solid.entity.enums.CustomerType;

public class PremiumDiscountStrategy implements DiscountStrategy {


    @Override
    public boolean supports(CustomerType type) {
        return type == CustomerType.PREMIUM;
    }

    @Override
    public BigDecimal apply(BigDecimal total) {
        // Apply a 20% discount for premium customers
        return total.multiply(BigDecimal.valueOf(0.8));
       
    }

}
