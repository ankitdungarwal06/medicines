package com.neelkanth.medicals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neelkanth.medicals.model.MedicineRecords;

@Repository
public interface MedicineRepository extends JpaRepository<MedicineRecords, Long> {

}
