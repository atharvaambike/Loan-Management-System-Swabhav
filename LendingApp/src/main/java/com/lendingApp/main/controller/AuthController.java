package com.lendingApp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendingApp.main.dto.LoginRequestDto;
import com.lendingApp.main.dto.LoginResponseDto;
import com.lendingApp.main.dto.RegisterRequestDto;
import com.lendingApp.main.service.AuthService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@RequestBody RegisterRequestDto registerDto) {
        authService.register(registerDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> loginUser(@RequestBody LoginRequestDto loginDto) {
        LoginResponseDto response = authService.login(loginDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
