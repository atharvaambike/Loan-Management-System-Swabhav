package com.lendingApp.main.service;

import java.time.LocalDate;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.lendingApp.main.dto.LoginRequestDto;
import com.lendingApp.main.dto.LoginResponseDto;
import com.lendingApp.main.dto.RegisterRequestDto;
import com.lendingApp.main.entity.User;
import com.lendingApp.main.exception.UserNotFoundException;
import com.lendingApp.main.repository.UserRepository;
import com.lendingApp.main.security.JwtTokenProvider;

public class AuthServiceImpl implements AuthService {

    @Autowired
    UserRepository userRepo;
    @Autowired
    ModelMapper mapper;
    @Autowired
	private PasswordEncoder passwordEncoder;
    @Autowired
	private AuthenticationManager authenticationManager;
    @Autowired
	private JwtTokenProvider tokenProvider;

    @Override
    public void register(RegisterRequestDto registerReq) {
        try {
			// Example business check
			if (userRepo.existsByEmail(registerReq.getEmail())) {
				throw new UserNotFoundException("User with this email already exists");
			}

			User user = mapper.map(registerReq, User.class);
			user.setPassword(passwordEncoder.encode(registerReq.getPassword()));
			user.setCreatedAt(LocalDate.now());
			userRepo.save(user);

		} catch (UserNotFoundException e) {
			// Handle or log your custom error here, e.g.:
			System.out.println("Registration failed: " + e.getMessage());
			throw e;
		}
    }

    @Override
    public LoginResponseDto login(LoginRequestDto loginReq) {
        	try {
            User user = userRepo.findByEmail(loginReq.getEmail()).orElseThrow(() -> new UserNotFoundException("User not found"));
			Authentication authentication = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(loginReq.getEmail(), loginReq.getPassword()));

			SecurityContextHolder.getContext().setAuthentication(authentication);
			String token = tokenProvider.generateToken(authentication);
			LoginResponseDto response = new LoginResponseDto();
            response.setToken(token);
            response.setRole(user.getRole().getRoleName());
            response.setUserId(user.getUserId());
            return response;
		} catch (BadCredentialsException e) {
			throw new UserNotFoundException("Username or password not found");
		}
        
    }

}
