package com.ing.customer.interestrate.restservice.entity;

import jakarta.persistence.*;

@Entity(name = "interest_rate")
public class InterestRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "credit_score")
    private String creditScore;

    @Column(name = "interest_rate")
    private double interestRate;

    public InterestRate() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public InterestRate(Long id, String creditScore, double interestRate) {
        this.id = id;
        this.creditScore = creditScore;
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "InterestRate{" +
                "id=" + id +
                ", creditScore='" + creditScore + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
