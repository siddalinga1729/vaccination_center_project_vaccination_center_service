package com.vaccination_center.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccination_center.entity.VaccinationCenter;
import com.vaccination_center.repo.centerRepo;

@Service
public class VaccinationCenterServiceImpl implements VaccinationCenterService {
	@Autowired
	centerRepo centerRepo;

	@Override
	public List<VaccinationCenter> getAll() {
		List<VaccinationCenter> findAll = centerRepo.findAll();
		return findAll;
	}

	@Override
	public List<VaccinationCenter> getByKeyword(String query) {
		return centerRepo.searchVaccinationCenter(query);
	}

	@Override
	public void deleteById(Integer id) {
		centerRepo.deleteById(id);		
	}

}
