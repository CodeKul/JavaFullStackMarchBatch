package com.example.JavaFullStackMarchBatch.onetomany.repository;

import com.example.JavaFullStackMarchBatch.onetomany.domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepo extends JpaRepository<Manager,Integer> {
}
