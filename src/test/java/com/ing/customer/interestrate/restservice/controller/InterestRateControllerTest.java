package com.ing.customer.interestrate.restservice.controller;

import com.ing.customer.interestrate.restservice.dto.InterestRateDTO;
import com.ing.customer.interestrate.restservice.service.InterestRateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class InterestRateControllerTest {

    @Mock
    private InterestRateService interestRateService;

    @InjectMocks
    private InterestRateController interestRateController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getBestInterestRate_ReturnsInterestRateDTOWithHttpStatusOK() {
        // Arrange
        String creditScore = "700";
        double interestRate = 3.5;
        InterestRateDTO interestRateDTO = new InterestRateDTO(creditScore, interestRate);
        when(interestRateService.getInterestRates(creditScore)).thenReturn(interestRateDTO);

        // Act
        ResponseEntity<InterestRateDTO> response = interestRateController.getInterestRate(creditScore);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(interestRateDTO, response.getBody());
        verify(interestRateService, times(1)).getInterestRates(creditScore);
    }
}