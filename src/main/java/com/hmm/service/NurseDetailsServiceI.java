package com.hmm.service;

import java.util.List;

import com.hmm.model.NurseDetails;

public interface NurseDetailsServiceI {
	public NurseDetails addNurseDetails(NurseDetails nurseDetails);
	public List<NurseDetails>ShowNurseData();
	public NurseDetails updateNurseDetailsData(NurseDetails nurseDetails);
	public void daleteNurseDetailsData(int id);
}
