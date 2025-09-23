package com.lendingApp.main.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationResponse {
	private String status; // pending / approved / rejected
    private Double requestedAmount;
    private Integer requestedTenure;
    private Double totalLoanAmount;
    private LocalDateTime createdAt;
    private LoanResponseDto loanResponseDto;
    private List<InstallmentDto> installmentDtos;
}
