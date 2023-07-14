package com.neelkanth.medicals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neelkanth.medicals.model.MedicineRecords;
import com.neelkanth.medicals.service.MedicineRecordService;

@RequestMapping
@RestController
@CrossOrigin
public class MedicineRecordController {

	@Autowired
	private MedicineRecordService medicineRecordService;
	
	@PostMapping("/medicine/create/")
	public ResponseEntity<MedicineRecords> createAnEntry(@RequestBody MedicineRecords medicineObject){
		return ResponseEntity.ok(medicineRecordService.saveRecord(medicineObject));
	}
	
	@GetMapping("/medicine/fetchAll/")
	public ResponseEntity<List<MedicineRecords>> fetchAll(){
		return ResponseEntity.ok(medicineRecordService.fetchAllMedicine());
	}
	
	@DeleteMapping("/medicine/remove/")
	public ResponseEntity<Void> removeObject(@RequestBody MedicineRecords medicineObject){
		return ResponseEntity.ok(medicineRecordService.deleteRecord(medicineObject));
	}
}
