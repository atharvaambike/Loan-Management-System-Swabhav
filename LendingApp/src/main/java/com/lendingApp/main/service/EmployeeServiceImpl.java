package com.lendingApp.main.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.lendingApp.main.entity.Employee;

@Service
// @RequiredArgsConstructor
// @Data
public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public Employee getEmployeeById(UUID managerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeeById'");
    }

}
