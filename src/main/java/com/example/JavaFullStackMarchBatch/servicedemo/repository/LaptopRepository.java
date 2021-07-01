package com.example.JavaFullStackMarchBatch.servicedemo.repository;

import com.example.JavaFullStackMarchBatch.servicedemo.domain.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
