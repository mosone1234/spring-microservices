package com.testproject.user.repository;

import com.testproject.user.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
