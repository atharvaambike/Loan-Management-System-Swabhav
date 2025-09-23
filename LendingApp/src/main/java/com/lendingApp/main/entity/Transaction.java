package com.lendingApp.main.entity;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    
    @ManyToOne
    @JoinColumn(name = "installment_id")
    private Installment installment;
    
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType; 
    
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;
    private String gatewayTransactionId;
    private LocalDateTime transactionDate;
}
