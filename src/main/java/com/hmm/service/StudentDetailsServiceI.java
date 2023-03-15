package com.hmm.service;

import java.util.List;
import com.hmm.model.StudentDetails;

public interface StudentDetailsServiceI {
	public void addStudentDetails(StudentDetails studentDetails);
	public List<StudentDetails>ShowStudentDetailsData();
	public StudentDetails editStudentDetails(int id);
	public StudentDetails updateStudentDetails(StudentDetails studentDetails);
	public void deleteStudentDetails(int id);
	
}
