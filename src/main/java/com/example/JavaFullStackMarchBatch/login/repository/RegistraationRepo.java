package com.example.JavaFullStackMarchBatch.login.repository;

import com.example.JavaFullStackMarchBatch.login.domain.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistraationRepo  extends JpaRepository<Registration,Integer> {
    Registration findByUserName(String userName);
}
