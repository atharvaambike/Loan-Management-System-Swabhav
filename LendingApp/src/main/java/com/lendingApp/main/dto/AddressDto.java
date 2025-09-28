package com.lendingApp.main.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class AddressDto {

    private String street;
    private String area;
    private String city;
    private String pincode;
}
