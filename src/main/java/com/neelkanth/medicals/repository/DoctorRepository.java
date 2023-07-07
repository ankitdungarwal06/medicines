package com.neelkanth.medicals.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neelkanth.medicals.model.DoctorInfo;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorInfo, Long> {

	List<DoctorInfo> findByfirstName(String name);
	
	List<DoctorInfo> findByspecialiti(String speciality);
}
