package com.hmm.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.hmm.model.StudentDetails;

public interface StudentDetailsDaoI extends JpaRepository<StudentDetails, Integer> {
	
}
