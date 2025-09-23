package com.lendingApp.main.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanScheme {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    private String installmentDurationType; // monthly/quarterly/yearly

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "loanRequirement", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Application> applications;
}
