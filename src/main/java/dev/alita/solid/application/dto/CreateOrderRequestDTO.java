package dev.alita.solid.application.dto;

import java.math.BigDecimal;

public record CreateOrderRequestDTO(
    Long customerId,
    BigDecimal total
) {

}
