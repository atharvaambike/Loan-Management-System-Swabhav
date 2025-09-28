package com.lendingApp.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendingApp.main.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
    public Optional<Role> findByRoleName(String role);
}
