package com.excel.lms.entity;

import java.time.LocalDate;

import com.excel.lms.enums.EducationType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class EmployeeEducationInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;
	
	@Enumerated(EnumType.STRING)
	private EducationType educationType;
	private LocalDate yearOfPassing;
	private Double percentage;
	private String universityName;
	private String instituteName;
	private String specialization;
	private String state;
	
	@ManyToOne
	private EmployeePrimaryInfo employeePrimaryInfo;
}