package com.hmm.controller;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmm.model.StudentDetails;
import com.hmm.service.StudentDetailsServiceI;

@RestController
@RequestMapping("/studentdetails")
public class StudentDetailsController {
	@Autowired
	private StudentDetailsServiceI r;
	
	@PostMapping("/add")
	public void addStudentDetails(@RequestBody StudentDetails studentDetails) {
		r.addStudentDetails(studentDetails);
	}
	
	@GetMapping("/findAll/{id}")
	public List<StudentDetails>showStudentdata(@PathVariable int id){
		List<StudentDetails>list = r.ShowStudentDetailsData();
		return list;
	}
	
	@GetMapping("/edit/{id}")
	public StudentDetails editStudentData(@PathVariable int id) {
	StudentDetails q =	r.editStudentDetails(id);
		return q;
	}
	@PutMapping("/update")
	public StudentDetails updateStudentData(@RequestBody StudentDetails studentDetails) {
		StudentDetails x = r.updateStudentDetails(studentDetails);
		return x;
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		r.deleteStudentDetails(id);
	}
	
	}
	
	

