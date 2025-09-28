package com.lendingApp.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendingApp.main.entity.LoanScheme;

public interface LoanSchemeRepository extends JpaRepository<LoanScheme,Long>{
    List<LoanScheme> findByLoanType(String loanType);
}
