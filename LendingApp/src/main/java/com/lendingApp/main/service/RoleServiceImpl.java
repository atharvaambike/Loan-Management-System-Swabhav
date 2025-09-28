package com.lendingApp.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lendingApp.main.dto.RoleDto;
import com.lendingApp.main.dto.RoleResponseDto;
import com.lendingApp.main.entity.Role;
import com.lendingApp.main.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private ModelMapper mapper;
    @Override
    public RoleResponseDto addRole(RoleDto roledto) {
        Role role = mapper.map(roledto, Role.class);
        return mapper.map(roleRepository.save(role),RoleResponseDto.class);
    }
    @Override
    public List<RoleResponseDto> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
		List<RoleResponseDto> rolesResponseDtos = new ArrayList<>();
		for(Role role:roles) {
			rolesResponseDtos.add(mapper.map(role,RoleResponseDto.class));
		}
		return rolesResponseDtos;
    }
}
