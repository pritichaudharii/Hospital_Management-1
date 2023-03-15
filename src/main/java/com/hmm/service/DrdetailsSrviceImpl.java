package com.hmm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmm.dao.DrdetailsDaoI;
import com.hmm.model.DrDetails;

@Service
public class DrdetailsSrviceImpl implements DrdetailsServiceI {

	@Autowired
	private DrdetailsDaoI d;

	

	@Override
	public void add(DrDetails drDetails) {
		d.save(drDetails);

	}

	@Override
	public List<DrDetails> ShowDrDetailsData() {
		List<DrDetails> list = d.findAll();
		return list;
	}

	@Override
	public DrDetails editDrDetails(int id) {
		DrDetails e = d.findById(id).get();
		return e;
	}

	@Override
	public DrDetails updateDrDetails(DrDetails drDetails) {
		DrDetails b = d.save(drDetails);
		return b;
	}

	@Override
	public void deleteDrDetails(int id) {
		d.deleteById(id);

	}
	@Override
	public List<DrDetails> findByName(String name) {
		// TODO Auto-generated method stub
		List<DrDetails>list=d.findByfirstName(name);
		list .forEach(e->System.out.println(e));
		return list;
		
	}

	

}
