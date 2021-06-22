package com.example.JavaFullStackMarchBatch.onetoone.repository;

import com.example.JavaFullStackMarchBatch.onetoone.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
