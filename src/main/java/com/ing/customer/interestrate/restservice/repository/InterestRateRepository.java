package com.ing.customer.interestrate.restservice.repository;

import com.ing.customer.interestrate.restservice.entity.InterestRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestRateRepository extends JpaRepository<InterestRate, Long> {
    InterestRate findByCreditScore(String creditScore);
}
