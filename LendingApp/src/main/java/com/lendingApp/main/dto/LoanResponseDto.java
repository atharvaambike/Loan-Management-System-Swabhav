package com.lendingApp.main.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanResponseDto {
    private Long loanSchemeId;
	private String loanName;
    private String loanType;
    private Double minLoanAmount;
    private Double maxLoanAmount;
    private Double interestRate;
    private Integer maxTenure;

    private Integer minAge;
    private Integer maxAge;
    private Double minIncome;
    private Boolean collateralRequired;
    private String otherConditions;

    private String installmentDurationType;
}
