package dev.alita.solid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.alita.solid.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
