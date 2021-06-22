package com.example.JavaFullStackMarchBatch.onetoone.repository;

import com.example.JavaFullStackMarchBatch.onetoone.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
