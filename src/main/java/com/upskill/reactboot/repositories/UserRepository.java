package com.upskill.reactboot.repositories;

import com.upskill.reactboot.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}