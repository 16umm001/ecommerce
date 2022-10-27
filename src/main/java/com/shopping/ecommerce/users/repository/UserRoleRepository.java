package com.shopping.ecommerce.users.repository;

import com.shopping.ecommerce.users.models.ERole;
import com.shopping.ecommerce.users.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRoleRepository extends JpaRepository<Roles, UUID> {
    Optional<Object> findByName(ERole roleUser);
}
