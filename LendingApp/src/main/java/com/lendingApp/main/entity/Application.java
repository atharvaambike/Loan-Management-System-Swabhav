package com.lendingApp.main.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    private String status; // pending / approved / rejected
    private Double requestedAmount;
    private Integer requestedTenure;
    private Double totalLoanAmount;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "loan_requirement_id", nullable = false)
    private LoanScheme loanRequirement;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

//    @OneToMany(mappedBy = "application", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Documents> documents;
//
//    @OneToMany(mappedBy = "application", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Installment> installments;
}

