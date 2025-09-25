package com.lendingApp.main.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class LoginRequestDto {

    @NotBlank
    @NotEmpty
    private String email;
    @NotBlank
    @NotEmpty
	private String password;
}
