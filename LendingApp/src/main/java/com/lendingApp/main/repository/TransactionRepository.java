package com.lendingApp.main.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendingApp.main.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, UUID>  {

}
