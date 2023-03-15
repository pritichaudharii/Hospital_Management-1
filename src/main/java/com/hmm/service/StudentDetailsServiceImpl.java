package com.hmm.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hmm.dao.DrdetailsDaoI;
import com.hmm.dao.StudentDetailsDaoI;
import com.hmm.model.StudentDetails;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsServiceI {
@Autowired
private StudentDetailsDaoI s;
@Autowired
private DrdetailsDaoI dd;

@Override
public void addStudentDetails(StudentDetails studentDetails) {
	s.save(studentDetails);
}

@Override
public List<StudentDetails> ShowStudentDetailsData() {
	List<StudentDetails>list = s.findAll();
	return list;
}

@Override
public StudentDetails editStudentDetails(int id) {
	StudentDetails f = s.findById(id).get();
	return f;
}

@Override
public StudentDetails updateStudentDetails(StudentDetails studentDetails) {
	StudentDetails z = s.save(studentDetails);
	return z;
}

@Override
public void deleteStudentDetails(int id) {
	s.deleteById(id);
}


}
