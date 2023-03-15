package com.hmm.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hmm.model.DrDetails;

@Repository
public interface DrdetailsDaoI extends JpaRepository<DrDetails, Integer> {
	List<DrDetails> findByfirstName(String Name);
	

}
