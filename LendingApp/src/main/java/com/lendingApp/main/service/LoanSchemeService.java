package com.lendingApp.main.service;

import com.lendingApp.main.dto.LoanResponseDto;
import com.lendingApp.main.dto.LoanSchemeDto;

public interface LoanSchemeService {
LoanResponseDto findLoandById(Long id);
LoanResponseDto addLoanScheme(LoanSchemeDto loanSchemeDto);
}
