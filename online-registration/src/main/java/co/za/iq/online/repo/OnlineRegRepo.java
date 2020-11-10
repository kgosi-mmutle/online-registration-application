package co.za.iq.online.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.za.iq.online.dto.Person;

/**
 * 
 * @author 	Kgosi Mmutle
 * @version 1.0
 * 
 * This is the Online Registration Repository
 *
 */
public interface OnlineRegRepo extends JpaRepository<Person, Integer> {
 
}
