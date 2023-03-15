package com.hmm.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hmm.model.NurseDetails;
import com.hmm.service.NurseDetailsServiceI;

@RestController
@RequestMapping("/nursedetails")
public class NurseDetailsController {
	
	@Autowired
	private NurseDetailsServiceI z;
	
	@PostMapping("/nursedetails")
	public ResponseEntity<?> addNurseDetails(@RequestBody NurseDetails nurseDetails){
		NurseDetails y = z.addNurseDetails(nurseDetails);
		return new ResponseEntity<>(y,HttpStatus.CREATED);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<?>showNurseDetails(@PathVariable int id){
		List<NurseDetails>list = z.ShowNurseData();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?>updateNurseDetails(@RequestBody NurseDetails nurseDetails){
		NurseDetails x = z.updateNurseDetailsData(nurseDetails);
		return new ResponseEntity<>(x,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?>deleteNurseDetails(@PathVariable int id){
		z.daleteNurseDetailsData(id);
		return new ResponseEntity<>(z,HttpStatus.OK);
	}
}

