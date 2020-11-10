package co.za.iq.online.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.za.iq.online.dto.Person;
import co.za.iq.online.services.OnlineRegService;

/**
 * 
 * @author Kgosi Mmutle
 * @version 1.0
 * 
 *          This is the Online Registration Controller
 *
 */
@RestController
public class OnlineRegistrationController {

	@Autowired
	private OnlineRegService service;

	@PostMapping("/addperson")
	@CrossOrigin(origins = "http://localhost:4200")
	// This method adds Person data to the database
	public Person savePerson(@RequestBody Person person) {
		return service.savePerson(person);
	}

	@GetMapping("/getpersonlist")
	@CrossOrigin(origins = "http://localhost:4200")
	// This method fetches Person data from the database
	public List<Person> getPersonList() {
		List<Person> persons = new ArrayList<Person>();
		persons = service.getPersonList();
		return persons;
	}

}
