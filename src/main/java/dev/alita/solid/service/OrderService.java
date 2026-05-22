package dev.alita.solid.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import dev.alita.solid.entity.Order;
import dev.alita.solid.repository.OrderRepository;
import dev.alita.solid.service.notification.EmailNotificationService;
import dev.alita.solid.service.notification.EmailSender;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final CustomerValidationService validationService;
    private final DiscountService discountService;
    private final EmailSender emailService;


    
    public OrderService(OrderRepository orderRepository, CustomerValidationService validationService,
            DiscountService discountService, EmailNotificationService emailService) {
        this.orderRepository = orderRepository;
        this.validationService = validationService;
        this.discountService = discountService;
        this.emailService = emailService;
    }



    public Order processOrder(Order order) {
        
        validationService.validateCustomer(order.getCustomer());

        BigDecimal discount = discountService.applyDiscount(order);
        order.setTotal(discount);

        Order savedOrder = orderRepository.save(order);

        emailService.sendEmail(savedOrder.getCustomer().getEmail(), "Hello " + savedOrder.getCustomer().getName() + ", " + "Your order has been processed successfully.");
        
        return savedOrder;
    }

   
}
