package com.example.JavaFullStackMarchBatch.onetomany.repository;

import com.example.JavaFullStackMarchBatch.onetomany.domain.SparePart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpareRepo extends JpaRepository<SparePart,Integer> {
}
