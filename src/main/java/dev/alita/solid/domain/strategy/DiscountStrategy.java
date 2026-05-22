package dev.alita.solid.domain.strategy;

import java.math.BigDecimal;

import dev.alita.solid.domain.entity.enums.CustomerType;

public interface DiscountStrategy {
     boolean supports(CustomerType type);

    BigDecimal apply(BigDecimal total);
}
