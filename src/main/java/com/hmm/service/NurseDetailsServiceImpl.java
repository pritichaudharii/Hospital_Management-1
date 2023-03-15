package com.hmm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmm.dao.NurseDetailsDaoI;
import com.hmm.model.NurseDetails;

@Service
public class NurseDetailsServiceImpl implements NurseDetailsServiceI {

	@Autowired
	private NurseDetailsDaoI n;

	

	@Override
	public List<NurseDetails> ShowNurseData() {
		List<NurseDetails>list = n.findAll();
		return list;
	}

	@Override
	public NurseDetails updateNurseDetailsData(NurseDetails nurseDetails) {
		NurseDetails nurse = n.save(nurseDetails);
		return nurse;
	}

	@Override
	public void daleteNurseDetailsData(int id) {
		n.deleteById(id);
	}

	@Override
	public NurseDetails addNurseDetails(NurseDetails nurseDetails) {
		n.save(nurseDetails);
		return null;
	}
	
}
