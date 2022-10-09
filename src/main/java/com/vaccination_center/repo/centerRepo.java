package com.vaccination_center.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vaccination_center.DTO.Citizen;
import com.vaccination_center.entity.VaccinationCenter;

public interface centerRepo extends JpaRepository<VaccinationCenter, Integer> {

	@Query("SELECT v FROM VaccinationCenter v WHERE " +
            "v.vaccinationCenterName LIKE CONCAT('%',:query, '%')" +
            "Or v.pincode LIKE CONCAT('%', :query, '%')")
	    List<VaccinationCenter> searchVaccinationCenter(String query);

	//List<VaccinationCenter> findByVaccinationCenterId(Integer id);



}
