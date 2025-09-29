package com.lendingApp.main.service;

import com.lendingApp.main.entity.Application;
import java.util.List;
import java.util.UUID;

public interface ApplicationService {
    // List<Application> getAllRequestedLoans();
    // List<Application> getRequestedLoansByPhone(String phoneNumber);
    Application approveLoan(UUID id);
    Application rejectLoan(UUID id, String reason);
}
