package com.shopping.ecommerce.users.repository;

import com.shopping.ecommerce.users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserAuthRepository extends JpaRepository<User, UUID> {


    Optional<User> findByusername(String username);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
