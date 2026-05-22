package dev.alita.solid.application.dto;

import java.math.BigDecimal;

public record CreateOrderResponseDTO(
    BigDecimal total,
    String status
) {

}
