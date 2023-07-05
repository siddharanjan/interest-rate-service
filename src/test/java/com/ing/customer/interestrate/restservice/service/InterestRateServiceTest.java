package com.ing.customer.interestrate.restservice.service;

import com.ing.customer.interestrate.restservice.dto.InterestRateDTO;
import com.ing.customer.interestrate.restservice.entity.InterestRate;
import com.ing.customer.interestrate.restservice.repository.InterestRateRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class InterestRateServiceTest {

    @Mock
    private InterestRateRepository interestRateRepositoryMock;

    @InjectMocks
    private InterestRateService interestRateService;

    @Test
    public void getInterestRates_ReturnsInterestRateDTO() {
        // Arrange
        String creditScore = "750";
        InterestRate expectedRate = new InterestRate();
        expectedRate.setCreditScore(creditScore);
        expectedRate.setInterestRate(5.0);

        when(interestRateRepositoryMock.findByCreditScore(creditScore))
                .thenReturn(expectedRate);

        // Act
        InterestRateDTO actualDTO = interestRateService.getInterestRates(creditScore);

        // Assert
        assertEquals(creditScore, actualDTO.getCreditScore());
        assertEquals(expectedRate.getInterestRate(), actualDTO.getInterestRate());
    }
}
