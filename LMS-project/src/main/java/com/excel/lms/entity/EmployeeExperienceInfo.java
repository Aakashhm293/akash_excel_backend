package com.excel.lms.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_experience")
public class EmployeeExperienceInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer experienceId;
	private String companyName;
	private Double yearsOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRelieving;
	private String designation;
	private String location;
	
	@ManyToOne
	private EmployeePrimaryInfo employeePrimaryInfo;
}
