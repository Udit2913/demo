package com.umazon.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umazon.service.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}