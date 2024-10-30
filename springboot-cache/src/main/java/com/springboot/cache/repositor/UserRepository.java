package com.springboot.cache.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.cache.entity.User;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // You can add custom query methods if needed
}
