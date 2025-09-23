package com.lendingApp.main.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID customerId;

//    @OneToMany(mappedBy = "customer")
//    private List<Application> applications;
//
//    @OneToMany
//    private List<Documents> documents;
//
//    @OneToMany
//    private List<Installment> installments;
}