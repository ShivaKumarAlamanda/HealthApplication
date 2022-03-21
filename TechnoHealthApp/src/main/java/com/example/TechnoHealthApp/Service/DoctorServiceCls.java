package com.example.TechnoHealthApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TechnoHealthApp.Entity.Doctor;
import com.example.TechnoHealthApp.Repo.DoctorRepo;
@Service
public class DoctorServiceCls implements DoctorServiceInter {
@Autowired
	private DoctorRepo repo;
boolean isInserted = false;
	@Override
	public boolean insertDoctor(Doctor doctor) {
		repo.save(doctor);
		isInserted=true;
		return isInserted;
	}

}
