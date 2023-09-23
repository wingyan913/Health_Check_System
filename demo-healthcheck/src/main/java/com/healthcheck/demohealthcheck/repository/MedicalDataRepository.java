package com.healthcheck.demohealthcheck.repository;

import org.springframework.stereotype.Repository;
import com.healthcheck.demohealthcheck.entity.EMedicalData;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MedicalDataRepository extends JpaRepository<EMedicalData, Long> {
    
}
