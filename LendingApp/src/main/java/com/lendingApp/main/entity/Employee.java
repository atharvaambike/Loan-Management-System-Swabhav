package com.lendingApp.main.entity;

import javax.persistence.*;

@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ManagerId;
    private String firstName;
    private String lastName;
    private String salary;
    private String designation;
    private String city;

    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "admin")
    private Admin admin; // Direct supervisor
}
