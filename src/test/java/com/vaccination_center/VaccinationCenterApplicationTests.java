package com.vaccination_center;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vaccination_center.entity.VaccinationCenter;
import com.vaccination_center.repo.centerRepo;


@SpringBootTest
class CrudDemo01ApplicationTests {
	@Autowired
	private centerRepo centerRepo;

	@Test
	void saveVaccinationCenter() {
		VaccinationCenter v1 = new VaccinationCenter();
		v1.setId(1);
		v1.setVaccinationCenterName("Govt.Hospital");
		v1.setCenterAddress("hyderabad");
		v1.setPincode(560096);
		centerRepo.save(v1);
	}

	@Test
	void gatAllVaccinationCenters() {
		List<VaccinationCenter> findAll = centerRepo.findAll();
		for (VaccinationCenter vacc : findAll) {
			System.out.println(vacc.getId());
			System.out.println(vacc.getVaccinationCenterName());
			System.out.println(vacc.getCenterAddress());
			System.out.println(vacc.getPincode());
		}
	}

	@Test
	void deleteCitizenById() {
		centerRepo.deleteById(1);
	}

	@Test
	void getVaccinationCenterById() {
		Optional<VaccinationCenter> findById = centerRepo.findById(1);
		VaccinationCenter vcc = findById.get();
		System.out.println(vcc.getId());
		System.out.println(vcc.getVaccinationCenterName());
		System.out.println(vcc.getCenterAddress());
		System.out.println(vcc.getPincode());
		System.out.println(vcc.getCreatedTime());
		System.out.println(vcc.getUpdatedTime());
	}

	@Test
	void updateVaccinationCenter() {
		Optional<VaccinationCenter> findById = centerRepo.findById(1);
		VaccinationCenter vacc = findById.get();
		vacc.setPincode(560066);;
		centerRepo.save(vacc);
	}

}
