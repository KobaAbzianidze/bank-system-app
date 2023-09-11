package com.bank.banksystemapp.repository;

import com.bank.banksystemapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);
}
