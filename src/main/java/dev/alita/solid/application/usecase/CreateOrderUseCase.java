package dev.alita.solid.application.usecase;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import dev.alita.solid.application.dto.CreateOrderRequestDTO;
import dev.alita.solid.application.dto.CreateOrderResponseDTO;
import dev.alita.solid.application.service.DiscountService;
import dev.alita.solid.domain.entity.Customer;
import dev.alita.solid.domain.entity.Order;
import dev.alita.solid.domain.service.CustomerValidationService;
import dev.alita.solid.infrastructure.notification.EmailSender;
import dev.alita.solid.infrastructure.repository.CustomerRepository;
import dev.alita.solid.infrastructure.repository.OrderRepository;

@Service
public class CreateOrderUseCase {

    private final OrderRepository orderRepository;
    private final CustomerValidationService validationService;
    private final DiscountService discountService;
    private final EmailSender emailService;
    private final CustomerRepository customerRepository;


    public CreateOrderUseCase(OrderRepository orderRepository, CustomerValidationService validationService,
            DiscountService discountService, EmailSender emailService, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.validationService = validationService;
        this.discountService = discountService;
        this.emailService = emailService;
        this.customerRepository = customerRepository;
    }

    public CreateOrderResponseDTO execute(CreateOrderRequestDTO dto) {
        
       
        Customer customer = customerRepository.findById(dto.customerId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        validationService.validateCustomer(customer);

          Order order = new Order(customer, dto.total());

        BigDecimal discount = discountService.applyDiscount(order);
        order.setTotal(discount);

        Order savedOrder = orderRepository.save(order);

        emailService.sendEmail(savedOrder.getCustomer().getEmail(), "Hello " + savedOrder.getCustomer().getName() + ", " + "Your order has been processed successfully.");
        
        return new CreateOrderResponseDTO(savedOrder.getTotal(), "Order created successfully");
    }
}
