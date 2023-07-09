package com.ing.customer.interestrate.restservice.service;

import com.ing.customer.interestrate.restservice.dto.InterestRateDTO;
import com.ing.customer.interestrate.restservice.entity.InterestRate;
import com.ing.customer.interestrate.restservice.repository.InterestRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The InterestRateService class is a service class between the controller and repository interface
 * to retrieve interest rate details
 *
 * @author Sid
 */
@Service
public class InterestRateService {

    @Autowired
    private InterestRateRepository interestRateRepository;

    /**
     * Retrieve customer details from the repository
     *
     * @param creditScore The credit score of the customer.
     * @return A InterestRateDTO object with the interest rate details.
     */
    public InterestRateDTO getInterestRates(String creditScore) {
        InterestRate interestRate = interestRateRepository.findByCreditScore(creditScore);
        InterestRateDTO interestRateDTO = new InterestRateDTO(creditScore, interestRate.getInterestRate());
        return interestRateDTO;
    }
}
