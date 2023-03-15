package com.hmm.service;
import java.util.List;
import com.hmm.model.DrDetails;

public interface DrdetailsServiceI {
	public void add(DrDetails drDetails);
	public List<DrDetails>ShowDrDetailsData();
	public DrDetails editDrDetails(int id);
	public DrDetails updateDrDetails(DrDetails drDetails);
	public void deleteDrDetails(int id);
	 public List<DrDetails>findByName(String name);
}