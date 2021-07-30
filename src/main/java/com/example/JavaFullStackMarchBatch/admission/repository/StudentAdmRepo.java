package com.example.JavaFullStackMarchBatch.admission.repository;

import com.example.JavaFullStackMarchBatch.admission.domain.StudentAdm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAdmRepo extends JpaRepository<StudentAdm,Integer> {
}
