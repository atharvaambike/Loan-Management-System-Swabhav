package com.lendingApp.main.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class RegisterRequestDto {

    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private String password;
    private String gender;
    private AddressDto address;

}
