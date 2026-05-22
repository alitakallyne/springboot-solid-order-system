package dev.alita.solid.service;

import org.springframework.stereotype.Service;

import dev.alita.solid.entity.Customer;

@Service
public class CustomerValidationService {

    public void  validateCustomer(Customer customer) {
       
        if (customer.getName() == null || customer.getName().isEmpty()) {
            throw new IllegalArgumentException("Clinete Inválido");
        }
       
    }
}
