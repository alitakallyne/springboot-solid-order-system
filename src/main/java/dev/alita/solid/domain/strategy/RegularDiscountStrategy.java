package dev.alita.solid.domain.strategy;

import java.math.BigDecimal;

import dev.alita.solid.domain.entity.enums.CustomerType;

public class RegularDiscountStrategy implements DiscountStrategy {

    @Override
    public boolean supports(CustomerType type) {
        return type == CustomerType.REGULAR;
    }

    @Override
    public BigDecimal apply(BigDecimal total) {
        // No discount for regular customers
        return total;
    }

}
     
    

