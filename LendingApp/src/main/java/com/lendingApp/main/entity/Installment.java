package com.lendingApp.main.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Installment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID installmentId;
    private UUID loanId;
    private UUID customerId;
    private Double instAmt;
    private LocalDate instStartDate;
    private LocalDate instEndDate;
    private Boolean isPaid;
    private LocalDate paidDate;
    private Double fineAmt;
}
