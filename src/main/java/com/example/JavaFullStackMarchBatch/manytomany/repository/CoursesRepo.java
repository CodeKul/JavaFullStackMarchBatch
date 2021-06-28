package com.example.JavaFullStackMarchBatch.manytomany.repository;

import com.example.JavaFullStackMarchBatch.manytomany.domain.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses,Integer> {
}
