package dev.alita.solid.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;

import dev.alita.solid.domain.entity.Customer;

public interface CustomerRepository  extends CrudRepository<Customer, Long> {

}
