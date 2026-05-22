package dev.alita.solid.strategy;

import java.math.BigDecimal;

import dev.alita.solid.entity.enums.CustomerType;

public interface DiscountStrategy {
     boolean supports(CustomerType type);

    BigDecimal apply(BigDecimal total);
}
