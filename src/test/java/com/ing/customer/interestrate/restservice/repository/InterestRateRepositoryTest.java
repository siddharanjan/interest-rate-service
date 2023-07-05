package com.ing.customer.interestrate.restservice.repository;

import com.ing.customer.interestrate.restservice.entity.InterestRate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ActiveProfiles("test")
public class InterestRateRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private InterestRateRepository interestRateRepository;

    @Test
    public void findByCreditScore_ReturnsInterestRate() {
        // Arrange
        String creditScore = "750";
        InterestRate expectedRate = new InterestRate();
        expectedRate.setCreditScore(creditScore);
        expectedRate.setInterestRate(5.0);
        entityManager.persist(expectedRate);
        entityManager.flush();

        // Act
        InterestRate actualRate = interestRateRepository.findByCreditScore(creditScore);

        // Assert
        assertEquals(expectedRate, actualRate);
    }
}
