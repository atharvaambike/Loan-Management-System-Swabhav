package com.lendingApp.main.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendingApp.main.entity.Application;

public interface ApplicationRepository<Application> extends JpaRepository<Application, UUID> {
    List<Application> findByStatus(String status);
    List<Application> findByCustomer_PhoneNumberAndStatus(String phoneNumber, String status);
}

