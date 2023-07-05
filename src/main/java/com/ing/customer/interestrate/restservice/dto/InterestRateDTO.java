package com.ing.customer.interestrate.restservice.dto;

public class InterestRateDTO {

    private String creditScore;
    private double interestRate;

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public InterestRateDTO(String creditScore, double interestRate) {
        this.creditScore = creditScore;
        this.interestRate = interestRate;
    }
}
