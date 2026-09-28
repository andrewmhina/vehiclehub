package com.vehiclehub.vehiclehub.repository;

import com.vehiclehub.vehiclehub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
