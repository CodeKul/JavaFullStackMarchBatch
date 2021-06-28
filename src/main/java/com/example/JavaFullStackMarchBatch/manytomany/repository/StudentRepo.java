package com.example.JavaFullStackMarchBatch.manytomany.repository;

import com.example.JavaFullStackMarchBatch.manytomany.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
