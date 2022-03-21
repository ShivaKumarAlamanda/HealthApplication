package com.example.TechnoHealthApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.TechnoHealthApp.Entity.Doctor;
import com.example.TechnoHealthApp.Service.DoctorServiceInter;


@Controller
public class DoctorController {
@Autowired
	private DoctorServiceInter service;
	
@GetMapping("/insert")
public String insert() {
	return "fbloginpage";
}
@PostMapping("/registration")
public String insertDoctorData(ModelMap map, Doctor doctor ) {
	if(service.insertDoctor(doctor)) {
	map.addAttribute("msg","SignUp Successfull below Are Your Details");
	map.addAttribute("object", doctor);
	}else {
		map.addAttribute("msg", "SignUp Unsuccessfull Check your Credentials");
	}
	return "RegistrationResp" ;		
}
	
}
