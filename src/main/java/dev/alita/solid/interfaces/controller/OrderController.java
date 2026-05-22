package dev.alita.solid.interfaces.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.alita.solid.application.dto.CreateOrderRequestDTO;
import dev.alita.solid.application.dto.CreateOrderResponseDTO;
import dev.alita.solid.application.usecase.CreateOrderUseCase;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final CreateOrderUseCase createOrderUseCase;

    public OrderController(CreateOrderUseCase createOrderUseCase) {
        this.createOrderUseCase = createOrderUseCase;
    }

    @PostMapping
    public CreateOrderResponseDTO createOrder(@RequestBody CreateOrderRequestDTO dto) {
        return createOrderUseCase.execute(dto);
    }
}
