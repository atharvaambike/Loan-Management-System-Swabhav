package com.lendingApp.main.service;

import com.lendingApp.main.dto.LoginRequestDto;
import com.lendingApp.main.dto.LoginResponseDto;
import com.lendingApp.main.dto.RegisterRequestDto;

public interface AuthService {

    void register(RegisterRequestDto registerReq);

	LoginResponseDto login(LoginRequestDto loginReq);
}
