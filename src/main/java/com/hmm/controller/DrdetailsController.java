package com.hmm.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hmm.model.DrDetails;
import com.hmm.service.DrdetailsServiceI;

@RestController
@RequestMapping("/drdetails")
public class DrdetailsController {
	@Autowired
	private DrdetailsServiceI a;

	@PostMapping("/add")
	public void addDrdetails(@RequestBody DrDetails drDetails) {
		a.add(drDetails);
	}

	@GetMapping("/findAll")
	public List<DrDetails> show() {
		List<DrDetails> list = a.ShowDrDetailsData();
		return list;
	}

	@GetMapping("/edit/{id}")
	public DrDetails edit(@PathVariable int id) {
		DrDetails s2 = a.editDrDetails(id);
		return s2;

	}

	@PutMapping("update")
	public DrDetails update(@RequestBody DrDetails drDetails) {
		DrDetails s4 = a.updateDrDetails(drDetails);
		return s4;

	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		a.deleteDrDetails(id);
	}
	
	@GetMapping("ByfirstName/{name}")
	public List<DrDetails>searchByName(@PathVariable String name){
		List<DrDetails>shiva=a.findByName(name);
		shiva.forEach(e->System.out.println(e));
		return shiva;
	}
}
