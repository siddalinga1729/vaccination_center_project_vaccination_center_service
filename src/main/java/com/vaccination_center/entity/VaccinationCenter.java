package com.vaccination_center.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.aspectj.weaver.tools.Trace;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationCenter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String vaccinationCenterName;
	private String centerAddress;
	@Column(unique = true)
	private long pincode;
	private Timestamp createdTime;
	private Timestamp updatedTime;
}
