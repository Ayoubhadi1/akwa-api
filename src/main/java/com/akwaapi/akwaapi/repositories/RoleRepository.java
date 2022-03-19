package com.akwaapi.akwaapi.repositories;

import com.akwaapi.akwaapi.Entities.ERole;
import com.akwaapi.akwaapi.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
