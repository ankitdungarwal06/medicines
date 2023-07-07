package com.neelkanth.medicals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neelkanth.medicals.model.MedicineRecords;
import com.neelkanth.medicals.repository.MedicineRepository;

@Service
public class MedicineRecordService {

	@Autowired
	private MedicineRepository medicineRepository;
	
	public List<MedicineRecords> fetchAllMedicine(){
		return medicineRepository.findAll();
	}
	
	public MedicineRecords saveRecord(MedicineRecords medicineRecordObject) {
		return medicineRepository.save(medicineRecordObject);
	}
	
	public void deleteRecord(MedicineRecords medicineRecordObject) {
		medicineRepository.delete(medicineRecordObject);
	}
}
