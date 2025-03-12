package com.eazy_bank.eazy_bank.repositories;

import com.eazy_bank.eazy_bank.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
