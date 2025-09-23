package com.lendingApp.main.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "documents")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor	
public class Document {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private UUID docId;
 private String docName;
 private String docURL;
 private LocalDateTime docUploadedAt;

 @ManyToOne
 @JoinColumn(name = "user_id")
 private User user;
}
