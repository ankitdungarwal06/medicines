package com.neelkanth.medicals.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicineRecords {

	@Id
	@GeneratedValue
	private Long id;
	private String medicineName;
	private String manufuactureDate;
	private String expiryDate;
	private boolean isGeneric;
	private boolean prescribedByDoctor;
	private String[] usedForIssue;
	private int sachetsBought;
	private int numbersBought;
	private MedicineType medicineType;
	private String boughtFromStoreName;
	private String boughtFromStoreAddress;
	private float priceOneQuantity;
	private float priceOneSachet;
	private String remarks;
	private String[] comments;
	private String col1;
	private String col2;
	private String col3;
	private String col4;
	private String col5;
	private String col6;
	private String col7;
	private String col8;
	private String col9;
	private String col10;
	private String col11;
	private String col12;
	
}

enum MedicineType{
	TABLET,CAPSULE,SYRUP,INJECTION,OTHERS
}
