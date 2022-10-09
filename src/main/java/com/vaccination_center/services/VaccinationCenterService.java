package com.vaccination_center.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vaccination_center.entity.VaccinationCenter;

@Service
public interface VaccinationCenterService {
	
public List<VaccinationCenter> getAll();
public List<VaccinationCenter> getByKeyword(String query);
public void deleteById(Integer id);

}
