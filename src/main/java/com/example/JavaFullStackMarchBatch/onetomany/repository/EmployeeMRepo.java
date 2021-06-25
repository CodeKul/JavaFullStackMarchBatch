package com.example.JavaFullStackMarchBatch.onetomany.repository;

import com.example.JavaFullStackMarchBatch.onetomany.domain.EmployeeM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeMRepo extends JpaRepository<EmployeeM,Integer> {
}
