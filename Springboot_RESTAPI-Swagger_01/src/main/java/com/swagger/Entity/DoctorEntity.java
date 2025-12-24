package com.swagger.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor_db")
public class DoctorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctor_id;
	private String name;
	private String contact;
	private String email;
	private String address;
	private String specialization;
	private String gender;
	
	public DoctorEntity() {
		super();
	}
	
	public DoctorEntity(int doctor_id, String name, String contact, String email, String address, String specialization,
			String gender) {
		super();
		this.doctor_id = doctor_id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.specialization = specialization;
		this.gender = gender;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "DoctorEntity [doctor_id=" + doctor_id + ", name=" + name + ", contact=" + contact + ", email=" + email
				+ ", address=" + address + ", specialization=" + specialization + ", gender=" + gender + "]";
	}
	
	

}
