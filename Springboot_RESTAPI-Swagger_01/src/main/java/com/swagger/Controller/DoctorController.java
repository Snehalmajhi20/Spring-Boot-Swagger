package com.swagger.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.Entity.DoctorEntity;
import com.swagger.Service.DoctorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(
		name = "DoctorController",
		description = "This controller part of doctor db and here we do crud operations"
		)
public class DoctorController {
	
	@Autowired
	private DoctorService docservice;
	
	@Operation(
			summary = "POST operations on Doctor db",
			description = "here in this operations we can do only save the data into database"
			)
	@PostMapping("/save")
	public ResponseEntity<?> docsave(@RequestBody DoctorEntity docentity){
		DoctorEntity t1 = docservice.docsave(docentity);
		if(ObjectUtils.isEmpty(t1)) {
			return new ResponseEntity<>("Doctor_db is not saved! ",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>(t1, HttpStatus.CREATED);
		}
	}
	
	@Operation(
			summary = "GET operations on Doctor db",
			description = "here in this operations we can get the data from database"
			)
	@GetMapping("/list")
	public ResponseEntity<?> doclist(){
		List<DoctorEntity> t2 = docservice.getDoclist();
		return new ResponseEntity<>(t2, HttpStatus.OK);
	}
	
	@Operation(
			summary = "PUT operations on Doctor db",
			description = "here in this operations we can update the data from database"
			)
	@PutMapping("/update")
	public ResponseEntity<?> docupdate(@RequestBody DoctorEntity docentity){
		DoctorEntity t3 = docservice.docupdate(docentity);
		if(ObjectUtils.isEmpty(t3)) {
			return new ResponseEntity<>("Doctor_db failed to Update", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>(t3, HttpStatus.OK);
		}
	}
	
	@Operation(
			summary = "DELETE operations on Doctor db",
			description = "here in this operations we can delete the data from database"
			)
	@DeleteMapping("/delete/{doctor_id}")
	public ResponseEntity<?> docdelete(@PathVariable Integer doctor_id){
		DoctorEntity t4 = docservice.docdelete(doctor_id);
		if(ObjectUtils.isEmpty(t4)) {
			return new ResponseEntity<>("Doctor_ID is not found!", HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>("Doctor_id with details deleted successfully!", HttpStatus.OK);
		}
	}

}
