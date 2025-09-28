package com.lendingApp.main.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "installment_duration")
public class InstallmentDuration {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID durationId;
    private String durationType;
    private Double rateOfIntrest;
}
