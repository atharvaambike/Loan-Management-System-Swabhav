package com.lendingApp.main.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalIndentityInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String aadharCard;
    private String panCard;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
