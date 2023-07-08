package com.ing.customer.interestrate.restservice.service;

import com.ing.customer.interestrate.restservice.dto.InterestRateDTO;
import com.ing.customer.interestrate.restservice.entity.InterestRate;
import com.ing.customer.interestrate.restservice.repository.InterestRateRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class InterestRateServiceTest {

    @Mock
    private InterestRateRepository interestRateRepository;

    @InjectMocks
    private InterestRateService interestRateService;

    @Test
    void getInterestRates_withValidCreditScore_shouldReturnInterestRateDTO() {
        String creditScore = "750";
        InterestRate interestRate = new InterestRate(3L,"700", "799",  3.5);
        when(interestRateRepository.findByCreditScore(creditScore)).thenReturn(interestRate);

        InterestRateDTO interestRateDTO = interestRateService.getInterestRates(creditScore);

        assertEquals(creditScore, interestRateDTO.getCreditScore());
        assertEquals(3.5, interestRateDTO.getInterestRate());
    }
}
