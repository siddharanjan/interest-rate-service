package com.ing.customer.interestrate.restservice.repository;

import com.ing.customer.interestrate.restservice.entity.InterestRate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InterestRateRepositoryTest {

    @Autowired
    private InterestRateRepository interestRateRepository;

    @Test
    void findByCreditScore() {
        InterestRate interestRate = interestRateRepository.findByCreditScore("750");
        assertEquals("700", interestRate.getCreditScore_min());
        assertEquals("799", interestRate.getCreditScore_max());
        assertEquals(3.5, interestRate.getInterestRate());
    }
}
