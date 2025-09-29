package com.lendingApp.main.service;

import java.util.UUID;

import com.lendingApp.main.entity.Employee;

public interface EmployeeService {

    Employee getEmployeeById(UUID managerId);

}
