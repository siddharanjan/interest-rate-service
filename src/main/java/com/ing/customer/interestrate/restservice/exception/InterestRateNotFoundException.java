package com.ing.customer.interestrate.restservice.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InterestRateNotFoundException extends EmptyResultDataAccessException {

    private static final String MESSAGE = "Interest Rate not found for the credit score";

    public InterestRateNotFoundException() {
        super(MESSAGE,1);
    }

    public InterestRateNotFoundException(String message) {
        super(message,1);
    }
}
