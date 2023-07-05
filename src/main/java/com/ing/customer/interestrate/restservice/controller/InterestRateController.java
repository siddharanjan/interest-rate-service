package com.ing.customer.interestrate.restservice.controller;


import com.ing.customer.interestrate.restservice.dto.InterestRateDTO;
import com.ing.customer.interestrate.restservice.service.InterestRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterestRateController {

    @Autowired
    private InterestRateService interestRateService;

    @GetMapping("/{creditScore}")
    public ResponseEntity<InterestRateDTO> getBestInterestRate(@PathVariable String creditScore) {
        InterestRateDTO interestRateDTO = interestRateService.getInterestRates(creditScore);
        return new ResponseEntity<>(interestRateDTO, HttpStatus.OK);
    }



}
