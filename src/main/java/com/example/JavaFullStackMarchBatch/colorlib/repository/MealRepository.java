package com.example.JavaFullStackMarchBatch.colorlib.repository;

import com.example.JavaFullStackMarchBatch.colorlib.domain.MealPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<MealPreference,Integer> {
}
