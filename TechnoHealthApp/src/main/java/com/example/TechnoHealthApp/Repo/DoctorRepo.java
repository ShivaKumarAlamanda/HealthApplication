package com.example.TechnoHealthApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TechnoHealthApp.Entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer>{

}
