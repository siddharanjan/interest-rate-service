package com.ing.customer.interestrate.restservice.entity;

import jakarta.persistence.*;

/**
 * The InterestRate class is an entity class that is used to store interest rate details in the database
 *
 *
 * @author Sid
 */
@Entity(name = "interest_rate")
public class InterestRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "credit_score_min")
    private String creditScore_min;

    @Column(name = "credit_score_max")
    private String creditScore_max;

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

    public String getCreditScore_min() {
        return creditScore_min;
    }

    public void setCreditScore_min(String creditScore_min) {
        this.creditScore_min = creditScore_min;
    }

    public String getCreditScore_max() {
        return creditScore_max;
    }

    public void setCreditScore_max(String creditScore_max) {
        this.creditScore_max = creditScore_max;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public InterestRate(Long id, String creditScore_min, String creditScore_max, double interestRate) {
        this.id = id;
        this.creditScore_min = creditScore_min;
        this.creditScore_max = creditScore_max;
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "InterestRate{" +
                "id=" + id +
                ", creditScore_min='" + creditScore_min + '\'' +
                ", creditScore_max='" + creditScore_max + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
