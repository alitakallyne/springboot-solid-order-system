package dev.alita.solid.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.alita.solid.domain.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
