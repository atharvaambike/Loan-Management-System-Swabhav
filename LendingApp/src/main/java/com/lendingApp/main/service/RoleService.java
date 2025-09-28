package com.lendingApp.main.service;

import java.util.List;

import com.lendingApp.main.dto.RoleDto;
import com.lendingApp.main.dto.RoleResponseDto;

public interface RoleService {
    RoleResponseDto addRole(RoleDto role);
    List<RoleResponseDto> getAllRoles();
}
