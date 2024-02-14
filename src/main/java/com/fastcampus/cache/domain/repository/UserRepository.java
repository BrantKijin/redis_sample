package com.fastcampus.cache.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastcampus.cache.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}