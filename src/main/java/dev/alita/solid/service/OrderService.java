package dev.alita.solid.service;

import dev.alita.solid.entity.Order;

public class OrderService {

    public void criarOrder(Order order) {

        // validar cliente

        System.out.println("Validando cliente " + order.getCustomerName());

        // Lógica para criar um pedido
        System.out.println("Criando pedido para " + order.getCustomerName());

        // calcular desconto

        System.out.println("Calculando desconto para " + order.getCustomerName());

        // enviar email

        System.out.println("Enviando email para " + order.getCustomerName());

     
    }
}
