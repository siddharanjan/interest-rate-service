package com.ing.customer.interestrate.restservice.repository;

import com.ing.customer.interestrate.restservice.entity.InterestRate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A `RowMapper` class that maps a row from a `ResultSet` object to an `InterestRate` object.
 *
 * @author Sid
 */
public class InterestRateRowMapper implements RowMapper<InterestRate> {

    /**
     * Maps a row from a `ResultSet` object to an `InterestRate` object.
     *
     * @param rs The `ResultSet` object to map.
     * @param rowNum The row number of the `ResultSet` object.
     * @return The `InterestRate` object that was mapped.
     * @throws SQLException If an error occurs while mapping the row.
     */
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