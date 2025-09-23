package com.lendingApp.main.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanSchemeDto {
	@NotBlank(message = "Loan name is required")
    private String loanName;

    @NotBlank(message = "Loan type is required")
    private String loanType;

    @NotNull(message = "Minimum loan amount is required")
    @Positive(message = "Minimum loan amount must be greater than zero")
    private Double minLoanAmount;

    @NotNull(message = "Maximum loan amount is required")
    @Positive(message = "Maximum loan amount must be greater than zero")
    private Double maxLoanAmount;

    @NotNull(message = "Interest rate is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Interest rate must be greater than 0")
    private Double interestRate;

    @NotNull(message = "Maximum tenure is required")
    @Positive(message = "Maximum tenure must be greater than zero")
    private Integer maxTenure;

    @NotNull(message = "Minimum age is required")
    @Min(value = 18, message = "Minimum age must be at least 18")
    private Integer minAge;

    @NotNull(message = "Maximum age is required")
    @Min(value = 18, message = "Maximum age must be at least 18")
    private Integer maxAge;

    @NotNull(message = "Minimum income is required")
    @PositiveOrZero(message = "Minimum income cannot be negative")
    private Double minIncome;

    @NotNull(message = "Collateral requirement must be specified")
    private Boolean collateralRequired;

    private String otherConditions;

    @NotBlank(message = "Installment duration type is required")
    private String installmentDurationType;
}
