package co.za.iq.online.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.za.iq.online.dto.Person;
import co.za.iq.online.repo.OnlineRegRepo;

/**
 * 
 * @author Kgosi Mmutle
 * @version 1.0
 * 
 *          This is the Online Registration Service
 *
 */
@Service
public class OnlineRegService {

	@Autowired
	private OnlineRegRepo onlineRegRepo;

	public Person savePerson(Person person) {
		return onlineRegRepo.save(person);
	}
	
	public List<Person> getPersonList() {
		return onlineRegRepo.findAll();
	}

}
