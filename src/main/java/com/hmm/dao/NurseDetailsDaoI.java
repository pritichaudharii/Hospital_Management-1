package com.hmm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hmm.model.NurseDetails;

@Repository
public interface NurseDetailsDaoI extends JpaRepository<NurseDetails, Integer> {

}
