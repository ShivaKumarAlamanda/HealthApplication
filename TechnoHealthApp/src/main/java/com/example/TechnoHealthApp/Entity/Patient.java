package com.example.TechnoHealthApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="patient_details")
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
@Column(name="patient_name")
	private String patientName;
@Column(name="patient_contact")
	private String patientContact;
@Column(name="password")
private String password;
@ManyToOne
	private Doctor doctor;
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
public Patient(int patientId, String patientName, String patientContact, String password, Doctor doctor) {
	super();
	this.patientId = patientId;
	this.patientName = patientName;
	this.patientContact = patientContact;
	this.password = password;
	this.doctor = doctor;
}
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public String getPatientContact() {
	return patientContact;
}
public void setPatientContact(String patientContact) {
	this.patientContact = patientContact;
}
public Doctor getDoctor() {
	return doctor;
}
public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientContact=" + patientContact
			+ ", doctor=" + doctor + "]";
}

}
