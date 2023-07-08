package com.ing.customer.interestrate.restservice.controller;


import com.ing.customer.interestrate.restservice.dto.InterestRateDTO;
import com.ing.customer.interestrate.restservice.service.InterestRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The InterestRateController class is a REST controller that provides endpoints for
 * getting interest rates.
 *
 * @author Sid
 */
@RestController
@RequestMapping("/api/v1")
public class InterestRateController {

    @Autowired
    private InterestRateService interestRateService;

    /**
     * Gets the interest rate for a given credit score.
     *
     * @param creditScore The credit score of the customer.
     * @return A ResponseEntity object with the interest rate for the specified credit score.
     */
    @GetMapping("/interest-rates/{creditScore}")
    public ResponseEntity<InterestRateDTO> getInterestRate(@PathVariable String creditScore) {
        InterestRateDTO interestRateDTO = interestRateService.getInterestRates(creditScore);
        return new ResponseEntity<>(interestRateDTO, HttpStatus.OK);
    }



}
