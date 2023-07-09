package com.ing.customer.interestrate.restservice.repository;

import com.ing.customer.interestrate.restservice.entity.InterestRate;
import com.ing.customer.interestrate.restservice.exception.InterestRateNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The InterestRateRepository class is a repository class that provides access to the interest rate
 * data in the database.
 *
 * @author Sid
 */
@Repository
public class InterestRateRepository {

    private JdbcTemplate jdbcTemplate;

    public InterestRateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    
    public InterestRate findByCreditScore(String creditScore) {
        String sql = "SELECT * FROM interest_rate WHERE credit_score_min <= ? AND credit_score_max >= ?";
        Object[] params = {creditScore, creditScore};
        try {
            InterestRate interestRate = jdbcTemplate.queryForObject(sql, params, new InterestRateRowMapper());
            if (interestRate == null) {
                throw new EmptyResultDataAccessException(1);
            }
            return interestRate;
        } catch (EmptyResultDataAccessException e) {
            throw new InterestRateNotFoundException();
        }
    }
}

