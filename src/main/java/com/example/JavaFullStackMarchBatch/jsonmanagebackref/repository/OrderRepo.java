package com.example.JavaFullStackMarchBatch.jsonmanagebackref.repository;

import com.example.JavaFullStackMarchBatch.jsonmanagebackref.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders,Integer> {
}
