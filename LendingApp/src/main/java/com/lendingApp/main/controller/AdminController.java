package com.lendingApp.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendingApp.main.dto.RoleDto;
import com.lendingApp.main.dto.RoleResponseDto;
import com.lendingApp.main.service.RoleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("loan-app/admin")
public class AdminController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/role")
    public ResponseEntity<RoleResponseDto> postMethodName(@RequestBody RoleDto roleDto) {
        return ResponseEntity.ok(roleService.addRole(roleDto));
    }
    
    @GetMapping("/role")
	public ResponseEntity<List<RoleResponseDto>> getRoles() {
		List<RoleResponseDto> roles = roleService.getAllRoles();
		return ResponseEntity.ok(roles);
	}
}