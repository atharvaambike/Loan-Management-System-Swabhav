package com.lendingApp.main.service;

import java.util.List;

import com.lendingApp.main.dto.LoanResponseDto;
import com.lendingApp.main.dto.LoanSchemeDto;

public interface LoanSchemeService {
LoanResponseDto findLoandById(Long id);
LoanResponseDto addLoanScheme(LoanSchemeDto loanSchemeDto);
List<LoanResponseDto> getAllLoans();
List<LoanResponseDto> findLoanByLoanType(String loanType);
LoanResponseDto deactiveLoanScheme(Long loadId);
LoanResponseDto activateLoanScheme(Long loanId);
}
