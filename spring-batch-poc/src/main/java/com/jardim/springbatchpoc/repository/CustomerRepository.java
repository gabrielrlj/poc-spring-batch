package com.jardim.springbatchpoc.repository;

import com.jardim.springbatchpoc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
