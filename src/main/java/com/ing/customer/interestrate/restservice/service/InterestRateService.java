package com.ing.customer.interestrate.restservice.service;

import com.ing.customer.interestrate.restservice.dto.InterestRateDTO;
import com.ing.customer.interestrate.restservice.entity.InterestRate;
import com.ing.customer.interestrate.restservice.repository.InterestRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterestRateService {

    @Autowired
    private InterestRateRepository interestRateRepository;

    public InterestRateDTO getInterestRates(String creditScore) {
        InterestRate interestRate = interestRateRepository.findByCreditScore(creditScore);
        InterestRateDTO interestRateDTO = new InterestRateDTO(creditScore, interestRate.getInterestRate());
        return interestRateDTO;
    }
}
