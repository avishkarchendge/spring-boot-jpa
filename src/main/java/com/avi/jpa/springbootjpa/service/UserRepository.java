package com.avi.jpa.springbootjpa.service;

import com.avi.jpa.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
