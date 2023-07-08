package com.ing.customer.interestrate.restservice.repository;

import com.ing.customer.interestrate.restservice.entity.InterestRate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InterestRateRowMapper implements RowMapper<InterestRate> {

    @Override
    public InterestRate mapRow(ResultSet rs, int rowNum) throws SQLException {
        InterestRate interestRate = new InterestRate();
        interestRate.setId(rs.getLong("id"));
        interestRate.setCreditScore_min(rs.getString("credit_score_min"));
        interestRate.setCreditScore_max(rs.getString("credit_score_max"));
        interestRate.setInterestRate(rs.getDouble("interest_rate"));
        return interestRate;
    }
}