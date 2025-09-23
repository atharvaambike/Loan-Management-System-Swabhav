package com.lendingApp.main.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Installment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long installmentId;

  

    private Double installmentAmt;
    private LocalDate instStartDate;
    private LocalDate instEndDate;
    private Boolean isPaid;
    private LocalDate paymentDate;
    private Double fineAmount;

    @ManyToOne
    @JoinColumn(name = "loanId")
    private Loans loan;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
}
