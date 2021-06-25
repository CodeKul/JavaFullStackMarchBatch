package com.example.JavaFullStackMarchBatch.onetomany.repository;

import com.example.JavaFullStackMarchBatch.onetomany.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,Integer> {
}
