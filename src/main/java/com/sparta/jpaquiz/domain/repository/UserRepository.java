package com.sparta.jpaquiz.domain.repository;

import com.sparta.jpaquiz.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
