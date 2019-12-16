package com.cognizant.vehiclereservationsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.vehiclereservationsystem.model.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

	Role findById(int i);
}
