package com.neelkanth.medicals.model;

import java.io.Serializable;

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
public class DoctorInfo implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String[] phoneNumbersOfficial;
	private String[] phoneNumbersPersonal;
	private String addressResidential;
	private String addressChamber;
	private String[] hospitalAddresses;
	private String reference;
	private String startedFrom;
	private String notes;
	private String remarks;
	private String[] speciality;
	private String cityOfPractice;
	private String stateOfPractice;
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
