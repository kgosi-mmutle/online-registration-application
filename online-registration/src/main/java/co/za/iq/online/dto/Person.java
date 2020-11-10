package co.za.iq.online.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author 	Kgosi Mmutle
 * @version 1.0
 * 
 * This Class stores details of a Person's object	
 *
 */
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="id_number",unique=true)
	private int idNumber;
	private String pName;
	private String telephoneNumber;
	
	public String getName() {
		return pName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setName(String name) {
		this.pName = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public Person(String name, int idNumber, String telephoneNumber) {
		super();
		this.pName = name;
		this.idNumber = idNumber;
		this.telephoneNumber = telephoneNumber;
	}

	public Person() {
	}

}
