package com.lendingApp.main.service;

import com.lendingApp.main.entity.Application;
import com.lendingApp.main.repository.ApplicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    // @Override
    // public List<Application> getAllRequestedLoans() {
    //     return applicationRepository.findByStatus("PENDING");
    // }

    // @Override
    // public List<Application> getRequestedLoansByPhone(String phoneNumber) {
    //     return applicationRepository.findByCustomer_PhoneNumberAndStatus(phoneNumber, "PENDING");
    // }

    @Override
    public Application approveLoan(UUID id) {
        Application app = (Application) applicationRepository.findById(id).orElseThrow();
        app.setStatus("APPROVED");
        app.setUpdatedAt(LocalDateTime.now());
        return (Application) applicationRepository.save(app);
    }

    @Override
    public Application rejectLoan(UUID id, String reason) {
        Application app = (Application) applicationRepository.findById(id).orElseThrow();
        app.setStatus("REJECTED");
        app.setUpdatedAt(LocalDateTime.now());
        return (Application) applicationRepository.save(app);
    }
}
