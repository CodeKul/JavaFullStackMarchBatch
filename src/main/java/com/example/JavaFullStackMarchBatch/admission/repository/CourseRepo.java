package com.example.JavaFullStackMarchBatch.admission.repository;

import com.example.JavaFullStackMarchBatch.admission.domain.CoursesAdm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<CoursesAdm,Integer> {
}
