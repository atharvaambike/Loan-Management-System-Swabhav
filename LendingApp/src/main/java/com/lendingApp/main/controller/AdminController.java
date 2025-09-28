package com.lendingApp.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendingApp.main.dto.LoanResponseDto;
import com.lendingApp.main.dto.LoanSchemeDto;
import com.lendingApp.main.dto.RoleDto;
import com.lendingApp.main.dto.RoleResponseDto;
import com.lendingApp.main.service.LoanSchemeService;
import com.lendingApp.main.service.RoleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("loan-app/admin")
public class AdminController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private LoanSchemeService loanSchemeService;

    @PostMapping("/role")
    public ResponseEntity<RoleResponseDto> postMethodName(@RequestBody RoleDto roleDto) {
        return ResponseEntity.ok(roleService.addRole(roleDto));
    }
    
    @GetMapping("/role")
	public ResponseEntity<List<RoleResponseDto>> getRoles() {
		List<RoleResponseDto> roles = roleService.getAllRoles();
		return ResponseEntity.ok(roles);
	}

    @PostMapping("/loans")
    public ResponseEntity<LoanResponseDto> addLoanScheme(@RequestBody LoanSchemeDto loanSchemeDto) {
        return ResponseEntity.ok(loanSchemeService.addLoanScheme(loanSchemeDto));
    }

    @GetMapping("/loans/{loanId}")
    public ResponseEntity<LoanResponseDto> getLoandByID(@PathVariable Long loanSchemeId) {
        return ResponseEntity.ok(loanSchemeService.findLoandById(loanSchemeId));
    }
    
    @GetMapping("/loans")
    public ResponseEntity<List<LoanResponseDto>> getAllLoanScheme() {
        return ResponseEntity.ok(loanSchemeService.getAllLoans());
    }

    @GetMapping("/loans")
    public ResponseEntity<List<LoanResponseDto>> getLoanSchemeByLoanType(@RequestParam String laonType) {
        return ResponseEntity.ok(loanSchemeService.findLoanByLoanType(laonType));
    }
}