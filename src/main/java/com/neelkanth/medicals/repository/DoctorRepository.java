package com.neelkanth.medicals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neelkanth.medicals.model.DoctorInfo;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorInfo, Long> {

}
