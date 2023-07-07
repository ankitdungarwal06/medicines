package com.neelkanth.medicals.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neelkanth.medicals.model.MedicineRecords;
import com.neelkanth.medicals.repository.MedicineRepository;

@Service
public class MedicineRecordService {

	@Autowired
	private MedicineRepository medicineRepository;
	
	public List<MedicineRecords> fetchAllMedicine(){
		List<MedicineRecords> res = medicineRepository.findAll();
		System.out.println("res status "+res.size());
		//Stream.of(res).forEach(System.out::println);
		return res;
	}
	
	public MedicineRecords saveRecord(MedicineRecords medicineRecordObject) {
		return medicineRepository.save(medicineRecordObject);
	}
	
	public Void deleteRecord(MedicineRecords medicineRecordObject) {
		medicineRepository.delete(medicineRecordObject);
		Void v = null;
		return v;
	}
}
