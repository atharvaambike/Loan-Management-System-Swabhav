package com.lendingApp.main.controller;

import com.lendingApp.main.entity.Application;
import com.lendingApp.main.entity.Employee;
import com.lendingApp.main.service.ApplicationService;
import com.lendingApp.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/loanapp/manager")
public class ManagerController {

    @Autowired
    private ApplicationService applicationService;

    @Autowired
    private EmployeeService employeeService;

    // // 1. View All Requested Loans
    // @GetMapping("/loans/requested")
    // public List<Application> getRequestedLoans(@RequestParam(required = false) String phone) {
    //     if (phone != null) {
    //         return applicationService.getRequestedLoansByPhone(phone);
    //     }
    //     return applicationService.getAllRequestedLoans();
    // }

    // 2. Approve Loan
    @PostMapping("/loans/{loanId}/approve")
    public Application approveLoan(@PathVariable UUID loanId) {
        return applicationService.approveLoan(loanId);
    }

    // 3. Reject Loan
    @PostMapping("/loans/{loanId}/reject")
    public Application rejectLoan(@PathVariable UUID loanId, @RequestParam(required = false) String reason) {
        return applicationService.rejectLoan(loanId, reason != null ? reason : "No reason provided");
    }

    // 4. View Manager (Employee) Profile
    @GetMapping("/profile/{managerId}")
    public Employee getManagerProfile(@PathVariable UUID managerId) {
        return employeeService.getEmployeeById(managerId);
    }

    // 5. Approve Customer KYC
    @PostMapping("/customers/{customerId}/kyc/approve")
    public String approveCustomerKyc(@PathVariable UUID customerId) {
        return "Customer KYC approved for ID: " + customerId;
    }

    // 6. Reject Customer KYC
    @PostMapping("/customers/{customerId}/kyc/reject")
    public String rejectCustomerKyc(@PathVariable UUID customerId) {
        return "Customer KYC rejected for ID: " + customerId;
    }
}
