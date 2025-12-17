package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.entity.User;

public class UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

}