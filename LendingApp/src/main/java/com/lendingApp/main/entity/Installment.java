package com.lendingApp.main.entity;

import javax.persistence.*;

@Entity
public class InstallmentDuration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long durationId;
    private String durationType;
    private Double rateOfInterest;
}
