// package com.lendingApp.main.entity;

// import java.util.List;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Entity
// @Getter
// @Setter
// @Table
// @NoArgsConstructor
// @AllArgsConstructor
// public class Loan {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long loanId;

//     private String loanName;
//     private Boolean isActive;
//     private Double interestRate;
//     private Integer tenure;

//     @ManyToOne
//     @JoinColumn(name = "loanscheme")
//     private LoanScheme loanscheme;

//     @ManyToOne
//     @JoinColumn(name = "installmentDurationId")
//     //private InstallmentDuration installmentDuration;

//     // Applications made for this loan
//     @OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, orphanRemoval = true)
//     private List<Application> applications;

//     // Installments after approval
//     //@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, orphanRemoval = true)
//     //private List<Installment> installments;
// }
